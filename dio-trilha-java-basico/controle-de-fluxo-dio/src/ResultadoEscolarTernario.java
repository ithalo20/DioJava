public class ResultadoEscolarTernario {
	public static void main(String[] args) {
		int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado"; // como é condição, nao se prende apenas um tipo de dado
		
        System.out.println(resultado);
	}
}

// Condicional Simples tem apenas uma condição (if)
// Condicional Composta tem apenas duas condições. (if/else)
// Condicional Encadeada tem três ou mais condições (if/else if/else)

/* Condição ternária ela serve para abreviar as condições em uma linha de codigo só (? :)
exemplo: int nota = 6;
		    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		    System.out.println(resultado);*/

// if = ? (true)
// else : (false)