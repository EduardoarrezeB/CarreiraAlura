package PT02;

public class Ex06 {
    public static void main(String[] args){
        //Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
        //
        //Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
        double primeiroLado = 5;
        double segundoLado = 3;
        double terceiroLado = 9;

        if ((primeiroLado + segundoLado) > terceiroLado){
            System.out.println("É possível fazer um triângulo");
        } else {
            System.out.println("Não é possível");
        }
    }
}
