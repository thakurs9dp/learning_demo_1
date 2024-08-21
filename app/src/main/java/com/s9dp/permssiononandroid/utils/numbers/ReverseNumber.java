package com.s9dp.permssiononandroid.utils.numbers;

public class ReverseNumber {

    public static void main(String[] arg) {
        printReverseNumber(123456745);
    }

    public static void printReverseNumber(int number) {
        int rem, rev = 0;
        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.print(rev);
    }
}
