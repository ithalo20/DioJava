package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        System.out.println("Desafio 16: Agrupe os números em pares e ímpares");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        Map<Boolean, List<Integer>> parEimpar = numeros.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> pares = parEimpar.get(true);
        List<Integer> impares = parEimpar.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
