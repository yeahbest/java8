package JavaCollections;
import Java8.Person;

import java.util.*;

/**
 * Created by Pawl on 4/5/2017.
 */
public class Mapping {
    public static void main(String... args) {

        Person p1 = new Person("Mike", 25);
        Person p2 = new Person("John", 33);
        Person p3 = new Person("Slavek", 48);
        Person p4 = new Person("Pawel", 15);
        Person p5 = new Person("MJerry", 66);
        Person p6 = new Person("White", 35);

        List<Person> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

    City newYork = new City("New York");
    City london = new City("London");
    City paris = new City("Paris");
        Map<City, List<Person>>cityListMap= new HashMap<>();

        cityListMap.putIfAbsent(paris, new ArrayList<>());
        cityListMap.get(paris).add(p1);

   //     System.out.println("people of the list = "+cityListMap.get(paris));

        cityListMap.computeIfAbsent(newYork, city -> new ArrayList<Person>()).add(p2);
        cityListMap.computeIfAbsent(newYork,ss->new ArrayList<Person>()).add(p3);
        cityListMap.computeIfAbsent(newYork,ss->new ArrayList<Person>()).add(p4);
        cityListMap.forEach((c,s)->System.out.println(c+" - "+s));

        HashMap<City, List<Person>>map2 = new HashMap<>();
        map2.computeIfAbsent(london, city -> new ArrayList<Person>()).add(p5);
        map2.computeIfAbsent(london, city -> new ArrayList<Person>()).add(p6);
        map2.computeIfAbsent(london, city -> new ArrayList<Person>()).add(p1);

        map2.forEach((city, pesd)->System.out.println(city + " " + pesd));

        cityListMap.forEach(
                ((city, persons) ->
                map2.merge(city,persons,
                        (pfrom1map,peoplefrom2)->{
                            pfrom1map.addAll(peoplefrom2);
                            return pfrom1map;
                        }
                        )
                )

        );

        cityListMap.forEach((pf,pc)->
        map2.merge(pf,pc,(existing,nonexistiong)->
                {
                    existing.addAll(nonexistiong);
                    return existing;
                }
        )
        );
        System.out.println("LAST");
        map2.forEach((g,l)->System.out.println(g+" "+l));

    }
}
