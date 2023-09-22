package lanchonete.atendimento.cozinha;

public class Almoxarife { // Ele ta na cozinha, mesmo nivel da classe Cozinheiro

	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() { // Está default, então só quem esta na cozinha conseguirá visualizar
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();//...?
	}
	void trocarGas() { // Está default, então só quem esta na cozinha conseguirá visualizar
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}