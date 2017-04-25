package Java8;

/**
 * Created by Pawl on 3/22/2017.
 */
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Person [" + this.name + ", " + this.age + "]";
    }
}
