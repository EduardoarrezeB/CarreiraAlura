package PT04;


import java.time.LocalDate;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //Você é responsável pelos projetos em uma empresa de desenvolvimento de software. Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega de cada projeto com base na data de início e no prazo estimado em dias.
        //
        //Você precisa criar um programa que:
        //
        //Receba uma data de início.
        //Adicione o prazo em dias ao início do projeto.
        //Exiba a data final formatada corretamente.
        LocalDate inicio = LocalDate.of(2025, 9, 13);

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o prazo: ");
        int prazo = leitor.nextInt();
        inicio = inicio.plusDays(prazo);

        System.out.println("Data de entrega: "+inicio);
    }
}
