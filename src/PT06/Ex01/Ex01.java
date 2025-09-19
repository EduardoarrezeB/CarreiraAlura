package PT06.Ex01;

public class Ex01 {
    public static void main(String[] args){
        //Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo seus negócios.
        // Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os produtos disponíveis.
        // Sua tarefa é criar um sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.
        //
        //Sua tarefa é criar uma classe que:
        //
        //Represente um produto com os atributos nome, preço e quantidade.
        //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
        Produto produto1 = new Produto();
        produto1.quantidade = 25;
        produto1.nome = "Mouse Gamer";
        produto1.preco = 159.9;

        System.out.println(produto1.dadosFormatados());
    }
}
