package lanchonete.atendimento.cozinha;

//import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default (questionamento a se pensar)
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}

	//pode ser default (questionamento a se pensar)
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}

	//pode ser default (questionamento a se pensar)
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}

	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}

	// pode ser default ou private, mas como n faz sentido o almoxarifado saber, então coloquei private
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	// deixei private, pq n tem necessidade de mais ninguem saber como selecionar os ingredientes
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	// deixei private, pq n tem necessidade de mais ninguem saber como selecionar os ingredientes
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}

	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}

	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

	/*public void pedirParaTrocarGas(Atendente meuAmigo) { // Essa ação foi EXCLUIDA, pois Cozinheiro n tem contato com o Atendente
		meuAmigo.trocarGas();								  pois estão em niveis diferentes de pacotes
	}
	*/
	

	//pode ser default ou private, como é algo que n quero que a cozinha inteira saiba, apenas algo que vou pedir pro almoxarife e ele me entrega, entao é private, lembrando que eu to conseguindo pedir pq ta default o meuAmigo.trocargas();
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	//pode ser default ou private, como é algo que n quero que a cozinha inteira saiba, apenas algo que vou pedir pro almoxarife e ele me entrega, entao é private, lembrando que eu to conseguindo pedir pq ta default o meuAmigo.entregarIngredientes();
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}