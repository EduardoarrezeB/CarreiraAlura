package PT02;

public class Ex01 {
    public static void main(String[] args) {
        //Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno. Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida está correta.
        //
        //Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456, verifique se o que o usuário digitou está correto ou não. O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.
        String senha = "helloworld123!";
        String senhaTentativa = "helloworld123!";

        if(senhaTentativa != senha){
            System.out.println("Não permitido o acesso");
        } else {
            System.out.println("Vai entrar");
        }
    }
}
