package interface_operacao;

public class MainOperacao {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Subtracao: " + subtracao.calcular(10, 5));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(10, 5));
        System.out.println("Divisao: " + divisao.calcular(10, 5));
    }

}
