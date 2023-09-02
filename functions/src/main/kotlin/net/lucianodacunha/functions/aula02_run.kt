package net.lucianodacunha.functions

/**
 * run é outra função de escopo.
 */
fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")
            length                                                 // 3
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}

/**
 * 2. o run, permite utilizar isEmpty sem antes mencionar it.
 * Pelo contexto, é possível executar somente o método do objeto atual.
 */