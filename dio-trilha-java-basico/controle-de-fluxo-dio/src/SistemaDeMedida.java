// Modo condicional switch / case
public class SistemaDeMedida {
	public static void main(String[] args) {
		String sigla = "P";

		switch (sigla) { // Significa, caso a variavel do switch (sigla), for = "P" execute case "P"
            case "P":{
                System.out.println("PEQUENO");
                break; // Colocamos o break pq se n ele executa os outros blocos
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default: { // É tipo um else, só que da estrutura do switch case
                System.out.println("INDEFINIDO");
            }
		
        }
	}
}

/*Switch Case, se executar uma condição ele vai até as outras condições abaixo, 
para nao acontecer isso tem q colocar um break
para quebrar o fluxo */