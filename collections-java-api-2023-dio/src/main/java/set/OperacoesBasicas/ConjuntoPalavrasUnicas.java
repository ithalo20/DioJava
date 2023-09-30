package main.java.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    //Atributos
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavras(String palavra){
        if (palavrasSet.contains(palavra)){
            palavrasSet.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Messi");
        conjuntoPalavrasUnicas.adicionarPalavra("Neymar");
        conjuntoPalavrasUnicas.adicionarPalavra("Cristiano");

        conjuntoPalavrasUnicas.removerPalavras("Neymar");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Neymar") ? "Esta na lista" : "Não está na lista");
    }
}
