package PT05.Ex09;

public class Livro {
    String titulo;
    int diasAtraso;

    public double calculaMulta(){
        return diasAtraso * 2.50;
    }

    @Override
    public String toString() {
        return String.format("O livro \"%s\" possui R$%.2f em multas a pagar", this.titulo, calculaMulta());
    }
}
