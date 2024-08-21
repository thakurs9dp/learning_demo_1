package com.s9dp.permssiononandroid.utils.string;

public class ReverseString {

    public static void main(String[] arg) {
        printReversString("Sandeep");
    }

    public static void printReversString(String name) {

        String result = "";

        for (int i = name.length()-1 ; i>= 0 ; i--) {
            result = result + name.charAt(i);

        }

        System.out.print(result);


    }
}
