package com.s9dp.permssiononandroid.AndroidInterviews.const_and_val

/**
 *
 * In Kotlin, const and val are two keywords used to declare constants and immutable variables, respectively.
 *
 * val (Immutable Variable)
 *
 * val is used to declare an immutable variable, which means its value cannot be changed once it is assigned. val is similar to final in Java.
 *
 * Here's an example:
 *
 *val name: String = "John"
 *
 *
 * in this example, name is an immutable variable, and its value cannot be changed once it is assigned.
 *
 * const (Compile-time Constant)
 *
 * const is used to declare a compile-time constant, which means its value is known at compile-time and cannot be changed at runtime. const is similar to static final in Java.
 *
 * Here's an example:
 *
 * const val MAX_ATTEMPTS: Int = 3
 *
 *
 * In this example, MAX_ATTEMPTS is a compile-time constant, and its value is known at compile-time.
 *
 * Key differences between val and const
 *
 * val can be used to declare immutable variables, while const can only be used to declare compile-time constants.
 * val can be used with any type, while const can only be used with primitive types (e.g., Int, String, etc.) and String.
 * val can be initialized using an expression, while const can only be initialized with a constant expression.
 * val can be used as a property, while const cannot be used as a property.
 *
 *
 * When to use val
 *
 * When you want to declare an immutable variable that can be initialized using an expression.
 * When you want to ensure that a variable's value cannot be changed accidentally.
 * When to use const
 *
 * When you want to declare a compile-time constant that can be used throughout your code.
 * When you want to ensure that a constant's value is known at compile-time and cannot be changed at runtime.
 *
 *
 * Use val for immutable variables that are not compile-time constants.
 * Use const for compile-time constants that are used throughout your code.
 * Avoid using const for variables that are not truly constants, as it can make your code less flexible.
 *
 * val name : String  by lazy { " Test " }
 */