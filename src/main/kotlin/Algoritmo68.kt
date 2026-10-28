// Código original
// Enunciado:
//Ler dois valores para as variáveis A e B, efetuar a troca
//dos valores de forma que a variável A passe a ter o valor
//da variável B e que a variável B passe a ter o valor da
//variável A. Apresentar os valores trocados.
//
// prog lea41
//real a, b, aux;
//imprima "\ndigite 1 numero com ponto: ";
//leia a;
//imprima "\ndigite 2 numero com ponto: ";
//leia b;
//aux <- a;
//a <- b;
//b <-aux;
//imprima "\na = " a, "\nb = ", b;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o 1º número com ponto: ")
    var a = readln().trim().toDouble()

    print("\nDigite o 2º número com ponto: ")
    var b = readln().trim().toDouble()

    val aux = a
    a = b
    b = aux

    println("\nA = $a")
    println("B = $b")
}