package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer<>
 * Representa uma operação que aceita um argumento do tipo T (T = Type representa que posso colocar qualquer tipo) e não retorna nenhum resultado, logo imprime.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        // Se implementado certinho não preciso declarar Consumer e fazer direto no numeros.stram
        Consumer<Integer> imprimirNumeroPar = numero -> {// argumento -> corpo
            if (numero % 2 == 0) { //corpo
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}

