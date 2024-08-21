package com.s9dp.permssiononandroid.AndroidInterviews.array

fun main() {

    findDuplicateArrayElements()
}


private fun findDuplicateArrayElements() {
    val aryInputs = arrayOf(1, 2, 3, "sandeep", 33, 4, 2, "Kumar", "Kumar")
    for (i in aryInputs.indices) {
        for (j in i + 1..<aryInputs.size) {
            if (aryInputs[i] == aryInputs[j]) {
                print(" ${aryInputs[i]}")
            }
        }
    }
}