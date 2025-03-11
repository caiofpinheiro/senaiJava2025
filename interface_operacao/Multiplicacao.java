package interface_operacao;

public class Multiplicacao implements operacao {
    @Override
    public double calcular(double x, double y) {
        return x * y;
    }

}
