package com.codecool.organismjava;

import java.util.ArrayList;
import java.util.HashMap;

public class VarType {

    /**
     * Since Java 10 we can use Local-Variable Type Inference
     * When vas is used, compiler checks what we have on the right side
     * and infers the type. Var has to be initialized from the start.
     *
     * Important things to know:
     *  - We can't use var keyword as a field
     *  - We can't use var keyword as a return type in methods
     *  -
     */

    public static void main(String[] args) {
        var hello = "Hello var keyword!";
        var map = new HashMap<>();
        var list = new ArrayList<>();


        list.add("apples");
        list.add(1);

        for (var thing : list) {
            System.out.println(thing.getClass());
        }
    }
}
