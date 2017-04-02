import com.intellij.psi.search.PsiReferenceProcessor;
import com.siyeh.ig.psiutils.CollectionUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Krzysiek on 2017-04-01.
 */
public class ComparatorTest {

    public static void main(String... args) {

        List<Developers> devList;
        List<Developers> devListt;

        devList = getListOfThem();
        devListt =getListOfThem2();
//        System.out.println("Before sorting: ");
//        devList.forEach(System.out::println);
//        Comparator<Developers>cmparatoro=(s1,s2)->(s1.getAge()-s2.getAge());
//       // Collections.sort(devList,comparator);
//        System.out.println("sort by name");
//        devList.forEach(System.out::println);
//
//        System.out.println("sort by name");
//        devList.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
//        devList.forEach(System.out::println);
//
//        Function<Developers,Integer>f1 = Comparator.comparing(cmparatoro);


        //test method

       sorting(devList);
        System.out.println(devList);
       sorting(devListt);
        System.out.println(devListt);
        System.out.println(devList.equals(devListt));

        System.out.println("first function");
        Function<Developers,Integer>f1 = p->p.getAge();
    }

    public static void sorting(List<Developers>sort){
        sort.sort((s1,s2)->s1.getAge()-s2.getAge());
    }

    public static List<Developers> getListOfThem() {
        List<Developers> listt = new ArrayList<>();
        listt.add(new Developers("Mike", 25));
        listt.add(new Developers("John", 33));
        listt.add(new Developers("Slavek", 48));
        listt.add(new Developers("Pawel", 15));
        listt.add(new Developers("MJerry", 66));
        listt.add(new Developers("White", 35));
        return listt;
    }
    public static List<Developers> getListOfThem2() {
        List<Developers> listt = new ArrayList<>();
        listt.add(new Developers("Mike", 25));
        listt.add(new Developers("John", 33));
        listt.add(new Developers("Slavek", 48));
        listt.add(new Developers("Pawel", 15));
        listt.add(new Developers("MJerry", 66));
        listt.add(new Developers("White", 35));
        return listt;
    }

    private static class Developers {
        private int age;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Developers that = (Developers) o;

            if (age != that.age) return false;
            return name != null ? name.equals(that.name) : that.name == null;

        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        private String name;

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        public Developers() {
        }

        public Developers(String name, int age) {
            this.name = name;
            this.age = age;
        }
   @Override
   public String toString(){
   return "Developer Name: "+getName() +"Age "+getAge();
   }

    }
}


