package com.codecool.organismjava;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableCollectionFeatures {

    /**
     * Before Java 9.
     */
    private Set<String> createImmutableSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Why you are not using Java 9?");
        return Collections.unmodifiableSet(stringSet);
    }

    /**
     * Since Java 9.
     * In case you do not believe me that these collections are in fact immutable, you can test it!
     */
    private void createImmutableCollectionsInEasyWay() {
        Set<String> immutableSet = Set.of("Java 9 is awesome!");
        List<String> immutableList = List.of("Unmodifiable List");

        // Proof. You run it at your own risk.
        // immutableSet.add("This will cause an exception");
        // immutableList.add("This will cause an exception");
    }

    public static void main(String[] args) {
        new ImmutableCollectionFeatures().createImmutableCollectionsInEasyWay();
    }
}