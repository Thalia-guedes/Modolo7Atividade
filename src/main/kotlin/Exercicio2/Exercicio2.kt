package Exercicio2

fun main(){
    println("Digite um numero")
    val num = readln().toInt()
    val lista = mutableListOf(10)

    lista [0] = num

    for (i in 1 until lista.size){
        lista[i] = lista[i - 1] * 2

    }
    println("mensagem $num")

    println("Vetor resultante:")
    for (elemento in lista) {
        print("$elemento ")
    }


}