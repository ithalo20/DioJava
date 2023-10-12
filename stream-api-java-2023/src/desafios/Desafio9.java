package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        System.out.println("Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        boolean numeroRepetidos = numeros.stream()
                .allMatch(num -> numeros.stream().filter(n -> n == num).count() == 10);

        if(numeroRepetidos){
            System.out.println("A lista possui números repetidos na lista");
        }
        else{
            System.out.println("A lista não possui números repetidos");
        }
    }
}
