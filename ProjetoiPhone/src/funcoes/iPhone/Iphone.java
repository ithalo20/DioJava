package funcoes.iPhone;

import funcoes.musica.ReprodutorMusica;
import funcoes.navegador.Safari;
import funcoes.telefone.Telefone;

public class Iphone implements ReprodutorMusica, Safari, Telefone {

    //Reprodutor Musical
    public void tocarMp3() {
        System.out.println("Tocando música no iPhone");
    }
    public void pausarMp3() {
        System.out.println("Pausando música no iPhone");
    }
    public void selecionarMp3() {
        System.out.println("Selecionando música no iPhone");
    }

    //Navegador
    public void exibirPagina() {
        System.out.println("Exibindo página no iPhone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }

    //Ligação
    public void ligar() {
        System.out.println("Ligando pelo iPhone");
    }

    public void atender() {
        System.out.println("Atendendo no iPhone");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz no iPhone");
    }
}

