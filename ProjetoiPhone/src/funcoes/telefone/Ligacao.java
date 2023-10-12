package funcoes.telefone;

public class Ligacao implements Telefone{

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
