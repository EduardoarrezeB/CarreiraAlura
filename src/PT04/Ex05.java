package PT04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args){
        //Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar o vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento, e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.
        //
        //Crie um programa que:
        //
        //Receba uma data de vencimento original.
        //Adicione um número de meses ao vencimento.
        //A data ajustada deve ser exibida no formato dd-MM-yyyy.
        LocalDate dataVencimentoOriginal = LocalDate.of(2025,9,27);

        int numeroDeMeses = 3;
        dataVencimentoOriginal = dataVencimentoOriginal.plusMonths(numeroDeMeses);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Nova data de vencimento: "+dataVencimentoOriginal.format(formato));
    }
}
