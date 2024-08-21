package com.s9dp.permssiononandroid.utils.string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] arg) {


        checkNonRepeatingValue("sandeep");
        usingMap("Sandeep");

    }


    public static void checkNonRepeatingValue(String stg) {

        for (int i = 0; i < stg.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < stg.length(); j++) {

                if (stg.charAt(i) == stg.charAt(j)) {
                    unique = false;
                    break;
                }

            }


            if (unique){
                System.out.print(stg.charAt(i));
                break;
            }

        }
    }


    public static void usingMap(String input){


        Map<Character, Integer> map = new HashMap<>();

        for (int i=0 ; i <input.length(); i++) {

            char ch = input.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch , map.get(ch) +1);
            }else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                System.out.print("The entry set key " + entry.getKey());
                break;
            }
        }

    }

}
