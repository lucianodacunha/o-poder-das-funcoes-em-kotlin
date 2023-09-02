package net.lucianodacunha.functions

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                          // 4
}

/**
 *     This takes the infix function from above one step further using the operator modifier.
 *     The operator symbol for times() is * so that you can call the function using 2 * "Bye".
 *     An operator function allows easy range access on strings.
 *     The get() operator enables bracket-access syntax.
 */