package com.s9dp.permssiononandroid.utils.numbers;

public class FactorialNumber {

    public static void main(String[] arg) {
        int number = 5; // You can change this value to calculate the factorial of another number
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }


    public static long calculateFactorial(int num) {

        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }


}
