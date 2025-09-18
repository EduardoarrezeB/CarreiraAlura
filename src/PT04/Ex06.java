package PT04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex06 {
    public static void main(String[] args){
        //Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões. Para garantir uma boa organização, o sistema precisa verificar se um evento já ocorreu ou ainda está por vir com base na data atual.
        //
        //Crie um programa que:
        //
        //Receba uma data de evento previamente cadastrada.
        //Compare essa data com a data atual.
        //Exiba a data do evento e a data atual no formato dd-MM-yyyy.
        //Informe se o evento já ocorreu ou ainda está por vir.
        LocalDate dataEvento = LocalDate.of(2025,9,19);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do evento: "+dataEvento.format(formato));
        System.out.println("Data atual: "+dataAtual.format(formato));

        if(dataAtual.isAfter(dataEvento)){
            System.out.println("O evento já ocorreu");
        } else if (dataAtual.isEqual(dataEvento)) {
            System.out.println("O evento é hoje, correeeee!");
        } else {
            System.out.println("O evento ainda não ocorreu");
        }
    }
}
