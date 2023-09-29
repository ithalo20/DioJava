package main.java.list.Ordenacao;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList; //Pessoa tem implements pq eu implementei na classe Pessoa

    public OrdenacaoPessoas() {//Metodo construtor
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); //Esse array n vai começar vazia, ja vai começar quem estiver na pessoaList
        Collections.sort(pessoasPorIdade); //sort(deixa ordenado)
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); //new ComparatorPorAltura é a nova classe instanciada
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1",20, 1.56 );
        ordenacaoPessoas.adicionarPessoa("Nome 2",30, 1.80 );
        ordenacaoPessoas.adicionarPessoa("Nome 3",25, 1.70 );
        ordenacaoPessoas.adicionarPessoa("Nome 4",17, 1.56 );

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
