package com.codecool.organismjava;

public interface InterfaceFeatures {

    private String someExtremelyImportantCalculation(int a, int b) {
        return a + b + " private methods in interfaces are possible.";
    }

    default void doCalculation(int a, int b) {
        System.out.println(someExtremelyImportantCalculation(a, b));
    }

    default void doAnotherCalculation(int a, int b) {
        System.out.println(someExtremelyImportantCalculation(a, b));
    }
}

class Features implements InterfaceFeatures {

    public static void main(String[] args) {
        InterfaceFeatures features = new Features();
        features.doCalculation(1, 1);
        features.doAnotherCalculation(2, 2);
    }
}