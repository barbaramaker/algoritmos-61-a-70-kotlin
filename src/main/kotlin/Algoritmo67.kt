// Código original
// Enunciado:
//Efetuar o cálculo do valor de uma prestação em atraso,
//utilizando a fórmula:
//prestação = valor + (valor * (taxa / 100) * tempo).
//
// prog lea40
//real prest, valor, taxa;
//int tempo;
//imprima "\ndigite o valor da prestação: ";
//leia valor;
//imprima "\ndigite a taxa: ";
//leia taxa;
//imprima "\ndigite o tempo(numero de meses): ";
//leia tempo;
//prest <- valor+(valor*(taxa/100)*tempo);
//imprima "\no valor da prestacao em atraso e =" prest;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o valor da prestação: ")
    val valor = readln().trim().toDouble()

    print("\nDigite a taxa: ")
    val taxa = readln().trim().toDouble()

    print("\nDigite o tempo (número de meses): ")
    val tempo = readln().trim().toInt()

    val prest = valor + (valor * (taxa / 100) * tempo)

    println("\nO valor da prestação em atraso é: R$ $prest")
}