package main.java.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    //Método Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Metodo adicionandoConvidado
    public void adicionarConvidado (String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Metodo remover convidado por codigo, lembre-se que no hash só aceita elemetos DIFERENTES, por isso o código de convite ja que o codigo nunca se repete em outro elemento.
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break; //Parar laço de repetição pq ja encontrou o codigo, n faz sentido continuar
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Metodo contar convidado
    public int contarConvidados(){
        return convidadoSet.size(); //.size conta os elementos da lista
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");


        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");


        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");


        conjuntoConvidados.exibirConvidados();
    }
}
