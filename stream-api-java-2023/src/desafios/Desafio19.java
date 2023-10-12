package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        System.out.println("Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        int soma = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(numeros);
        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma);

    }
}

/*
 usamos a função filter para filtrar apenas os números que são divisíveis por 3 e 5,
 e então usamos mapToInt para converter esses números em um fluxo de inteiros
 para que possamos usar a função sum para calcular a soma. O resultado é a soma dos números
 que são divisíveis por ambos 3 e 5 na lista. A saída exibirá essa soma.
 */