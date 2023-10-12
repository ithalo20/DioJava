package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        System.out.println("Desafio 10: Agrupe os valores ímpares múltiplos de 3 ou de 5");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        List<Integer> resultado = numeros.stream() //Lista
                .filter(n -> n % 2 == 1) // Filtra números ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0)//Filtra números múltiplos de 3 ou 5
                .toList(); //toList só usa quando a variavel for uma lista

        System.out.println("Valores impares múltiplos de 3 ou 5: " + resultado);
    }

}
