package PT05.Ex07;

public class Ex01 {
    public static void main(String[] args){
        //Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas atividades diárias.
        // Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi concluída ou não.
        // Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.
        //
        //Crie um programa que:
        //
        //Defina uma classe com os atributos descrição e concluída.
        //Implemente um método que mostre a descrição da tarefa e seu status.
        //Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
        Tarefas tar1 = new Tarefas();
        Tarefas tar2 = new Tarefas();
        Tarefas tar3 = new Tarefas();

        tar1.mensagem = "Jogar o lixo pra fora";
        tar2.mensagem = "Brincar na rua";
        tar3.mensagem = "Lavar roupas";

        tar1.concluida = false;
        tar2.concluida = true;
        tar3.concluida = true;

        tar1.mostraTarefas();
        tar2.mostraTarefas();
        tar3.mostraTarefas();
    }
}
