package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio8 {
    public static void main(String[] args) {
        System.out.println("Desafio 8 - Somar os dígitos de todos os números da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros
                .stream()
                .reduce(0, Integer::sum); //Integer::sum pq ele vai navegar pelo integer e somar tudo
        //.reduce(0, (n1, n2) -> n1 + n2);//Lambdda

        System.out.println("A soma dos números é: " + resultado);
    }
}