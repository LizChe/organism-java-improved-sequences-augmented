package com.codecool.organismjava.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * In class TryWithResourcesImprovements you'll find... well... improvements of try-with-resources mechanism.
 * But if you want to remind yourself "what is that?", and "what is the point of using that?", please read text below.
 */
public class BasicsOfTryWithResources {

    public static void main(String[] args) {
        readFileWithoutTryWithResources();
        readFileJava7Style();
    }

    /**
     * Here we first declare our fileReader above 'try' clause so we can access it in 'finally' clause.
     * After all we want to close to avoid memory leaks.
     * This leads to some long and dirty code, that reads single line from a file. Not cool.
     */
    private static void readFileWithoutTryWithResources() {
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader("src/main/resources/files/javaASCII.txt"));
            fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * When using try-with-resources you don't have to close streams by hand!
     * Code is cleaner and easier to understand.
     */
    private static void readFileJava7Style() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/files/javaASCII.txt"))) {
            fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
