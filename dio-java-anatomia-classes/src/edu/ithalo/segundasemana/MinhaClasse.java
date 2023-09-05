package edu.ithalo.segundasemana;

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Ithalo";
        String segundoNome = "Laurentino";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome); // puxou o metodo String nomeCompleto e colocou na variavel
        
        System.out.println(nomeCompleto); // chamou a variavel com o resultado do metodo
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome); // concatenação

    }

}

// void = Retornará nada
// in = input(entrada)
// out = output (saida)

// para transformar a variavel em constante, basta escrever "final" e o nome da constante em MAIUSCULO

// diferença de print e println, o println ele ja da um break, o print normal junta tudo
// quando formos mudando a variavel conforme o codigo, nao precisa declarar o dado de tipagem dnv, só a variavel.
// TODOS OS METODOS TEM SEUS PARAMETROS
// igual a função Def no Python, tem como você chamar os metodos e colocar num variavel e depois jogar no print