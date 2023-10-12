package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("Desafio 1: Mostre a lista em ordem numérica: ");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println(numerosOrdenados);
    }
}
