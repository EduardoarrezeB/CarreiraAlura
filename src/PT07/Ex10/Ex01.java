package PT07.Ex10;

public class Ex01 {
    public static void main(String[] args){
        //Imagine que você está desenvolvendo um sistema para um banco digital, onde todas as operações financeiras precisam ser tratadas de forma uniforme, mas cada uma com seu comportamento específico.
        // O banco deseja que, independentemente do tipo de operação (depósito, saque, etc.), todas sigam a mesma estrutura básica para facilitar a manutenção e expansão do sistema.
        //
        //Crie um programa que:
        //
        //Tenha uma interface AcaoBancaria com o método executar(), que representa o contrato que toda operação bancária deve seguir.
        //Tenha uma classe abstrata OperacaoBancaria, que implementa essa interface e contém:
        //O atributo valor
        //Um construtor para inicializar esse valor
        //Tenha duas subclasses** que estendem OperacaoBancaria:
        //Deposito: deve imprimir "Depósito de R$[valor] realizado"
        //Saque: deve imprimir "Saque de R$[valor] realizado"
    }
}
