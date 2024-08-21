package com.s9dp.permssiononandroid.AndroidInterviews.numbers_kotlin

import kotlin.math.pow

fun main() {
    reverseNumber(123456)
}

fun printFebSeriesK(num: Int) {
    var prvNum = 0
    var nextNum = 1
    var result: Int

    for (i in 0..num) {
        print(" $prvNum")
        result = prvNum + nextNum
        prvNum = nextNum
        nextNum = result
    }

}


fun printFact(num: Int) {
    var factNum = 1
    for (i in 1..num) {
        factNum *= i
    }
    print(factNum)
}

fun isNumberIsPrime(num: Int): Boolean {

    var isPrime = true

    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    return isPrime
}


fun printPrimeNumberBetween(num: Int) {

    for (i in 1..num) {
        if (isNumberIsPrime(i)) {
            print(" $i")
        }
    }
}


fun reverseNumber(num: Int) {

    var revNumber = 0
    var rem: Int
    var temNumb = num

    while (temNumb != 0) {

        rem = temNumb % 10
        revNumber = revNumber * 10 + rem

        temNumb /= 10
    }

    print(revNumber)

}

fun isNumberArmStrong(num: Int): Boolean {

    var rembider: Int
    var result = 0
    var powerValue = 0

    var originalNumb: Int = num

    while (originalNumb != 0) {
        originalNumb /= 10
        ++powerValue
    }

    originalNumb = num

    while (originalNumb != 0) {

        rembider = originalNumb % 10
        result = rembider.toDouble().pow(powerValue.toDouble()).toInt()

        originalNumb /= 10

    }

    return result == num

}



