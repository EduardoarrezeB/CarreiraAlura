package PT02;

public class Ex03 {
    public static void main(String[] args){
        // Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não, juntamente com o novo valor após o desconto, caso aplicável.
        //
        //Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi aplicado ou não.
        double valorDaCompra = 90;
        double novoValor;

        if (valorDaCompra > 100){
            novoValor = valorDaCompra * 0.9;
            System.out.println("Novo valor "+novoValor);
        } else {
            System.out.println("Nenhum desconto");
        }
    }
}
