package com.diyan.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseOneJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Diyan", "Simeonov", 28),
                new Person("David", "Beckham", 44),
                new Person("Barack", "Obama", 58),
                new Person("Arnold", "Schwarzenegger", 72),
                new Person("Leonardo", "DiCaprio", 44)
        );

//        Step 1 Sort List by last name
        Collections.sort(people, (p1,p2)->  p1.getLastName().compareTo(p2.getLastName()));
//        Step 2 Create a method that prints all elements in the
        printConditionally(people, p -> true);
//        Step 3 Create a method that prints all people that have last name begining with S
        printConditionally(people, p -> p.getLastName().startsWith("S"));
    }
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p: people) {
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }
//
//    private static void printAll(List<Person> people) {
//        for (Person p: people) {
//            System.out.println(p);
//        }
//    }
}
