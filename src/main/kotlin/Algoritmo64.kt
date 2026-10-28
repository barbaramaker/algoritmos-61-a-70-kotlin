// Código original
// Enunciado:
//Ler uma temperatura em graus centígrados e apresentá-la
//convertida em graus Fahrenheit.
//
//A fórmula de conversão é:
//F = (9 * C + 160) / 5
//
//prog lea37
//real f, c;
//imprima "\ndigite o valor da temperatura em graus centigrados: ";
//leia c;
//f <- (9 * c + 160)/5;
//imprima "\no valor da temperatura em graus fahrenheit e =", f;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o valor da temperatura em graus centígrados: ")
    val c = readln().trim().toDouble()

    val f = (9 * c + 160) / 5

    println("\nO valor da temperatura em graus Fahrenheit é: $f")
}