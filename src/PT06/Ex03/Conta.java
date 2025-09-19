package PT06.Ex03;

public class Conta {
    double saldo;

    public String exibirSaldo(){
        return "Saldo atual: "+this.saldo;
    }

    public void zerarSaldo(){
        this.saldo = 0.0;
    }
}
