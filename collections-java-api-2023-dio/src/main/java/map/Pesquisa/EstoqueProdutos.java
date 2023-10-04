package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> produtoMap; //long = Key, produto = value

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();//HashMap vazio, esperando elementos
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco)); //cod =  key, produto = value
    }

    public void exibirProdutos() {
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0; //Variavel para armazenar
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) { //.values tera acesso as coleções produtos (pela possição Value)
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;

    }


    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }

        }
    return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double maiorPreco = Double.MAX_VALUE;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() < maiorPreco) {
                    produtoMaisBarato= p;
                }
            }

        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!produtoMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtoMap.entrySet()) { //Entry é pra colocar <Key,Value>
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
