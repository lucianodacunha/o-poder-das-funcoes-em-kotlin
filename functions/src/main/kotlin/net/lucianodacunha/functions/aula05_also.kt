package net.lucianodacunha.functions

/**
 * Similar a utilização do apply, com a diferença que neste caso é
 * necessário utilizar o "it".
 */
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Person("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}

/**
 *     Creates a Person() object with the given property values.
 *     Applies the given code block to the object. The return value is
 *     the object itself.
 *     Calls the logging function passing the object as an argument.
 */