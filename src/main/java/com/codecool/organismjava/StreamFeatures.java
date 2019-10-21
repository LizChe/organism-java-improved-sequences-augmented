package com.codecool.organismjava;

import java.util.stream.Stream;

public class StreamFeatures {

    private static void takeWhileMethod() {
        Stream<String> strings = Stream.of("water", "watermelon", "coffee", "wild", "whale", "pumpkin");
        System.out.println("\nTake While method:");
        strings.takeWhile(s -> s.startsWith("w")).forEach(s -> System.out.print(s + " ")); // water watermelon
    }

    private static void dropWhileMethod() {
        Stream<String> strings = Stream.of("water", "watermelon", "coffee", "wild", "whale", "pumpkin");
        System.out.println("\nDrop While method:");
        strings.dropWhile(s -> s.startsWith("w")).forEach(s -> System.out.print(s + " ")); // coffee wild whale pumpkin
    }

    public static void main(String[] args) {
        takeWhileMethod();
        dropWhileMethod();
    }
}