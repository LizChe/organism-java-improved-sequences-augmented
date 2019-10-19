package com.codecool.organismjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesImprovements {

    /**
     * Not possible to use resource reference in try with resources below Java 9
     *
     * @throws FileNotFoundException when the file is missing
     */

    private void printJavaFromFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("src/main/resources/media/files/javaASCII.txt"));
        try (file) {
            while (file.hasNext()) {
                System.out.println(file.nextLine());
            }
        }
    }

    /**
     * The way to reference resource in Java 7 and Java 8
     *
     * @throws FileNotFoundException when the file is missing
     */

    private void printJavaFromFile2() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("src/main/resources/media/files/javaASCII.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        TryWithResourcesImprovements improvements = new TryWithResourcesImprovements();
        try {
            improvements.printJavaFromFile();
            improvements.printJavaFromFile2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}