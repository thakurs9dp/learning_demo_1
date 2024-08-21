package com.s9dp.permssiononandroid.AndroidInterviews.lateinit_and_lazy


//In Kotlin, lateinit and lazy are two keywords used for property initialization, but they serve different purposes and have distinct use cases.
//
//lateinit is used to declare a non-null property that can be initialized later, but not at the time of declaration. It is useful when you want to initialize a property later in the code, but you are certain that it will be initialized before it is accessed. Here's an example:
//
//

//private lateinit var mentor: Mentor
//
//fun bookASlot() {
//    mentor = Mentor()
//}
//In this example, mentor is declared as lateinit, which means it will be initialized later. If you try to access mentor before it is initialized, you will get a kotlin.UninitializedPropertyAccessException.
//
//On the other hand, lazy is used to initialize a property only when it is accessed for the first time. It is useful when you want to delay the initialization of a property until it is actually needed. Here's an example:

//Edit
//class Session {
//    private val mentor: Mentor by lazy { Mentor() }
//}
//In this example, mentor is declared as lazy, which means it will be initialized only when it is accessed for the first time.
//
//Here are some key differences between lateinit and lazy:
//
//lateinit vs lazy
//lateinit can be used with var properties, while lazy can only be used with val properties.
//lateinit properties can be reassigned, while lazy properties cannot be reassigned.
//lateinit properties can be initialized multiple times, while lazy properties can only be initialized once.
//lateinit properties do not provide thread safety, while lazy properties provide thread safety.
//When to use lateinit:
//
//When you want to initialize a property later in the code, but you are certain that it will be initialized before it is accessed.
//When you want to reassign a property multiple times.
//When to use lazy:
//
//When you want to delay the initialization of a property until it is actually needed.
//When you want to ensure thread safety for a property.
//I hope this helps! Let me know if you have any further questions.

fun main() {
    bookName()


    person.hello()

}

private val person : Person by lazy {
    Person()
}

const val personq : String = ""

lateinit var name : String

fun bookName() {
    name = "ABC Book";
}


class Person() {
    init {
        print("Hi this is init block of kotlin")
    }
    fun hello() {
        println("This is hello Function")
    }
}

