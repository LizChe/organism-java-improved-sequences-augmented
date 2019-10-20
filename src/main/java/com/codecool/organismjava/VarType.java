package com.codecool.organismjava;

import java.util.ArrayList;
import java.util.HashMap;

public class VarType {

    /**
     * Since Java 10 we can use Local-Variable Type Inference
     * When var is used, the compiler checks what we have on the right side
     * and infers the type.
     * <p>
     * Important things to know:
     * - We can't use var keyword as a field
     * - We can't use var keyword as a return type in methods
     * - Var has to be initialized from the start
     */

    public static void main(String[] args) {
        VarType varType = new VarType();
        varType.showInterestingThingsWithVarList();
        varType.showInterestingThingsWithVarMap();
    }

    /**
     * It is possible not to define the type of ArrayList or HashMap
     * In this way we can have objects of various types
     * However, once we defined: var list = new ArrayList<String>()
     * We can no longer put other types of objects in such a list.
     */

    private void showInterestingThingsWithVarList() {
        var listTweak = new ArrayList<>();
        listTweak.add("apples");
        listTweak.add(1);
        for (var thing : listTweak) {
            System.out.println(thing.getClass());
        }
    }

    private void showInterestingThingsWithVarMap() {
        var mapTweak = new HashMap<>();
        mapTweak.put("hello", 1);
        mapTweak.put(1, "hello");
        mapTweak.entrySet().forEach(System.out::println);
    }
}