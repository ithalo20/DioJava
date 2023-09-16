import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = contaFinalizada(valorInicial, taxaJuros, periodo);

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,##0.00"); // formata para o jeito que esta ai

        System.out.println("Valor final do investimento: R$" + decimalFormat.format(valorFinal));

        scanner.close();
    }

    static double contaFinalizada(double valorInicial, double taxaJuros, int periodo) {

        double contaFinalizada = valorInicial * Math.pow((1+taxaJuros/100), periodo);
        return contaFinalizada;
    }
}