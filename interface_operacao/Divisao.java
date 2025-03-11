package interface_operacao;

public class Divisao implements operacao {
    @Override
    public double calcular(double x, double y) {
        return x / y;
    }

}
