package PT03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        //Carlos tem uma lista de números e quer descobrir qual é o maior valor.
        // Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento.
        // Crie um programa que receba uma lista de números e encontre o maior número.
        Scanner leitor = new Scanner(System.in);
        int maiorNumero = 0;

        String[] numeros = leitor.nextLine().split(" ");
        for (String numerosx : numeros){
            int niumero = Integer.parseInt(numerosx);
            if(niumero > maiorNumero){
                maiorNumero = niumero;
            }
        }
        System.out.println(maiorNumero);

        leitor.close();
    }
}
