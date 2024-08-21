package com.s9dp.permssiononandroid.AndroidInterviews.inline

fun main() {

    inlineFunction {
        println("Hi this is fun 2nd")
    }
}


//An inline function is declare with a keyword inline the use of inline function enhanced the performance
// of higher order functions.  the inline function tell the compiler to copy of parameters and function to the call site.


//Without create inline function kotlin make separate class and separate instance of of function
// Inline applicable for Global function not applicable for local local function

 inline fun inlineFunction(fn : () -> Unit) {
    fn()
    println("Hi this is fun 1st")
}