package com.s9dp.permssiononandroid.utils.numbers;

public class SwipeNumbWithoutThirdVal {

    public static void main(String [] arg) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swiped A value is : " + a);
        System.out.println("Before Swiped B value is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swiped A value is : " + a);
        System.out.println("After Swiped B value is : " + b);

    }
}
