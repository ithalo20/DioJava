package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        System.out.println("Desafio 14: Encontre o maior número primo da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        Desafio14 desafio14 = new Desafio14();
        Optional<Integer> maiorPrimo = numeros
                .stream()
                .filter(desafio14::numeroPrimo)
                .max(Integer::compare);

        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get()); //get para tirar o [], pq so vai pegar o valor
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }


    public boolean numeroPrimo(int numero) {
        if (numero <= 1) { //Expressão false
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

/*
 Usamos a função filter para filtrar apenas os números primos da lista numeros.
 Em seguida, usamos a função max para encontrar o maior número primo.
 O método numeroPrimo é usado para verificar se um número é primo ou não.
 Se houver números primos na lista, o maior número primo será impresso.
 Caso contrário, será informado que não há números primos na lista.
 */
