// Modo condicional switch/case
/*
 * Um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algoritmo seria conforme ilustração abaixo:
Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
O sistema terá 03 planos: BASIC, MIDIA , TURBO;
BASIC: 100 minutos de ligação;
MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
 */

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            
            default:
                System.out.println("Opção invalida");
		}
	}
}

/*Switch Case, se executar uma condição ele vai até as outras condições abaixo, 
para nao acontecer isso tem q colocar um break
para quebrar o fluxo */