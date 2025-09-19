package PT05.Ex08;

public class Estoque {
    String nomeProduto;
    int qtdeEstoque;

    public void vender(int qtdeVendida){
        if(this.qtdeEstoque < qtdeVendida){
            System.out.print("Sem estoque o suficiente, o solicitado foi: "+qtdeVendida);
        } else {
            System.out.print(qtdeVendida+ " - Peça(s) vendida");
            this.qtdeEstoque -= qtdeVendida;
        }

        System.out.printf(" - Quantidade em estoque atualmente: %s%n", this.qtdeEstoque);
    }
}
