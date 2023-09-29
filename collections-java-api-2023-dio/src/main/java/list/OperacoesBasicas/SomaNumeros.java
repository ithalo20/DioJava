package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //Atributo
    private List<Integer> numeroList;

    public SomaNumeros() { //Metodo construtor.
        this.numeroList = new ArrayList<>(); //numeroList passa a ser um New ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0; //Vai armazenar
        for (Integer listaNum : numeroList) {
            soma += listaNum;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero >= maiorNumero) //Ele vai ir do menor numero até o maior, quando chegar no maior ele vai igualar
                    maiorNumero = numero;
            }
            return maiorNumero;
        }

        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() throws RuntimeException {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero <= menorNumero) //Ele vai ir do maior numero até o menor, quando chegar no menor ele vai igualar
                    menorNumero = numero;
            }
            return menorNumero; //Return sempre dentro do if
        }

        else{
            throw new RuntimeException("A lista está vazia!"); //Usamos o throw new, quando tem um return
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(numeroList);
        }

        else{
            System.out.println("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(40);

        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumeros();

        System.out.println("\nSoma dos números: " + somaNumeros.calcularSoma());

        System.out.println("\nMaior número da lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("\nMenor número da lista: " + somaNumeros.encontrarMenorNumero());
    }
}