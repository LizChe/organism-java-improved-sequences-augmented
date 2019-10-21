package com.codecool.organismjava.strings;

public class Strip {
    private static final String textWithLeadingAndTrailingSpaces = "\u2000 \t Hello World!  \u2000 \t";
    private static final String separator = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

    public static void main(String[] args) {
        showStripMethod();
        showStripLeadingMethod();
        showStripTrailingMethod();
        showStripAndTrimDifference();
    }

    private static void showStripMethod() {
        System.out.println(separator);
        System.out.println("- Striping leading and trailing spaces using '.strip()' method ");
        System.out.println("Before: \"" + textWithLeadingAndTrailingSpaces + "\"");
        System.out.println(" After: \"" + textWithLeadingAndTrailingSpaces.strip() + "\"");
    }

    private static void showStripLeadingMethod() {
        System.out.println(separator);
        System.out.println("- Striping leading spaces using '.stripLeading()' method ");
        System.out.println("Before: \"" + textWithLeadingAndTrailingSpaces + "\"");
        System.out.println(" After: \"" + textWithLeadingAndTrailingSpaces.stripLeading() + "\"");
    }

    private static void showStripTrailingMethod() {
        System.out.println(separator);
        System.out.println("- Striping trailing spaces using '.stripTrailing()' method ");
        System.out.println("Before: \"" + textWithLeadingAndTrailingSpaces + "\"");
        System.out.println(" After: \"" + textWithLeadingAndTrailingSpaces.stripTrailing() + "\"");
    }

    private static void showStripAndTrimDifference() {
        // For explanation visit this link:
        // https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11
        System.out.println(separator);
        System.out.println("- Compare '.strip()' and '.trim()' methods ");
        System.out.println("Unchanged: \"" + textWithLeadingAndTrailingSpaces + "\"");
        System.out.println("Stripped:  \"" + textWithLeadingAndTrailingSpaces.strip() + "\"");
        System.out.println("Trimmed:   \"" + textWithLeadingAndTrailingSpaces.trim() + "\"");
        System.out.println(separator);
    }
}
