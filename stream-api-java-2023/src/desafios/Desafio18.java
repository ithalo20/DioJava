package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        System.out.println("Desafio 18: Verifique se todos os números da lista são iguais");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        boolean iguais = numeros.stream()
                .distinct() // Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação.
                .limit(2) // Limita o número de elementos da Stream aos maxSize primeiros elementos
                .count() <= 1; //Retorna o número de elementos na Stream.

        if (iguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Os números da lista não são todos iguais.");
        }
    }
}

/*
Usamos a função distinct para eliminar duplicatas na lista,
limit(2) para limitar o fluxo a apenas dois elementos (para economizar tempo de processamento,
já que apenas precisamos verificar se há no máximo dois valores diferentes) e count() para contar os elementos distintos restantes.
Se houver apenas um ou nenhum elemento distinto, isso significa que todos os números na lista são iguais.
Caso contrário, informamos que os números na lista não são todos iguais.
 */