package net.lucianodacunha.functions


/**
 * Executa um bloco dentro de um determinado objeto, possibilitando criar
 * blocos de atribuições considerando a estrutura de propriedade do objeto.
 */

data class Person(var name: String, var age: Int, var about: String) {
    // sobrecarga de construtor, padrão.
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
    println(stringDescription::class.java.typeName)
}

/**
 *     Creates a Person() instance with default property values.
 *     Applies the code block (next 3 lines) to the instance.
 *     Inside apply, it's equivalent to jake.name = "Jake".
 *     The return value is the instance itself, so you can chain other
 *     operations.
 */