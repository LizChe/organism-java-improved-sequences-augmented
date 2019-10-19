package com.codecool.organismjava;

import java.util.stream.Collectors;

public class StringFeatures {

    private void stripMethod() {
        String leadingAndTrailingSpaces = "  \u2000 \t this text is perfect  \u2000 \t";
        System.out.println("- Striping \""
                + leadingAndTrailingSpaces
                + "\" with leading and trailing spaces...\n"
                + leadingAndTrailingSpaces.strip()
                + "\n");
    }

    private void stripLeadingSpaceMethod() {
        String leadingSpaces = "  \t this text is perfect";
        System.out.println("- Striping \""
                + leadingSpaces
                + "\" with leading spaces...\n"
                + leadingSpaces.stripLeading()
                + "\n");
    }

    private void stripTrailingSpaceMethod() {
        String trailingSpaces = "this text is perfect   ";
        System.out.println("- Striping '"
                + trailingSpaces
                + "' with trailing spaces...\n"
                + trailingSpaces.stripTrailing()
                + "\n");
    }

    private void isBlankMethod() {
        String blankText = " ";
        String text = "this is not blank";
        System.out.println("- The text '" + blankText + "' is blank -> " + blankText.isBlank());
        System.out.println("- The text '" + text + "' is not blank -> " + text.isBlank() + "\n");
    }

    private void linesMethod() {
        String textWithNewLinesPrint = "Each\\nLine\\nHere\\nIs\\nNew\\nLine";
        String textWithNewLines = "Each\nLine\nHere\nIs\nNew\nLine";
        System.out.println("- Text with new lines: '"
                + textWithNewLinesPrint + "'\n"
                + textWithNewLines.lines().collect(Collectors.toList()) + "\n");
    }

    private void repeatMethod() {
        String na = "NA ";
        System.out.println("Repeating: \"" + na + "\"\n"
                + na.repeat(14) + "BATMAN!!!!");
    }

    public static void main(String[] args) {
        StringFeatures stringFeatures = new StringFeatures();
        stringFeatures.stripMethod();
        stringFeatures.stripLeadingSpaceMethod();
        stringFeatures.stripTrailingSpaceMethod();
        stringFeatures.isBlankMethod();
        stringFeatures.linesMethod();
        stringFeatures.repeatMethod();
    }
}