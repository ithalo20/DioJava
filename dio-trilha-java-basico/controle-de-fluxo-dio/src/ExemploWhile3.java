import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile3 {
    public static void main(String[] args) {
        double mesada = 50;

        while (mesada>0){
            double valorProduto = valorAleatorio();
            
            if (valorProduto > mesada) {
                valorProduto = mesada;

            }
            mesada = mesada - valorProduto;
            System.out.println("Produto adicionado ao carrinho: " + valorProduto + " Valor restante: " + mesada);
            
        }
        System.out.println("\nValor restante: " + mesada);
        System.out.println("A mesada de Igor, acabou");
    
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // Vai de origin até bound, no caso 2 a 8 sorteado
    } 
}