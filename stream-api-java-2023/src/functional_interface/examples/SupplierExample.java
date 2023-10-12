package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Supplier<>
 * Representa uma operação que não aceita NENHUM argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!"; // argumento vazio -> corpo

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao) //Se eu colocar o corpo inteiro de cima, ja daria pra implementar sem estrutura de cima
                .limit(5) //Repetições
                .toList();
        //.collect(Collectors.toList()); //Metodo para colocar em uma Lista, Collectors.toList(), a IDE diz pra resumir para .toList()


        // Imprimir as saudações geradas
        //listaSaudacoes.forEach(s -> System.out.println(s)); //argumento -> corpo (lambda)
        listaSaudacoes.forEach(System.out::println); // method reference
    }
}