package net.lucianodacunha.functions

fun operation(): (Int) -> Int {                                     // 1
    // "::" notação que aciona uma função pelo nome.
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}

/**
 *     Declares a higher-order function that returns a function. (Int) -> Int represents the parameters and return type of the square function.
 *     Declares a function matching the signature.
 *     Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
 *     Invokes func. The square function is actually executed.
 */