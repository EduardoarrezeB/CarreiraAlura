package PT02;

public class Ex05 {
    public static void main(String[] args){
        //Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
        //
        //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
        double valorMinimo = 1000;
        double valorMaximo = 5000;
        double valorEmprestimo = 150;

        if(valorEmprestimo < valorMinimo && valorEmprestimo > valorMaximo){
            System.out.println("Não permitido");
        } else {
            System.out.println("Valor Permitido");
        }
    }
}
