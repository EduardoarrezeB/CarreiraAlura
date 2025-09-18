package PT04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    public static void main(String[] args){
        //Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários. Esses relatórios incluem informações como transações realizadas, atualizações de pedidos e registros de atendimento ao cliente. A equipe responsável pela análise dos relatórios solicitou que a data e a hora sejam exibidas em um formato mais familiar para os usuários brasileiros.
        //
        //Para resolver essa tarefa, você deve:
        //
        //Capturar a data e a hora atuais.
        //Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
        //Formatar a hora no padrão HH:mm (hora e minutos).
        //Exibir o resultado da formatação.
        LocalTime horaAgora = LocalTime.now();
        LocalDate dataAgora = LocalDate.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAgora.format(formatoData);
        String horaFormatada = horaAgora.format(formatoHora);

        System.out.println("Data agora formatada: "+dataFormatada);
        System.out.println("Hora agora formatada: "+horaFormatada);
    }
}
