package com.s9dp.permssiononandroid.utils.string;

public class StringPalindrome {

    public static void main(String[] arg) {

        System.out.print("The String is Palindrome " + isStringPalindrome("Sandeep"));
    }


    public static Boolean isStringPalindrome(String stringValue) {

        String result = "";
        boolean isPalindrome = false;

        for (int i = stringValue.length()-1 ; i >= 0; i --) {

            result = result + stringValue.charAt(i);
        }

        if (result.equals(stringValue)){
            isPalindrome = true;
        }

        return isPalindrome;

    }

}
