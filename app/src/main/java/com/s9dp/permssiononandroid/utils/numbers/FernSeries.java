package com.s9dp.permssiononandroid.utils.numbers;

public class FernSeries {


    public static void printFebSeries(int number) {
        int prev = 0;
        int next = 1;
        int result;
        for (int i = 0 ; i <= number; i++){
            System.out.print(prev);
            result = prev + next;
            prev = next;
            next = result;
        }
    }

    public static void main(String[] arg) {
        printFebSeries(10);
    }

}
