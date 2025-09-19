package PT05.Ex05;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public double media(){
        return this.media = (this.nota1 + this.nota2) / 2;
    }

    public String aprovado(){
        if (media >= 7){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
