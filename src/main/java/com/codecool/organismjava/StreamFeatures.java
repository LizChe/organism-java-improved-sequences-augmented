package com.codecool.organismjava;

import java.util.stream.Stream;

public class StreamFeatures {

    private void takeWhileMethod() {
        Stream<String> strings = Stream.of("water", "watermelon", "coffee", "wild", "whale", "pumpkin");
        System.out.println("\nTake While method:");
        strings.takeWhile(s -> s.startsWith("w")).forEach(s -> System.out.print(s + " "));
    }

    private void dropWhileMethod() {
        Stream<String> strings = Stream.of("water", "watermelon", "coffee", "wild", "whale", "pumpkin");
        System.out.println("\nDrop While method:");
        strings.dropWhile(s -> s.startsWith("w")).forEach(s -> System.out.print(s + " "));
    }

    public static void main(String[] args) {
        StreamFeatures streamFeatures = new StreamFeatures();
        streamFeatures.takeWhileMethod();
        streamFeatures.dropWhileMethod();
    }
}