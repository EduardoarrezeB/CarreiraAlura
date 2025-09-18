package PT03;

public class Ex04 {
    public static void main(String[] args){
        //Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número.
        // Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.
        int numerox = 5;
        int factorial = 1;
        for (int i = 1; i <= numerox; i++) {
            factorial *= i;
        }
        System.out.println("O fatorial de " + numerox + " é: " + factorial);
    }
}
