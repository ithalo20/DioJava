package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Atributos String = key, Integer = value
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //Método adicionando contato
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone); //.add é apenas em List e Set, no Map é .put.
    }

    //Método removendo contato
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);//Como a Key é um valor único, não precisamos do laço de repetição, apenas colocamos no remove(), e a Key nesse caso foi o nome
        }
        else{
            System.out.println("A agenda de contato está vazia");
        }
    }

    //Método exibindo contatos no Map
    public void exibirContatos(){
        if(!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        }
        else{
            System.out.println("A agenda de contato está vazia");
        }

    }

    public  Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null; //Variável Integer vazia
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome); //Retorna um Integer, o value de key
        }

        if(numeroPorNome == null) {//Null = vazia, caso não tiver o nome especifico na agenda, vai retornar nesse bloco
            System.out.println("\nContato não encontrado na agenda");
        }
        return numeroPorNome;

    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João"; //Nova variavel
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome(nomePesquisa);
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);


    }
}

//Quando está vazio o Map, nota que aparece {}, diferente do List e Set que é []

//Key é o nome String, Value é o telefone Integer

/*
Vale lembrar que o .put() tbm consegua atualizar, se eu fizer outro bloco de atualizar e eu trocar o telefone, ele atualiza
Um exemplo é aqui mesmo, ele vai mostrar o Camila, 44444, pois foi a ultima Camila, já que ele não repete elementos (key)
 */