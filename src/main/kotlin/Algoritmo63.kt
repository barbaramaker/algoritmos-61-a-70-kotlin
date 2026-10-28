// Código original
// Enunciado:
//Criar um algoritmo que efetue o cálculo do salário líquido
//de um professor. Os dados fornecidos serão: valor da hora-aula,
//número de aulas dadas no mês e percentual de desconto do INSS.
//
// prog lea36
//int na;
//real vha, pd, td, sb, sl;
//imprima "\nhoras trabalhadas: ";
//leia na ;
//imprima "\nvalor da hora-aula: ";
//leia vha ;
//imprima "\npercentual de desconto: ";
//leia pd ;
//sb <- na * vha;
//td <- ( pd / 100) * sb;
//sl <- sb - td;
//imprima "\nsalario liquido: ",sl;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nHoras trabalhadas: ")
    val na = readln().trim().toInt()

    print("\nValor da hora-aula: ")
    val vha = readln().trim().toDouble()

    print("\nPercentual de desconto: ")
    val pd = readln().trim().toDouble()

    val sb = na * vha
    val td = (pd / 100) * sb
    val sl = sb - td

    println("\nSalário líquido: R$ $sl")
}