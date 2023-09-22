package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha(); //sabemos que ele pegou lanche na cozinha, porém ta private pq n precisa explanar
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() { //default ou private
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() { //default, pois
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() { //default ou private
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}
