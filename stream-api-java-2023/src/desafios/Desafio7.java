package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        System.out.println("Desafio 7: Encontrar o segundo número maior da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int primeiroMaior = numeros
                .stream()
                .max(Integer::compareTo)
                .orElse(0); //Finalizar

        int segundoMaior = numeros
                .stream()
                .filter(n -> n < primeiroMaior)
                .max(Integer::compareTo)
                .orElse(0); //Finalizar

        if (segundoMaior != 0) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior);
        } else {
            System.out.println("Não há um segundo número maior na lista.");
        }
    }
}