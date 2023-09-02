package net.lucianodacunha.functions

/**
 * let: função de escopo que também pode ser uma função auxiliar de nulo.
 * Sua último instrução será sempre de retorno.
 */

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        // caso a variável seja null, o let não será executado.
        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }

    // use nome da variável customizado ao invés de it.
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

}