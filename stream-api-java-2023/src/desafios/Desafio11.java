package desafios;

import java.util.Arrays;
import java.util.List;
import java. lang. Math;

public class Desafio11 {
    public static void main(String[] args) {
        System.out.println("Desafio 11: Encontre a soma dos quadrados de todos os números da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        int somaQuadrado = numeros
                .stream()
                .mapToInt(n -> (int) Math.pow(n,2)) // ou n*n .map Mapeia para o quadrado de cada número
                .sum(); //Soma dos quadrados

        System.out.println("A soma dos quadrados dos números da lista é: " + somaQuadrado);
    }
}
