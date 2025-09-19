package PT05.Ex03;

public class Ex01 {
    public static void main(String[] args){
        //Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras.
        // Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.
        //
        //Crie um programa que:
        //
        //Defina uma classe com o atributo saldo.
        //Implemente um método que redefine o valor do saldo para 0.0.
        //Implemente um método que mostra o saldo atual formatado.
        Conta con1 = new Conta();

        con1.saldo = 1579.42;

        System.out.println(con1.exibirSaldo());
        con1.zerarSaldo();
        System.out.println(con1.exibirSaldo());
    }
}
