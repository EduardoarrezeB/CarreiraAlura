package PT05.Ex07;

import java.util.ArrayList;

public class Tarefas {
    String descricao;
    boolean concluida;
    ArrayList<String> tarefas = new ArrayList<>();
    String mensagem = "";

    public String montaTarefas(){
        mensagem += descricao;
        if (concluida){
            mensagem = mensagem + " - Concluída";
        } else {
            mensagem = mensagem + " - Em andamento";
        }

        tarefas.add(mensagem);
        return mensagem;
    }

    public void mostraTarefas(){
        montaTarefas();
        System.out.println(tarefas);
    }
}
