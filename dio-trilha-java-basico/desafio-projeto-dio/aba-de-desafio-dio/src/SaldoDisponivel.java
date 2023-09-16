import java.util.Scanner;

public class SaldoDisponivel {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    scanner.close();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    int saldoDisponivel = saldoTotal - valorSaque;
    
    if (saldoTotal >= valorSaque)
      
      System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoDisponivel);
      
    else
      System.out.println("Saldo insuficiente. Saque nao realizado!");
  }
}