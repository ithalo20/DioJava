package apps;
public class MSN extends ServicoMensagemInstantanea {

    //Adicionando metodos abstratos da classe pai/mãe.
    public void enviarMensagem() {
        System.out.println("MSN");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
    
    
}
