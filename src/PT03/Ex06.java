package PT03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        //Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número limitado de tentativas para inserir a senha corretamente.
        // Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
        //
        //Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso.
        // Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.
        int tentativas = 2;
        final String senhaCorreta = "Dudulindao123!";
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i <= tentativas; tentativas--) {
            System.out.println("Digite a senha:");
            String senhaTentativa = leitor.nextLine();
            if (!senhaTentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Você tem "+tentativas+" tentativas restantes.");
                if (tentativas == 0) {
                    System.out.println("Conta bloqueada temporariamente.");
                }
            } else {
                System.out.println("Acesso concedido!");
                break;
            }
        }

        leitor.close();
    }
}
