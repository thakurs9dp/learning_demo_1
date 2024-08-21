package com.s9dp.permssiononandroid.AndroidInterviews.scope_funcations

/**
 * Scope Functions in Kotlin
 *
 * Scope functions are a set of functions in Kotlin that allow you to execute a block of code within a specific scope, providing a concise and expressive way to perform operations on objects. These functions are:
 *
 * let
 * run
 * also
 * apply
 * with
 * Each scope function has its own unique characteristics and use cases. Let's dive into each one:
 *
 * 1. let
 *
 * let is used to execute a block of code if a value is not null. It returns the result of the block.
 *
 * Example:
 *
 * kotlin
 *
 * Verify
 *
 * Open In Editor
 * Edit
 * Copy code
 * val name: String? = "John"
 * name?.let { println(it) } // prints "John"
 * In this example, let is used to execute the block of code println(it) only if name is not null.
 *
 * 2. run
 *
 * run is used to execute a block of code and return the result. It's similar to let, but it doesn't require a null check.
 *
 * Example:
 *
 * kotlin
 *
 * Verify
 *
 * Open In Editor
 * Edit
 * Copy code
 * val result = "Hello".run {
 *     val length = length
 *     "The length is $length"
 * }
 * println(result) // prints "The length is 5"
 * In this example, run is used to execute the block of code and return the result.
 *
 * 3. also
 *
 * also is used to execute a block of code and return the original value. It's similar to let, but it returns the original value instead of the result of the block.
 *
 * Example:
 *
 * kotlin
 *
 * Verify
 *
 * Open In Editor
 * Edit
 * Copy code
 * val name: String? = "John"
 * name?.also { println(it) }?.let { println(it.length) } // prints "John" and "4"
 * In this example, also is used to execute the block of code println(it) and return the original value name.
 *
 * 4. apply
 *
 * apply is used to execute a block of code and return the result. It's similar to run, but it returns the result of the block instead of the original value.
 *
 * Example:
 *
 * kotlin
 *
 * Verify
 *
 * Open In Editor
 * Edit
 * Copy code
 * val person = Person().apply {
 *     name = "John"
 *     age = 30
 * }
 * println(person.name) // prints "John"
 * In this example, apply is used to execute the block of code and return the result, which is the modified Person object.
 *
 * 5. with
 *
 * with is used to execute a block of code with a value as the receiver. It's similar to run, but it uses the value as the receiver instead of creating a new scope.
 *
 * Example:
 *
 * kotlin
 *
 * Verify
 *
 * Open In Editor
 * Edit
 * Copy code
 * val name: String? = "John"
 * with(name) {
 *     println(this) // prints "John"
 * }
 * In this example, with is used to execute the block of code with name as the receiver.
 *
 * Key differences
 *
 * Here's a summary of the key differences between the scope functions:
 *
 * Function	Returns	Null safety	Receiver
 * let	Result of block	Yes	No
 * run	Result of block	No	No
 * also	Original value	Yes	No
 * apply	Result of block	No	Yes
 * with	Result of block	No	Yes
 * When to use each scope function:
 *
 * let: When you need to execute a block of code if a value is not null.
 * run: When you need to execute a block of code and return the result.
 * also: When you need to execute a block of code and return the original value.
 * apply: When you need to execute a block of code and return the result, with the value as the receiver.
 * with: When you need to execute a block of code with a value as the receiver.
 * By using scope functions, you can write more concise and expressive code, making your Kotlin code more readable and maintainable.
 */