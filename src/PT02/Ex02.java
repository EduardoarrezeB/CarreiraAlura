package PT02;

public class Ex02 {
    public static void main(String[] args){
        //Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais. Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
        //
        //Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros, compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
        int numero1 = 17;
        int numero2 = 15;

        if(numero1 > numero2){
            System.out.println("O número "+numero1+" é maior que o número "+numero2);
        } else {
            System.out.println("Número "+numero2+" é maior");
        }
    }
}
