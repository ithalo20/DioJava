public class ComputadorVictor {
    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
		System.out.println("\nMSN");
        msn.enviarMensagem();
		msn.receberMensagem();
		
        Facebook fbm = new Facebook();
		System.out.println("\nFacebook");
        fbm.enviarMensagem();
		fbm.receberMensagem();
		
        Telegram tlg = new Telegram();
		System.out.println("\nTelegram");
        tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}