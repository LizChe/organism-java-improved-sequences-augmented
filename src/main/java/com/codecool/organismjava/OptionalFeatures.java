package com.codecool.organismjava;

import java.util.Optional;

public class OptionalFeatures {

    private void ifPresentOfElseMethod() {
        Optional<String> schrodingerCat = Optional.empty();
        schrodingerCat.ifPresentOrElse(cat -> System.out.println("I am alive"), () -> System.out.println("I am dead"));

        // This is how it would look like in Java 8:
        if (schrodingerCat.isPresent()) {
            System.out.println("I am alive");
        } else {
            System.out.println("I am dead");
        }

        // Hint! Since Java 9 instead of negation '!isPresent()' you can use 'isEmpty()'!
        // Not really helpful in this example, but please keep that in mind.
    }

    /**
     * Before Java 9 it was only possible to return an unwrapped value of an object
     * using 'orElse()' or 'orElseGet()'. With 'or()' it is possible to return an Optional!
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