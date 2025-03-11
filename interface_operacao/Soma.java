package interface_operacao;

public class Soma implements operacao {
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }

}
