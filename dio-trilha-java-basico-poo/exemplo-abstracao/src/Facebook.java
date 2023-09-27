public class Facebook extends ServicoMensagemInstantanea {

    //Adicionando metodos abstratos da classe pai/mãe.
    public void enviarMensagem() {
       System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}

// Override também conhecido como sobrescrita é quando reescrevemos a lógica de um método que foi herdado da classe pai/mãe.