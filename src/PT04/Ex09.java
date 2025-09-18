package PT04;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex09 {
    public static void main(String[] args){
        //Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália.
        // Como os horários variam de acordo com o fuso horário, você precisa de um sistema que converta automaticamente o horário local para o horário de Sydney.
        //
        //Crie um programa que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) e exiba apenas as horas e os minutos.
        // Dica: Utilize o método withZoneSameInstant() para realizar a conversão.
        LocalTime horarioAtual = LocalTime.now();
        ZonedDateTime horarioAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual: "+horarioAtual.format(formato));
        System.out.println("Horário Sydney: "+horarioAustralia.format(formato));
    }
}
