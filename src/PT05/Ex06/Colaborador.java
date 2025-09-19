package PT05.Ex06;

public class Colaborador {
    String nome;
    String cargo;
    int nivelDeAcesso;

    public void alteraCargo(String novoCargo){
        System.out.println("Antigo cargo: "+this.cargo);
        this.cargo = novoCargo;
        System.out.println("Novo cargo: "+this.cargo);
    }

    public void alteraNivelAcesso(int novoNivelDeAcesso){
        System.out.println("Antigo nível de acesso: "+this.nivelDeAcesso);
        this.nivelDeAcesso = novoNivelDeAcesso;
        System.out.println("Novo nível de acesso: "+this.nivelDeAcesso);
    }
}
