package net.lucianodacunha.functions

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}

/**
 *     Declares a higher-order function. It takes two integer parameters, x and y. Additionally, it takes another function operation as a parameter. The operation parameters and return type are also defined in the declaration.
 *     The higher order function returns the result of operation invocation with the supplied arguments.
 *     Declares a function that matches the operationsignature.
 *     Invokes the higher-order function passing in two integer values and the function argument ::sum. :: is the notation that references a function by name in Kotlin.
 *     Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?
 */