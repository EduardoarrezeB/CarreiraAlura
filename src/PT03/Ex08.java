package PT03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        //Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos.
        // Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e negativos existem em uma sequência de números fornecida por ela.
        //
        //Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **
        Scanner leitor = new Scanner(System.in);
        int qtdeNegativos = 0;
        int qtdePositivos = 0;
        int numero;

        while (true){
            System.out.println("Digite um número ou 'fim' para encerrar");
            String pergunta = leitor.nextLine();

            if (pergunta.equals("fim")){
                break;
            }

            numero = Integer.parseInt(pergunta);
            if(numero > 0){
                qtdePositivos++;
            } else {
                qtdeNegativos++;
            }
        }

        System.out.println("Números positivos: "+qtdePositivos);
        System.out.println("Números negatvios: "+qtdeNegativos);

        leitor.close();
    }
}
