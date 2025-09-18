package PT03;

public class Ex03 {
    public static void main(String[] args){
        //Maria quer calcular a soma de todos os números pares de 1 a 100.
        // Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2. Crie um programa que realize essa tarefa.
        int somaNumeros = 0;

        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                somaNumeros += i;
            }
        }

        System.out.println(somaNumeros);
    }
}
