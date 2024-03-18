package org.example.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FunctionalMe {


    public void example(){
        List<Person> people = new ArrayList<>(List.of(new Person("Ada",23), new Person("Kuba",22),new Person("Adrian",23)));
        Comparator<Person> byNameLength = (Person x, Person y) -> {
            return Integer.compare(y.getName().length(), x.getName().length());
        };

        people.sort( byNameLength);
//        System.out.println(people.stream().filter(person -> person.getAge() > 30).findAny().orElseThrow(() -> new RuntimeException("not found")).toString());
        people.forEach(System.out::println);
    }

    public void example2(){
        Function<Integer,Integer> testMe = x -> x*x;

        Integer showMeMore = testMe.apply(2);
    }
}
