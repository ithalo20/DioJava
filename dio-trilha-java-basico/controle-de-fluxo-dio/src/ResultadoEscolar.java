public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 10;
       
       if (nota >= 7) {
            System.out.println("Aprovado");
       }
       
       else if (nota > 5 && nota < 7) {
            System.out.println("Prova de Recuperação");
       }

       else {
           System.out.println("Reprovado");
       }
    }
}

// Condicional Simples tem apenas uma condição (if)
// Condicional Composta tem apenas duas condições. (if/else)
// Condicional Encadeada tem três ou mais condições (if/else if/else)

/* Condição ternária ela serve para abreviar as condições em uma linha de codigo só (? :)
exemplo: int nota = 6;
		    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		    System.out.println(resultado);*/