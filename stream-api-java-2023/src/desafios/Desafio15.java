package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        System.out.println("Desafio 15: Verifique se a lista contém pelo menos um número negativo:");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        boolean possuiNegativo = numeros.stream()
                .anyMatch(n -> n <= -1); //Ele funciona com boolean True or False

        if (possuiNegativo){
            System.out.println("Possui número negativo nessa lista");
        }
        else{
            System.out.println("Não possui números negativos nessa lista");
        }
    }
}
