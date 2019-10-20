package com.codecool.organismjava;

import java.util.Optional;

public class OptionalFeatures {

    private void ifPresentOfElseMethod() {
        Optional<String> schrodingerCat = Optional.empty();
        schrodingerCat.ifPresentOrElse(cat -> System.out.println("I am alive"), () -> System.out.println("I am dead"));

        // This is how it would look like in Java 8:

        // can use isEmpty() method since Java 9 instead of negation
        if (!schrodingerCat.isPresent()) {
            System.out.println("I am dead");
        } else {
            System.out.println("I am alive");
        }
    }

    /**
     * Before java 9 it was only possible to return an unwrapped value of an object
     * using orElse or orElseGet
     * with or it is possible to return an Optional
     */

    private void orMethod() {
        Optional<String> mario = Optional.of("Mario");
        Optional<String> luigi = Optional.of("Luigi");
        Optional<String> player = luigi.or(() -> mario);
        System.out.println(player);
    }

    private void streamMethod() {
        Optional<String> optionalStream = Optional.of("MANY STRINGS OF uncertaiN CaSe");
        optionalStream.stream().map(String::toLowerCase).forEach(System.out::println);
    }

    public static void main(String[] args) {
        OptionalFeatures optionalFeatures = new OptionalFeatures();
        optionalFeatures.ifPresentOfElseMethod();
        optionalFeatures.orMethod();
        optionalFeatures.streamMethod();
    }
}