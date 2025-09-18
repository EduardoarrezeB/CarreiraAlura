package PT04;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args){
        //Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento. Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.
        //
        //Para isso, crie um programa que:
        //
        //Receba dois horários representando o início e o término de uma atividade.
        //Calcule a diferença em horas e minutos entre esses dois horários.
        //Exiba o resultado formatado.
        LocalTime horarioInicio = LocalTime.of(14,30,00);
        LocalTime horarioFinal = LocalTime.of(16,45,00);

        Duration diferenca = Duration.between(horarioInicio, horarioFinal);

        System.out.println("Diferença: "+diferenca.toHours()+":"+diferenca.toMinutesPart());
    }
}
