package desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio17 {
    public static void main(String[] args) {
        System.out.println("Desafio 17: Filtrar os números primos da lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        Desafio17 desafio17 = new Desafio17();
        List<Integer> primos = numeros
                .stream()
                .filter(desafio17::numeroPrimo)
                .toList();

        System.out.println(primos);
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
A função isPrimo é usada para verificar se um número é primo ou não.
Os números primos são então coletados em uma nova lista, e essa lista é impressa.
Isso fornecerá a lista de números primos da lista original.
 */
