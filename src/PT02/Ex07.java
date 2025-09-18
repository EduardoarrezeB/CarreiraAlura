package PT02;

public class Ex07 {
    public static void main(String[] args){
        //Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue. Para ser compatível, o doador deve atender aos seguintes critérios:
        //
        //Ter entre 18 e 65 anos.
        //
        //Pesar mais de 50 kg.
        //
        //Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue. Se não for, o programa deve indicar qual critério não foi atendido.
        //
        //Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

        int idade = 18;
        double pesoDoador = 67.8;

        if (idade < 18 && pesoDoador > 50){
            System.out.println("Não compátivel");
        } else {
            System.out.println("Permite doação");
        }
    }
}
