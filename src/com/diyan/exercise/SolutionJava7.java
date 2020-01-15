package com.diyan.exercise;

import java.util.*;

public class SolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Diyan", "Simeonov", 28),
                new Person("David", "Beckham", 44),
                new Person("Barack", "Obama", 58),
                new Person("Arnold", "Schwarzenegger", 72),
                new Person("Leonardo", "DiCaprio", 44)
        );
//        Step 1 Sort List by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
//        Step 2 Create a method that prints all elements in the list
        printAll(people);
//        Step 3 Create a method that prints all people that have last name begining with S
        printLastNameBegginingWithS(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("S");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people) {
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printLastNameBegginingWithS(List<Person> people) {
        for (Person p: people) {
            if(p.getLastName().startsWith("S")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p: people) {
            System.out.println(p);
        }
    }


}

interface Condition{
    boolean test(Person p);
}