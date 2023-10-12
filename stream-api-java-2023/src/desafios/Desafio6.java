package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        System.out.println("Desafio 6: Verificar se a lista contém algum número maior que 10:");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream()
                .anyMatch (n -> n > 10); // Retorna true se qualquer um dos elementos da stream corresponde ao predicado fornecido.

        if (maiorQueDez){
            System.out.println("A lista contém números maiores que dez");
        }
        else{
            System.out.println("A lista não possui números maiores que dez");
        }
    }
}
