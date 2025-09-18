package PT04;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex08 {
    public static void main(String[] args){
        //Você trabalha em uma empresa de viagens internacionais e precisa de um sistema que exiba o horário atual em diferentes países.
        // Como a empresa tem clientes no Japão, o sistema deve ser capaz de mostrar o horário atual na cidade de Tóquio, independente do fuso horário do computador onde o programa está rodando.
        //
        //Crie um programa que exiba o horário atual no fuso horário de Tóquio (Asia/Tokyo). Utilize a classe ZonedDateTime para realizar a tarefa.
        // Lembre-se de formatar a saída para exibir apenas horas, minutos e segundos.
        ZonedDateTime horaAgora = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(horaAgora.format(formato));
    }
}
