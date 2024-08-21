package com.s9dp.permssiononandroid.utils.numbers;

public class PrintPalindromeNumber {


    public static void main(String[] arg) {

        //palindrome Number are 1221 434


        System.out.print("The number is palindrome " + isNumberIsPalindromeNumber(1221));


    }


    public  static Boolean isNumberIsPalindromeNumber(int number) {

        int rem, temp = number, rev = 0;

        boolean result  = false;

        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        if (temp == rev) {
            result = true;
        }

        return result;

    }


}
