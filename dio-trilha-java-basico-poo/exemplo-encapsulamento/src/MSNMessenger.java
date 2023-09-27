public class MSNMessenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	
	// Essas informações não precisa ser publica para os usuarios, então private
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}

//O Encapsulamento não é nada mais que ESCONDER alguns metodos.]