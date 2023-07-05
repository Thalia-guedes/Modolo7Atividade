package Exercicio1

fun main() {
    algoritimos()

}
fun algoritimos(){
    println("Digite um numero inteiro")
    val x = readln().toInt()

    println("Digite outro numero: ")
    val y = readln().toInt()

    var soma = 0
    for (i in x..y) {
        if (i % 13 != 0) {
            soma += i
        }
    }
    println("A soma dos multiplos de 13 é $soma")
}
