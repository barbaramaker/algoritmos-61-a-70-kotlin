// Código original
// Enunciado:
//Efetuar o cálculo da quantidade de litros de combustível
//gastos em uma viagem, sabendo-se que o carro faz 12 km
//com um litro.
//
//Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
//
//Utilizar as seguintes fórmulas:
//distância = tempo * velocidade
//litros usados = distância / 12
//
//O algoritmo deverá apresentar os valores da velocidade
//média, tempo gasto na viagem, distância percorrida e a
//quantidade de litros utilizados na viagem.
//
// prog lea39
//real tempo, vel, dist, litros;
//imprima "\ndigite o tempo gasto: ";
//leia tempo;
//imprima "\ndigite a velocidade media: ";
//leia vel;
//dist <- tempo* vel;
//litros<- dist / 12;
//imprima "\nvelocidade =" vel, "\ntempo ", tempo, "\ndistancia = "
//dist, "\nlitros = ", litros;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o tempo gasto na viagem: ")
    val tempo = readln().trim().toDouble()

    print("\nDigite a velocidade média: ")
    val vel = readln().trim().toDouble()

    val dist = tempo * vel
    val litros = dist / 12

    println("\nVelocidade média: $vel km/h")
    println("Tempo gasto: $tempo horas")
    println("Distância percorrida: $dist km")
    println("Litros utilizados: $litros litros")
}