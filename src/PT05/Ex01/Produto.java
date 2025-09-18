package PT05.Ex01;

public class Produto {
    //Represente um produto com os atributos nome, preço e quantidade.
    //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
    String nome;
    double preco;
    int quantidade;

    public String dadosFormatados(){
        String mensagem = "O produto: "+this.nome+" possui "+this.quantidade+" custando "+this.preco+" a unidade.";
        return mensagem;
    }
}
