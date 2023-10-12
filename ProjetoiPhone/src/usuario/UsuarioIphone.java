package usuario;

import funcoes.iPhone.Iphone;

public class UsuarioIphone {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Ligação
        System.out.println("--- Ligação---\n");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        //Música
        System.out.println("\n--- Música ---\n");
        iphone.tocarMp3();
        iphone.pausarMp3();
        iphone.selecionarMp3();

        //Internet
        System.out.println("\n--- Navegador ---\n");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
