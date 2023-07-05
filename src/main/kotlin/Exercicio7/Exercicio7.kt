package Exercicio7

fun main (){
    println("Digite a quantidade de turmaas: ")
    var turmas = readln().toInt()

    var mediaTotal = 0.0

    for (i in 1 until turmas ){
        println("Digite a quantidade de alunos por turma: ")
        var alunos = readln().toInt()

        var notasTotal = 0.0

        for (tumas in 1.. alunos ){
            println("Digite a media do Semestre: ")
            var media = readln().toInt()

            notasTotal += media
        }

        val mediaTurma = notasTotal / alunos
        println("A media por turma é $i e $mediaTurma")

        mediaTotal += mediaTurma

    }
    val mediaGeral = mediaTotal / turmas
    println(" A media geral é $mediaGeral")
}