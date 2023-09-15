import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
            
        while (mesada > 0) {
            double valorDoce = valorAleatorio(); // Valor aleatorio conforme o metodo
            
            if (valorDoce > mesada) // Se o valorDoce for maior que a mesada, entrar no if
                valorDoce = mesada; // Ai eles se igualam aqui ZERO

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; // saiu do if valorDoce = mesada, então substituira pelo menos valor e dara ZERO
        }
            
        System.out.println("\nMesada:" + mesada); // Dando zero na condição while, vira pra cá e mostrar as mensagens finais
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // Vai de origin até bound, no caso 2 a 8 sorteado
    }
}
// Presta atenção.