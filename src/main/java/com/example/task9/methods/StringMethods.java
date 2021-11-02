package com.example.task9.methods;

import java.util.Locale;

public class StringMethods {

    // private Integer spaceNum = 0;
    private static StringBuilder stringBuilder;

    public static void printLine() {

        System.out.println("########################################################################################################################################################################################################");

    }
    public static void printInfo(String string) {

        stringBuilder = new StringBuilder();

        stringBuilder.append(" $ ");
        stringBuilder.append(string);
        stringBuilder.append(";");

        System.out.println(stringBuilder);

    }
    public static void printInfo(String[] params, String[] values) {

        stringBuilder = new StringBuilder();

        stringBuilder.append(" $ ");

        for (int i = 0; i < params.length; i++) {

            stringBuilder.append(params[i]);
            stringBuilder.append(": ");
            stringBuilder.append(values[i]);
            stringBuilder.append(", ");

        }

        stringBuilder = new StringBuilder(stringBuilder.substring(0,stringBuilder.length() - 2));

        stringBuilder.append(";");

        System.out.println(stringBuilder);

    }
    public static void printHeader(String string) {

        stringBuilder = new StringBuilder();

        stringBuilder.append("< ");
        stringBuilder.append(string.toUpperCase(Locale.ROOT));
        stringBuilder.append(" >");

        System.out.println(stringBuilder);

    }
    public static void printWarning(String string) {

        stringBuilder = new StringBuilder();

        stringBuilder.append("  ! ");
        stringBuilder.append(string);
        stringBuilder.append(";");

        System.out.println(stringBuilder);

    }

}
