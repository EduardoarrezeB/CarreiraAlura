package PT06.Ex02;

public class Ex01 {
    public static void main(String[] args){
        //Imagine que você está criando um sistema de catalogação para uma biblioteca.
        // Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado, facilitando a consulta por outros leitores.
        //
        //Crie um programa que:
        //
        //Defina uma classe com os atributos título, autor e páginas.
        //Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
        Livro oguiadomochileiro = new Livro();

        oguiadomochileiro.titulo = "O Guia do Mochileiro das Galáxias";
        oguiadomochileiro.autor = "Douglas Adams";
        oguiadomochileiro.qtdePaginas = 208;

        System.out.println(oguiadomochileiro);
    }
}
