import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		scanner.close();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException Exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		
		System.out.println("\n-- Impressão de variação de contagem -- \n");
		
		for (int indice = 0; indice < contagem; indice++) // é < pq esta como +1 o indice no syout, se n ultrapassaria o numero da variavel contagem
			System.out.println("Imprimindo a variação da contagem da subtração: " + (indice+1)); 
	}	
}