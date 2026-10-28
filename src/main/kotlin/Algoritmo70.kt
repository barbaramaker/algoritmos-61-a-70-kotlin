// Código original
// Enunciado:
//Todo restaurante, embora por lei não possa obrigar
//o cliente a pagar, cobra 10% para o garçom.
//Fazer um algoritmo que leia o valor gasto com despesas
//realizadas em um restaurante e imprima o valor total
//com a gorjeta.
//
//prog lea43
//real cres, cgorj;
//imprima "\nEntre com o valor da conta: ";
//leia cres;
//cgorj <- cres *1.1;
//imprima "\nO valor da conta com a gorjeta sera: " formatar(cgorj,2);
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o valor da conta: ")
    val cres = readln().trim().toDouble()

    val cgorj = cres * 1.1

    println("\nO valor da conta com a gorjeta será: R$ ${"%.2f".format(cgorj)}")
}