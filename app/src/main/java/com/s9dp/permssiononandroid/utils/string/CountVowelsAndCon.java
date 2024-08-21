package com.s9dp.permssiononandroid.utils.string;

public class CountVowelsAndCon {

    public static void main(String[] arg) {
        CountVowelsAndCon  con = new CountVowelsAndCon();
        con.checkVowelsAndConst("Sandeep");
    }


    void checkVowelsAndConst(String str) {

        int vowel = 0, consonants = 0;
        str = str.toLowerCase();

        for (int i= 0; i < str.length(); i ++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else  {
                consonants++;
            }
        }
        System.out.print("Vowel are " + vowel + " Consonants are " + consonants);

    }
}
