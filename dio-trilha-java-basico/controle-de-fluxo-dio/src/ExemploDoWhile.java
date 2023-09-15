import java.util.Random;
public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }
        
        while (tocando()); { // no Do While, é o contrario, a expressão quando for falsa que entrara no WHILE e para de entrar no DO, por isso return ta invertido
            System.out.println("Alô !!!");
        }
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; // Pode vir um valor aleatorio de 1 a 3, se esse valor for == 1 é true, atender a condição
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return !atendeu;
	}
}

//estrutura do controle de fluxo do while

/*

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);

*/