package PT04;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        //Você trabalha no setor administrativo de uma empresa e precisa de um sistema para acompanhar os horários de entrada e saída dos funcionários.
        // O sistema deve calcular o horário de saída com base na hora de entrada e na carga horária diária.
        //
        //Além disso, para controle de banco de horas, o sistema deve calcular quantas horas um funcionário trabalhou a mais ou a menos, caso o expediente tenha durado mais ou menos que o previsto.
        //
        //O programa deve:
        //
        //Capturar o horário de entrada.
        //Adicionar a carga horária diária para calcular o horário de saída previsto.
        //Capturar o horário real de saída
        //Calcular a diferença entre o tempo trabalhado e a carga horária.
        //Exibir as informações formatadas corretamente.
        Scanner leitor = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(leitor.next(), formato);
        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = leitor.nextInt();
        System.out.println("Digite o horário de saída (HH:mm): ");
        LocalTime saida = LocalTime.parse(leitor.next(), formato);
        LocalTime horarioSaidaPrevisto = entrada.plusHours(cargaHoraria);

        if (saida.isAfter(horarioSaidaPrevisto)){
            System.out.println("Saldo de horas: "+ Duration.between(horarioSaidaPrevisto, saida).toHours()+":"+Duration.between(horarioSaidaPrevisto, saida).toMinutesPart());
        }
    }
}
