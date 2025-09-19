package PT05.Ex08;

public class Ex01 {
    public static void main(String[] args){
        //Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque seja atualizado corretamente a cada venda realizada.
        // Seu programa deve processar as vendas e alertar quando não houver produtos suficientes no estoque.
        //
        //Crie um programa que:
        //
        //Defina uma classe com os atributos nome e quantidade.
        //Implemente um método que:
        //Subtraia a quantidade vendida do estoque se houver disponibilidade.
        //Exiba uma mensagem formatada com o saldo atual usando printf
        //Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
        Estoque camisa = new Estoque();

        camisa.nomeProduto = "T-Shirt M Verde-Limão";
        camisa.qtdeEstoque = 903;

        camisa.vender(59);
        camisa.vender(300);
        camisa.vender(51);
        camisa.vender(254);
        camisa.vender(94);
        camisa.vender(45);
        camisa.vender(127);
    }
}
