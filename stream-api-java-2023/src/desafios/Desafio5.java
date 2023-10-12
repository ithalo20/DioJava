package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {

                System.out.println("Desafio 5: Calcule a média dos números maiores que 5");

                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

                double media = numeros.stream()
                        .filter(num -> num > 5)
                        .mapToDouble(Integer::doubleValue)//retorna um DoubleStream que consiste nos resultados da aplicação de determinada função aos elementos desse fluxo.
                        .average()// o qual calcula a media dos valores apresentados
                        .orElse(0.0);

                System.out.println("A média dos números maiores que 5 é: " + media);
            }
        }