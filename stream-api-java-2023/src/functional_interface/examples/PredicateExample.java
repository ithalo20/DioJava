package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate<>
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso), logo nao preciso declarar a saida já que sempre é boolean.
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5; //argumento palavra é criado na hora, > 5 true

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(p -> p.length() > 5) //new Predicate<String>()
                .forEach(System.out::println);
    }
}