package apps;
public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagem");
	}	
}

//Resumindo, no modificador protected é uma visibilidade apenas entre a classe pai com suas classes filhas DE MESMO PACOTE
//lembrando que pra transformar em classe filha tem que colocar extends <e o nome da classe pai>
//