public class ComputadorJoao {
	public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
		System.out.println("\nMSN");
        msn.enviarMensagem();
		msn.receberMensagem();
		
        FacebookMessenger fbm = new FacebookMessenger();
		System.out.println("\nFacebook");
        fbm.enviarMensagem();
		fbm.receberMensagem();
		
        Telegram tlg = new Telegram();
		System.out.println("\nTelegram");
        tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}

/*Nota: O ServiçoMensagemInstantanea é uma classe pai, onde ela vai dar de herdar suas caracteristica/atributos
* para as classes filhas (classes que usara esses moldes de caracteritica/atributos), percebe-se
*que no exemplo todos os metodos já sao criados na classe pai, eu apenas usei extends para herdar nas classes filhas
*/