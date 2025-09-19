package PT07.Ex07;

public class Ex01 {
    public static void main(String[] args){
        //É muito comum confundir os conceitos de sobrecarga e polimorfismo, afinal, ambos envolvem a ideia de um mesmo método com diferentes comportamentos.
        // Mas o contexto de uso é bem diferente.
        //
        //A sobrecarga de métodos acontece quando criamos várias versões do mesmo método dentro da mesma classe, mudando apenas os parâmetros (tipo, ordem ou quantidade).
        // Isso é útil quando queremos oferecer formas diferentes de executar uma mesma ação, como enviar uma mensagem com ou sem destinatário, ou repetir a mesma ação várias vezes.
        //
        //Já o polimorfismo por sobrescrita acontece em uma estrutura com herança, onde uma subclasse redefine um método da classe mãe, mantendo o nome e os parâmetros, mas alterando o comportamento.
        // É como ter várias classes diferentes respondendo ao mesmo comando, cada uma do seu jeito — como um Animal com um método falar(), e cada subclasse (Cachorro, Gato, Pato) implementando esse método com sons diferentes.
        //
        //Ambos os conceitos fazem parte do polimorfismo, mas atuam em níveis diferentes:
        //
        //A sobrecarga foca na variação da chamada (parâmetros diferentes).
        //A sobrescrita foca na variação da resposta (comportamento diferente).
    }
}
