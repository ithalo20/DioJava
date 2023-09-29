package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    //Atributos
    private List<Integer> numeroList; //Integer é um objeto da java.lang, ele ja possui o Collections, não preciso implementar

    //Construtor
    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    //Adicionando numero na lista
    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(numeroList);
        if(!numeroAscendente.isEmpty()) {
            Collections.sort(numeroAscendente); //Ordenando em Crescente
            return numeroAscendente;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDescendente = new ArrayList<>(numeroList);
        if(!numeroDescendente.isEmpty()) {
            numeroDescendente.sort(Collections.reverseOrder()); //Ordenando em Decrescente
            return numeroDescendente;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(40);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());


    }

}
