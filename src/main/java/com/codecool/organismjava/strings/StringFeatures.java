package com.codecool.organismjava.strings;

import java.util.stream.Collectors;

public class StringFeatures {

    private void isBlankMethod() {
        String blankText = "  \t  \u2000  ";
        String text = "Not blank";
        System.out.println("- The text '" + blankText + "' is blank -> " + blankText.isBlank());
        System.out.println("- The text '" + text + "' is blank -> " + text.isBlank() + "\n");
    }

    private void linesMethod() {
        String textWithNewLinesPrint = "Each\\nLine\\nHere\\nIs\\nA\\nNew\\nLine";
        String textWithNewLines = "Each\nLine\nHere\nIs\nA\nNew\nLine";
        System.out.println("- Text with new lines: '"
                + textWithNewLinesPrint + "'\n"
                + textWithNewLines.lines().collect(Collectors.toList()) + "\n");
    }

    private void repeatMethod() {
        String na = "NA ";
        System.out.println("Repeating: \"" + na);
        System.out.println(na.repeat(14) + "BATMAN!!!!");
    }

    public static void main(String[] args) {
        StringFeatures stringFeatures = new StringFeatures();
        stringFeatures.isBlankMethod();
        stringFeatures.linesMethod();
        stringFeatures.repeatMethod();
    }
}