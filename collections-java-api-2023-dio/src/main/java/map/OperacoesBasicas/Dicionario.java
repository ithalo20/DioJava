package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    //Atributos
    private Map<String, String> dicionarioMap;

    //Construtor
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }


    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
        else {
            System.out.println("Nome não encontrado no dicionário");
        }
    }

   public void exibirPalavras(){
       System.out.println(dicionarioMap);
   }

   public String pesquisarPorPalavra(String palavra){
        String definicaoPesquisada = null; //Vazio
        if (!dicionarioMap.isEmpty()){
            definicaoPesquisada = dicionarioMap.get(palavra); //Integer
        }

        if (definicaoPesquisada == null){
            System.out.println("\nPalavra não encontrada");
            return "não existe no dicionario";
        }
        return definicaoPesquisada;
   }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1", "Voar");
        dicionario.adicionarPalavra("Palavra 2", "Andar");
        dicionario.adicionarPalavra("Palavra 2", "Voar");
        dicionario.adicionarPalavra("Palavra 3", "Cair");
        dicionario.adicionarPalavra("Palavra 4", "Flutuar");

        dicionario.removerPalavra("Palavra 1");

        dicionario.exibirPalavras();

        // Pesquisar definição por palavra
        String palavraNome = "Palavra 4";
        String definicaoPalavra = dicionario.pesquisarPorPalavra(palavraNome);
        System.out.println("A definição de " + palavraNome + " é " +definicaoPalavra);

        // Pesquisar definição por palavra inexistente
        String palavraNomeInexistente = "Palavra 5";
        String definicaoPalavraInexistente = dicionario.pesquisarPorPalavra(palavraNomeInexistente);
        System.out.println("A definição de " + palavraNomeInexistente + " " + definicaoPalavraInexistente);

    }

}
