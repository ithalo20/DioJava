import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia, nomeCliente;
        Double saldo;
        
        Scanner scanner = new Scanner(System.in);

        // Recebe nome do cliente
        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.next();
        
        // Recebe o número da agência do cliente
        System.out.print("Digite a sua agência: ");
        agencia = scanner.next();
        
        // Recebe o número da conta do cliente
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        
        // Recebe o saldo da conta do cliente
        System.out.print("Digite o saldo da sua conta: ");
        saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é \n"
        + agencia +", conta "+ numero + " e o seu saldo de R$"+ saldo+ "já está disponivel para saque." );

    }
}