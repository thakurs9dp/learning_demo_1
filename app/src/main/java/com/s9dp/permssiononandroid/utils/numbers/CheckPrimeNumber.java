package com.s9dp.permssiononandroid.utils.numbers;

public class CheckPrimeNumber {

    public static void main(String[] arg) {

        System.out.print("Number is prime " + isPrimeNumber(4));

    }


    public static Boolean isPrimeNumber(int number) {

        boolean result = true;


        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

}
