package main.java.map.Pesquisa;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    //Atributos Key, Value
    private Map<String, Integer> contagemPalavrasSet;

    //Construtor
    public ContagemPalavras() {
        this.contagemPalavrasSet = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasSet.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavrasSet.remove(palavra);
    }

    public void exibir(){
        System.out.println(contagemPalavrasSet);
    }
    public int exibirContagemPalavras(){ //Contagem é Value
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasSet.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0; //Armazenador de número
        for (Map.Entry<String,Integer> entry : contagemPalavrasSet.entrySet()){
            if (entry.getValue() > maiorContagem){//getValue é o valor de Value nesse caso Value é o Integer
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey(); //getKey é o valor da Key
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);


        // Remover palavra
        contagemLinguagens.removerPalavra("JavaScript");

        // Exibir elementos
        contagemLinguagens.exibir();

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
