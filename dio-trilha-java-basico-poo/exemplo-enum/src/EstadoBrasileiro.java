// LEMBRE-SE O enum DEVE SER CRIADO PARA COISAS QUE NÃO HAVERAR MUDANÇAS, COMO ESTADO BRASILEIRO, GRAU DE ESCOLARIDADE E POR AI VAI
//PARA VALORES JÁ PRE ESTABELECIDOS

public enum EstadoBrasileiro {
	//Após tem q ser virgula, ponto e virgula só quando finalizar
	//Estou criando uma constante de objeto
	//Os parametros tem q estar alinhado com o construtor
	SAO_PAULO ("SP","São Paulo",11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro",21),
	PIAUI ("PI", "Piauí", 86),
	MARANHAO("MA", "Maranhão",99),
	CEARA("CE", "Ceará",88);
	
	//Atributos seguindo as conveções do JavaBeans
	private String sigla;
	private String nome;
	private int ibge;
	
	//metodo construtor private, pois ninguem precisa construir um enum de fora, entao o enum tem q ser private sempre.
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	// Metodo para deixar nome maiusculo
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	public int getIbge() {
		return ibge;
	}
}
