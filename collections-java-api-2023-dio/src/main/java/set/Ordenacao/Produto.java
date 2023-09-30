package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> { //implementar Comparable, para deixar ordenado produtosPorNome

    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Implements Comparable
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome()); // O metodo ja sabe como comparar metodo por produtoNome
    }


    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

//Class comparator

class ComparatorPorPreco implements Comparator<Produto>{

    //Implementor Comparator
    @Override
    public int compare(Produto p1, Produto p2) { //produto1, produto2
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

