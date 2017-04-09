package JavaCollections;

import Java8.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Pawl on 4/3/2017.
 */
public class Check {

    public static void main(String... args) {

//        Predicate<String>pr=p->p.length()<20;
//        Predicate<String>p2=s->s.length()>5;
//
//
//        Predicate<String >p3=pr.and(p2);
//
//        boolean p = pr.test("something ");
//        System.out.println("predictae is less than 20 "+p);
//
//        List<String>lista = new ArrayList<>();
//        lista.add("kotel");
//        lista.add("piesel");
//
//       // lista.replaceAll(sd->sd.toUpperCase());
//        lista.replaceAll(String::toUpperCase);
//        lista.forEach(System.out::println);

        Person p1 = new Person("Mike", 25);
        Person p2 = new Person("John", 33);
        Person p3 = new Person("Slavek", 48);
        Person p4 = new Person("Pawel", 15);
        Person p5 = new Person("MJerry", 66);
        Person p6 = new Person("White", 35);

        List<Person>list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

        list.forEach(System.out::println);
        list.removeIf(ps->ps.getAge()<25);
        System.out.println("after removal");
        list.forEach(System.out::println);
        System.out.println("Trasformation");
        list.replaceAll(p->new Person(p.getName().toUpperCase(),p.getAge()-5));
        System.out.println("After replacement");
        list.forEach(System.out::println);
        list.sort((s1,s2)->s1.getAge()-s2.getAge());
        System.out.println("after sorting");
        list.forEach(System.out::println);
        list.sort((s1,s2)->s1.getAge()-s2.getAge());
        list.sort(Comparator.comparing(Person::getAge));
        list.sort(Comparator.comparing(Person::getName).reversed());

        List<String >sd = Arrays.asList("okkok");
        sd.stream().map(value-> {
            char ss = value.toUpperCase().charAt(0);
            return ss;
                }
        );
        sd.forEach(System.out::println);




    }
}
