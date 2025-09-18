package PT01;

public class Ex06 {
    public static void main(String[] args){
        //Escreva um programa que classifique um produto em uma categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:
        //
        //Econômico: preço até R$ 50,00.
        //Intermediário: preço entre R$ 50,01 e R$ 200,00.
        //Premium: preço acima de R$ 200,00.
        double preco = 150.00;
        
        if(preco <= 50.00){
            System.out.println("Categoria do produto: Econômico");
        } else if (preco >= 50.01 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }
    }
}
