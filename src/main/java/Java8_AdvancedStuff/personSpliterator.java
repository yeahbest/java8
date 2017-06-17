package Java8_AdvancedStuff;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Krzysiek on 2017-04-12.
 */
public class personSpliterator implements Spliterator<Person> {
    private final Spliterator<String> lineSpliterator;
    private String name;
    private int age;
    private String city;

    public personSpliterator(Spliterator<String> spliterator01) {
    this.lineSpliterator = spliterator01;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {
       if( this.lineSpliterator.tryAdvance(line->this.name=line)&&
        this.lineSpliterator.tryAdvance(line->this.age=Integer.parseInt(line))&&
        this.lineSpliterator.tryAdvance(line->this.city=line)){


        Person p = new Person(name,age,city);
        action.accept(p);
        return  true;
       } else
            return false;
    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize()/3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
