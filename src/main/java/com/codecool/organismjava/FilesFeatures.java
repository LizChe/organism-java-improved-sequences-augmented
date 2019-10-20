package com.codecool.organismjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesFeatures {

    private void writeStringMethod() throws IOException {
        Files.writeString(Path.of("src/main/resources/files/test.txt"), "Hello to Java 11 features!");
    }

    private void readStringMethod() throws IOException {
        String fileText = Files.readString(Path.of("src/main/resources/files/test.txt"));
        System.out.println(fileText);
    }

    public static void main(String[] args) throws IOException {
        FilesFeatures filesFeatures = new FilesFeatures();
        filesFeatures.writeStringMethod();
        filesFeatures.readStringMethod();
    }
}