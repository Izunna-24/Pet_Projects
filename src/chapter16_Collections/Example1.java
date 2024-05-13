package chapter16_Collections;

import java.util.*;

public class Example1 {
    /** primitives and their Wrapper classes used in generic objects
     * Boolean -> boolean
     * Byte -> byte
     * Short -> short
     * Character -> char
     * Integer -> int
     * Long -> long
     * Float -> float
     * Double -> double
     */

    /** Autoboxing: conversion of primitive type to its equivalent ref type implicitly by the jvm
     * AutoUnboxing: conversion of ref type to its corresponding primitive value implicitly by the jvm
     *
     * */

    //Autoboxing
    boolean b = true;
    Boolean b1 = b;

    public static void main(String[] args) {

        Collection<String> words = new TreeSet<>();
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");

        System.out.println(words);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(8);
        Set<List<Integer>> set = new HashSet<>();

        set.add(numbers);
        set.add(numbers2);
        System.out.println(set);

    }
}
