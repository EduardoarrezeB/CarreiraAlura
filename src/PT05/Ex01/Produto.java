package PT05.Ex01;

public class Produto {
    //Represente um produto com os atributos nome, preço e quantidade.
    //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
    String nome;
    double preco;
    int quantidade;

    public String dadosFormatados(){
        return "O produto: "+this.nome+" possui "+this.quantidade+" unidades custando R$"+this.preco+"0 a unidade.";
    }
}
