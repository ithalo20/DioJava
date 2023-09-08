import java.util.Locale;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("\nOla, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
    }
}

/*  Lembre-se a diferença de next(); e nextLine(); é, 
next() lê a String até o primeiro espaço enquanto 
nextLine() lê até encontrar uma quebra de linha.

LEMBRE-SE next vai de acordo com o tipo de variavel, a string n precisa declarar, ja as demais sim
*/