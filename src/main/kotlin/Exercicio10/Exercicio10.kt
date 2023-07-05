package Exercicio10

fun main (){

    println("Digite o valor de X: ")
    val x = readln().toInt()

    println("Digite o valor de Y: ")
    val y = readln().toInt()

    if (x == y || y == x ){
        println("Os valores de X e Y sao iguais!")

    }else{
        println("Os valores de X e Y sao diferentes!")
    }

}