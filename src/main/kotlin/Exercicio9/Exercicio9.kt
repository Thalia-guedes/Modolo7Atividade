package Exercicio9

fun main() {
    cadastroFuncionario()
}
fun cadastroFuncionario() {

    println("Digite a quantidade de Funcionarios:")
    val funcionarios = readln().toInt()

    val numeroDeFuncionarios = mutableListOf<String>()
    val tempoDeServico = mutableListOf<Int>()

    for (i in 1..funcionarios) {
        println("Digite o nome do funcionario $i:")
        val nome = readln()
        numeroDeFuncionarios.add(nome)

        println("Digite o tempo de serviço: ")
        val registro = readln().toInt()
        tempoDeServico.add(registro)

        val ferias = 12
        if (registro >= ferias) {
            val funcionarioComFerias = numeroDeFuncionarios.random()
            println("O funcionario $funcionarioComFerias tem direito a ferias ")
        } else {
            println("O funcionario $nome ainda nao possui ferias disponiveis!")
        }

    }

}



