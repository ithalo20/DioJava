package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> { //Preciso implementar o Comparable ja que essa classe n tem o Collections
    //Atributos
    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura) {//Método construtor
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    //Vamos trabalhar com Integer, pq se trata de Idade
    public int compareTo(Pessoa p) { //Implements do Comparable <>
        return Integer.compare(idade, p.getIdade()); //Comparar com a idade do parametro passado
    }

    public String getNome() { //Como está privado, coloco o get
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String toString() {
        return String.format("Nome: %s, Idade: %d, Altura: %.2f",nome,idade,altura);
    }
}

//O Comparator não afeta a classe original, a classe atual não é modificada

class ComparatorPorAltura implements Comparator<Pessoa> {

    //Vamos trabalhar com Double, pq se trata de altura
    public int compare(Pessoa p1, Pessoa p2) { //parâmetros pessoa1, pessoa2
        return Double.compare(p1.getAltura(),p2.getAltura());
    }

}



