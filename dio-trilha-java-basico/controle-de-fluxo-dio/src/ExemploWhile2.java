import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile2 {
    public static void main(String[] args) {
        double mesada = 100;

        while (mesada > 0) {
            double metodoAleatorio = valorAleatorio();

            if (metodoAleatorio > mesada) { // A ideia é subtrair até o metodoAleatorio for maior que a mesada
                metodoAleatorio = mesada; // Ai eles se igualam aqui
            }

            System.out.println("Doce do valor: " + metodoAleatorio + " Adicionado no carrinho");
            mesada = mesada - metodoAleatorio; // Se como se igualaram eles iram se substituir o que dara ZERO, ai acaba o looping
        }
    
        System.out.println("\nMesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces"); // E gera o resultado

    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // Vai de origin até bound, no caso 2 a 8 sorteado
    }
}
