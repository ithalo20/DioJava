public abstract class ServicoMensagemInstantanea { //(Abstração)
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}

/*
 * A Abstração é como fosse: meus filhos (classes filhas), eu não sei como mas eu preciso dizer
 * para o mundo que vocês são uma classe de serviço de mensagem
* porém para vocês serem, no minimo precisará dessas duas ações implementadas, enviar mensagem e receber mensagem
 */

/*
* Nota: Cada classe tem sua particularidade de fazer algo, exemplo, seria estranho se a microsoft
* simplesmente dessse o codigo do MSN para o Facebook não é mesmo?, então cada um tem sua maneira
* de fazer acontecer.
* Percebe-se que nas classes filhas eu vou fazer uma alteração especifica no syout para cada uma
*/

/*
 * Na herança tinhamos uma forma de fazer apenas, que pegava a classe pai do jeito que tava 
 * e simplesmente tacava, agora na abstração podemos fazer nossas alterações para dar
 * modificação para cada classe especifica.
 */