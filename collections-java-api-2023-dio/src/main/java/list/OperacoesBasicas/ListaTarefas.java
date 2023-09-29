package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() { //Método Construtor, sem parametros.
        this.tarefaList = new ArrayList<>(); //ArrayList vazio
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); //Adicionou construtor da classe Tarefa Tarefa no add
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); //Criado lista vazio "tarefasParaRemover"
        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao))
                    tarefasParaRemover.add(t);
            }
            tarefaList.removeAll(tarefasParaRemover); //Apos o laço de repetição vai remover todas tarefasParaRemover, adicionadas
        }
        else{
            System.out.println("A lista esta vazia");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); //.size retorna um total de elementos da lista em numeros inteiros.
    }

    public void obterDescricoesTarefas() { //É void, pq vou retornar uma lista em um print
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        }

        else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas(); //Criação de new objeto, ListaTarefas são arrays la no metodo construtor
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas()); // = 0

        //3 Tarefas adicionadas
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas()); // = 3

        listaTarefas.removerTarefa("Tarefa 1"); //Vai remover essa Tarefa 1, mesmo duplicada
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}