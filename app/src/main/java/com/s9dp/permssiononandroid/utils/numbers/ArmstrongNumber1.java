package com.s9dp.permssiononandroid.utils.numbers;

public class ArmstrongNumber1 {

    public static void main(String[] arg) {

        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {

        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = num;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }


        originalNumber = num;

        while (originalNumber != 0) {

            remainder = originalNumber % 10;
            result += (int) Math.pow(remainder, n);
            originalNumber /= 10;

        }

        return result == num;
    }

}
