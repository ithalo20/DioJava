package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação = private
		//cozinheiro.lavarIngredientes();
		//cozinheiro.baterVitaminaLiquidificador();
		//cozinheiro.selecionarIngredientesVitamina();
		//cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
    
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		

			//Essa classe o Estabelecimento não tem acesso, pois os metodos estão private e default, a aplicação dela não é diretamente em estabelecimento
		//Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		//almoxarife.entregarIngredientes();
		//almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha(); //private
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		//atendente.trocarGas(); está em default em atendimento, logo nem a cozinha tem acesso, logo não conhece.
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		//cliente.consultarSaldoAplicativo();  // private, pois ninguem precisa saber da consulta do Cliente
		
		//já pensou os clientes ouvindo que o gás acabou ?
		//cozinheiro.pedirParaTrocarGas(atendente); //O metodo chamado está (default) em outra classe (Almoxarife), logo só Cozinheiro tem acesso.
		//cozinheiro.pedirParaTrocarGas(almoxarife); //Esta (private) pois é algo que não deve ser compartilhado com ninguem, apenas fiz o pedido pro almoxarifado
		
	}
}