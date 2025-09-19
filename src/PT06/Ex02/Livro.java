package PT06.Ex02;

public class Livro {
    String titulo;
    String autor;
    int qtdePaginas;

    @Override
    public String toString() {
        return "\"O livro "+this.titulo+"\" de "+this.autor+" com "+this.qtdePaginas+" páginas";
    }
}
