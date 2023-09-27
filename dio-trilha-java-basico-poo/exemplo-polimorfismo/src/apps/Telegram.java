package apps;
public class Telegram extends ServicoMensagemInstantanea {

    //Adicionando metodos abstratos da classe pai/mãe.
    public void enviarMensagem() {
        System.out.println("\nTelegram");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");

    }
    
}
