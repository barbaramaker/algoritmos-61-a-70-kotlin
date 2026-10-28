// Código original
// Enunciado:
//Calcular e apresentar o valor do volume de uma lata de óleo,
//utilizando a fórmula: volume = 3.14159 * R^2 * altura.
//
// prog lea38
//real volume, altura, raio;
//imprima "\ndigite a altura da lata: ";
//leia altura;
//imprima "\ndigite o raio da lata: ";
//leia raio;
//volume <- pi *raio ** 2 *altura;
//imprima "\no volume da lata e = " volume;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.pow

fun main() {
    print("\nDigite a altura da lata: ")
    val altura = readln().trim().toDouble()

    print("\nDigite o raio da lata: ")
    val raio = readln().trim().toDouble()

    val volume = 3.14159 * raio.pow(2) * altura

    println("\nO volume da lata é: $volume")
}