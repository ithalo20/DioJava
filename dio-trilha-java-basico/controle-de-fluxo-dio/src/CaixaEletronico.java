public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if (valorSolicitado < saldo) {
           saldo = saldo - valorSolicitado;
           System.out.println("Novo saldo: " + saldo);
       }
       
       else {
            System.out.println("Saldo insuficiente");
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