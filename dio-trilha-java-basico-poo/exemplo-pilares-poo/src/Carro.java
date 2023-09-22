public class Carro extends Veiculo { //(Herança da classe Veiculo. O extends serve para puxar informações de outra classe)

    public void ligar() {
        //Encapsulado
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM \"P\"");
    }
}

//Encapsular é esconder ações, deixar ela private, default etc
