package PT03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        //Maria está preparando um evento de aniversário e quer organizar a lista de convidados. Ela precisa de um sistema que:
        //
        //Exiba a lista de convidados já cadastrados caso o usuário digite "ver".
        //Adicione novos nomes à lista, caso o nome não esteja lá.
        //Caso o nome já esteja na lista, o programa deve informar que o nome já foi registrado.
        //O programa deve permitir que Maria continue a adicionar nomes até ela digitar "sair".
        //Ajude Maria e faça o código para este sistema.
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> listaDeConvidados = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            String pergunta = leitor.nextLine();

            if(pergunta.equals("ver")){
                System.out.println("Lista de convidados: "+listaDeConvidados);
            } else if (pergunta.equals("sair")) {
                break;
            } else {
                listaDeConvidados.add(pergunta);
                System.out.println(pergunta + " foi adicionado à lista");
            }
        }
    }
}
