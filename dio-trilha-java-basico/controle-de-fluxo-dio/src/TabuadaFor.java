import java.util.Scanner;
public class TabuadaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\n --- Tabuado do " + numero + " ---\n");
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);

        scanner.close();
        }
    }
}