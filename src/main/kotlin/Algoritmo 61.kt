// Código original
// Enunciado:
//Entrar com a razão de uma PG e o valor do primeiro termo.
//Calcular e imprimir o quinto termo da série.
//
// prog lea34
//int quinto, razao, termo;
//imprima "\nEntre com o 1o termo: ";
//leia termo;
//imprima "\nEntre com a razao: ";
//leia razao;
//quinto <- termo * razao ^ 4;
//imprima "\nO 5 termo desta P.G. e: " quinto;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o 1º termo: ")
    val termo = readln().trim().toInt()

    print("\nEntre com a razão: ")
    val razao = readln().trim().toInt()

    val quinto = termo * razao * razao * razao * razao

    println("\nO 5º termo desta P.G. é: $quinto")
}