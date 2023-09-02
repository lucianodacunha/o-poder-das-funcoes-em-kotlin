package net.lucianodacunha.functions

/**
 * Função de escopo.
 */
class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    // temos um comportamento, parecido com o this, desta forma, nao é
    // preciso utilizar o operador ".".
    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")

}