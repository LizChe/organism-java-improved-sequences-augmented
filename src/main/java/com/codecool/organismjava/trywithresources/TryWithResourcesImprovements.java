package com.codecool.organismjava.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesImprovements {

    /**
     * Prior to Java 9 you couldn't use resource reference in try-with-resources clause.
     */
    private void tryWithResourcesInJava9Style() throws FileNotFoundException {
        Scanner file = new Scanner(new File("src/main/resources/files/javaASCII.txt"));
        try (file) {
            while (file.hasNext()) {
                System.out.println(file.nextLine());
            }
        }
    }

    /**
     * The way to reference resource in Java 7 and Java 8.
     */
    private void vintageTryWithResources() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("src/main/resources/files/javaASCII.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        TryWithResourcesImprovements improvements = new TryWithResourcesImprovements();
        try {
            improvements.tryWithResourcesInJava9Style();
            improvements.vintageTryWithResources();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find a file");
        }
    }
}