package com.codecool.organismjava;

import java.util.ArrayList;
import java.util.HashMap;

public class VarType {

    /**
     * Since Java 10 we can use Local-Variable Type Inference.
     * When 'var' is used, the compiler checks what we have on the right side of assignment statement
     * and infers the type.
     *
     * Important things to know:
     * - We can't use var keyword as a field
     * - We can't use var keyword as a return type in methods
     * - Var has to be initialized from the start
     */
    public static void main(String[] args) {
        VarType varType = new VarType();
        varType.showInterestingThingsWithVarList();
        varType.showInterestingThingsWithVarMap();
        varType.showInterestingThingsThatWillBreakYourApplication();
    }

    /**
     * It is possible not to define the type of a collection.
     * In this way we can have objects of various types.
     * However, once we defined: var list = new ArrayList<String>().
     * We can no longer put other types of objects in such a list.
     */
    private void showInterestingThingsWithVarList() {
        var listTweak = new ArrayList<>(); // Inferred as ArrayList<Object>
        listTweak.add("apples");
        listTweak.add(1);
        for (var thing : listTweak) {
            System.out.println(thing.getClass());
        }
    }

    private void showInterestingThingsWithVarMap() {
        var mapTweak = new HashMap<>(); // Inferred as ArrayList<Object, Object>
        mapTweak.put("hello", 1);
        mapTweak.put(1, "hello");
        mapTweak.entrySet().forEach(System.out::println);
    }

    /**
     * Code you will find below will either not compile, or break your app in runtime.
     */
    private void showInterestingThingsThatWillBreakYourApplication() {
        // var myNullValue = null; // you cannot infer type of null!
        // var a = 3, b = 4; // var cannot be used for multiple variable definition!
    }
}