package com.s9dp.permssiononandroid.AndroidInterviews.string

import android.util.MutableChar


fun main() {
    findTheVowelAndConst("SandeeppSd")
}

fun printStringReverse(stringValue: String) {
    var revString = ""
    for (i in stringValue.length - 1 downTo 0) {
        revString += stringValue[i]
    }
    print("Revers string $revString")
}


fun findDuplicateCharFromString(stringValue: String) {
    for (i in stringValue.indices) {
        for (j in i + 1 until stringValue.length) {
            if (stringValue[i] == stringValue[j]) {
                print(stringValue[i])
                break
            }
        }
    }
}


fun findTheVowelAndConst(input: String) {
    val strToLowerCase = input.lowercase()
    val inputAsChar = strToLowerCase.toCharArray()
    for (i in inputAsChar.indices) {
        if (inputAsChar[i] == 'a' || inputAsChar[i] == 'e' || inputAsChar[i] == 'i' || inputAsChar[i] == 'o' || inputAsChar[i] == 'u') {
            println("Vowel Value is ${inputAsChar[i]}")
        } else {
            println("Const Value is ${inputAsChar[i]}")
        }
    }


}

