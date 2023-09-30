package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CadastroProdutos {

    //Atributos
    private Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){ //Comparable
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // HashSet adiciona de forma aleatoria, então usaremos TreeSet<>(produtoSet) pra ja puxar o produtoSet
        return produtosPorNome; //Não precisei do collections.sort, pq é para List, no momento que deixei dentro do TreeSet, eu fiz a logica de comparable na classe Produto, para o produtoSet ja saber deixar organizado
    }

    public Set<Produto> exibirProdutosPorPreco(){ //Comparator
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco()); // newComparatorPorPreco, pq eu criei ja com a condição de como organizar na classe Produto.
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }

}

