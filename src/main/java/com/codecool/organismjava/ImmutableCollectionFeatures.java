package com.codecool.organismjava;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableCollectionFeatures {

    /**
     * Before Java 9
     *
     * @return unmodifiable set, list, map, etc. using Collections.
     */
    private Set<String> createImmutableSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Why you are not using Java 9?");
        return Collections.unmodifiableSet(stringSet);
    }

    /**
     * Since Java 9
     *
     * @return unmodifiable set, list, map, etc. in one line.
     */

    private Set<String> createImmutableSetInEasyWay() {
        return Set.of("Java 9 is awesome!");
    }

    private List<String> createImmutableList() {
        return List.of("Unmodifiable List");
    }
}