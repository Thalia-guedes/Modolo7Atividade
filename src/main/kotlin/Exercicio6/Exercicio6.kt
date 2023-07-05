package Exercicio6

fun main (){
    println("Digite o numero da tabuada que gostaria: ")
    val numeroDigitado = readln().toInt()


    val tabuada = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9,10)
    )

    for (numero in tabuada) {
        for (elemento in numero) {
            val resultado = elemento * numeroDigitado
            println("$elemento x $numeroDigitado = $resultado")
        }
    }

}