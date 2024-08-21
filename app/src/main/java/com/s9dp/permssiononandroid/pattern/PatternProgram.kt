package com.s9dp.permssiononandroid.pattern

fun main() {

    printPatternA()

    println()

    printPyramid(6)

    println()

    printReact(6)

    println()

    printReverse(6)

    println()

    printSeriesWithNumbIncremental(6)

    println()

    printZeroTrianglePattern(6)
}


private fun printPatternA() {

    for (i in 1..6) {

        for (j in 1..6 - i) {
            print(" ")
        }

        for (j in 1..i) {
            print(" $i ")
        }

        println()

    }

}


private fun printPyramid(num: Int) {

    for (i in 1..num) {

        for (j in 1..num - i) {
            print(" ")
        }

        for (j in 1..i) {
            print(" * ")
        }
        println()
    }

}


private fun printReact(num: Int) {
    for (i in 1..num) {
        for (j in 1..i) {

            print("$j ")
        }
        println()
    }
}


private fun printReverse(num: Int) {
    for (i in num downTo 1) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}


private fun printSeriesWithNumbIncremental(num: Int) {
    var printNumValue = 1

    for (i in 1..num) {

        for (j in 1..i){
            print("$printNumValue ")
            printNumValue++
        }

        println()

    }

}


private fun printZeroTrianglePattern(num: Int) {

    for (i in 1..num) {

        for (j in 1..i) {

            if ((i + j )%2 == 0) {
                print(" 1 ")
            }else {
                print( " 0 ")
            }

        }

        println()

    }

}