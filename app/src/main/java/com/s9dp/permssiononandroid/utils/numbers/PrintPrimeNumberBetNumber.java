package com.s9dp.permssiononandroid.utils.numbers;

public class PrintPrimeNumberBetNumber {

    public static void main(String[] arg) {
        printNumber(20);
    }

    public static void printNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static Boolean isPrimeNumber(int num) {

        boolean isPrimeNumber = true;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }
}
