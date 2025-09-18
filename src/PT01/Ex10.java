package PT01;

public class Ex10 {
    public static void main(String[] args){
        // Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível no tanque. Para isso, você precisa considerar:
        //
        //O consumo médio do veículo (km/l)
        //A capacidade total do tanque de combustível (litros)
        //A quantidade de combustível disponível no momento (litros)
        //A distância da viagem planejada (km)
        //Com essas informações, o programa deverá calcular:
        //
        //A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
        //A autonomia atual, baseada na quantidade de combustível disponível.
        //Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
        double consumoTotal = 12.5; // 12,5km por litro
        double capacidadeTanque = 50;
        double qtdeDisponivelLT = 10;
        double distanciaEmKM = 200;

        double autonomiaMaxima = consumoTotal * capacidadeTanque;
        double autonomiaAtual = consumoTotal * qtdeDisponivelLT;

        System.out.println(autonomiaMaxima);
        System.out.println(autonomiaAtual);
        if (autonomiaAtual > distanciaEmKM){
            System.out.println("Chegará ao destino");
        } else {
            System.out.println("Não chegará");
        }
    }
}
