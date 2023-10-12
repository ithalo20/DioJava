package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        System.out.println("Desafio 3: Verifique se todos os números da lista são positivos");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 5);

        boolean verificarPositivo = numeros.stream()
                .allMatch(n -> n > 0);

        if (verificarPositivo) {
            System.out.println("Todos os números são positivos");
        } else
        {
            System.out.println("Há numeros negativos na lista");
        }
    }
}

/*
Usamos a função allMatch para verificar se todos os números na lista são maiores que zero (positivos).
Se todos os números forem positivos, a mensagem "Todos os números da lista são positivos" será impressa.
Caso contrário, será informado que há pelo menos um número negativo na lista.
 */