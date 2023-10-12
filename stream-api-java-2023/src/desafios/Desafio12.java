package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        System.out.println("Desafio 12: Encontre o produto de todos os números da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println("O produto dos números da lista é: " + produto);
    }
}
//Talvez esteja errado, so pra constar