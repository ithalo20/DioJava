public class Moto extends Veiculo  { //(Herança da classe Veiculo. O extends serve para puxar informações de outra classe)
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("MOTO LIGADA");
    }
    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO EM \"N\"");
    }
}

