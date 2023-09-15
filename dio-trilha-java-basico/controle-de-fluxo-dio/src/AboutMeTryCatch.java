import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTryCatch {
  public static void main(String[] args) {
    try {
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
      System.out.println("\nOlá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm ");
      scanner.close();
    } 
    catch (InputMismatchException Erro_numerico) { // esse Erro_numerico, é apenas um nome qualquer para dar ao erro, geralmente usa e
      System.out.println("\nOs campos idade e altura precisam ser númericos"); //ou System.err.println();
    }
  
  }
}

/* Estrutura de um bloco com try e catch:
 * 
 * try {
  //  bloco de código conforme esperado
}
 *catch(Exception e) {// precisamos saber qual exceção
 * // bloco de código que captura as exceções que podem acontecer
   // em caso de um fluxo não previsto
}
 * 
*/