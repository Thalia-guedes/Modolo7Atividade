package Exercicio3

import kotlin.math.sign

fun main (){
mercado()
}
fun produtos (){
    println("Digite a quantidade de itens comprados: ")
    val itens = readln().toInt()


}
fun mercado (){

    println("Digite a quantidade de itens comprados: ")
    val itens = readln().toInt()

    println("Agora digite o preço: ")
    val preco = readln().toInt()

    var multiplicar =0


    for (item in itens until preco){
        multiplicar = itens * preco

    }
    println("A quantidade de itens comprados foi: $itens e o valor total é: $multiplicar " )


}