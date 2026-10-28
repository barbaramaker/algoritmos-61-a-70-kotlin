// Código original
// Enunciado:
//Criar um algoritmo que leia o numerador e o denominador
//de uma fração e transformá-la em um número decimal.
//
// prog lea42
//int num, denom;
//imprima "\ndigite numerador: ";
//leia num;
//imprima "\ndigite denominador: ";
//leia denom;
//imprima "\ndecimal: ",num/ denom;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o numerador: ")
    val num = readln().trim().toInt()

    print("\nDigite o denominador: ")
    val denom = readln().trim().toInt()

    if (denom != 0) {
        val decimal = num.toDouble() / denom
        println("\nDecimal: $decimal")
    } else {
        println("\nErro: o denominador não pode ser zero.")
    }
}