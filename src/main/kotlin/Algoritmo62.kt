// Código original
// Enunciado:
// Em épocas de pouco dinheiro, os comerciantes estão procurando
// aumentar suas vendas oferecendo desconto. Faça um algoritmo
// que possa entrar com o valor de um produto e imprima o novo
// valor tendo em vista que o desconto foi de 9%.
//
// prog lea35
//real preco, npreco;
//imprima "\ndigite va lor do produto: ";
//leia preco;
//npreco <-preco * 0.91;
//imprima "\npreco com desconto: ",npreco;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o valor do produto: ")
    val preco = readln().trim().toDouble()

    val npreco = preco * 0.91

    println("\nPreço com desconto: R$ $npreco")
}
