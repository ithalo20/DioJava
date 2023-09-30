package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() { //Construtor
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>(); //Nova lista
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) //startsWith é um metodo onde retorna true, se começar com determinado caracter, no caso Camila, então todas as camilas retornaram true
                contatoPorNome.add(c); //Adicionando na nova lista
        }
        return contatoPorNome; //Retornando os nomes na nova lista
    }

    //Contato atualizado
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null; //contatoAtualizado = null, pois ele não esta preenchido de valor até o momento
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c; //contatoAtualizado, está preenchido agora
                break; //Encontrei o contato, não preciso mais percorrer a lista
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 652524);
        agendaContatos.adicionarContato("Maria Silva", 222222);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila")); //Apenas procurará por esse nome

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 33322)); //Contato de Maria, atualizado

        agendaContatos.exibirContatos();
    }
}
