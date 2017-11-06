package javaExercise3;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(1,"wilk"),new Person(2,"kata"),new Person(34,"ola"));

//        Collections.sort(personList, new Comparator<Person>(){
//            @Override
//            public int compare(Person p1, Person p2){
//                return p1.getSurName().compareTo(p2.getSurName());
//            }
//        });
//        System.out.println(personList);
        Collections.sort(personList,(person1, person2) -> person1.getId() - person2.getId());
        System.out.println(personList);
    }
}
