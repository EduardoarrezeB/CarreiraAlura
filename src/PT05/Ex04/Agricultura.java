package PT05.Ex04;

public class Agricultura {
    String local = "Setor A";
    double tempAtual = 37.1;

    @Override
    public String toString() {
        return String.format("Local do sensor: " + this.local + "\n Última temperatura medida: %.1f", this.tempAtual);
    }


}
