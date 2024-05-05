package org.example

fun main(args: Array<String>) {
    /* O método main, em Kotlin, pode ser declarado sem
     * argumentos. No exemplo atual, ele espera um array
     * de argumentos. Para passar valores basta:
     * - clicar em 'Edit Configurations...',
     * - na aba Configuration, adicionar um valor no campo
     * 'Program arguments', clicar em Apply e em OK.
     */
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
}