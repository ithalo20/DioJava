package apps;
public class Facebook extends ServicoMensagemInstantanea {

    //Adicionando metodos abstratos da classe pai/mãe.
    public void enviarMensagem() {
        System.out.println("\nFacebook");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
