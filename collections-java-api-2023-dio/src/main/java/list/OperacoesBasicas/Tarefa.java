package main.java.list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao) { //Método construtor
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() { //toString tem como o objetivo é trazer uma representação textual de uma instância de um objeto. no casso array
        return descricao;
    }
}