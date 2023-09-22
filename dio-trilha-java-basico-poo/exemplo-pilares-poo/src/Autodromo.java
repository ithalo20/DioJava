public class Autodromo {
    public static void main(String[] args) {
        //Abstração
        Carro jeep = new Carro();
        jeep.setChassi("7627442");
        jeep.ligar(); //(Encapsulado)

        //Polimorfismo
        Moto z400 = new Moto();
        z400.setChassi("1283712"); //(Herança)
        z400.ligar();
    }
}

/*(Encapsulado) - Tem informações encapsuladas no metodo ligar, feita na classe Carro,
*algo que o Condutor não precisa fazer, ja faz de forma automatica, 
*nesse caso basta ele ligar apenas
*/

//(Herança) - Consegue herdar Caracteristicas e Comportamentos de outra classe

/*
*(Abstract) - Não sei como as coisas acontecem porém para ser tal coisa, precisará de tal comportamento
*exemplo, para ser um veiculo automaticamente precisará ter o comportamento de ligar.
*/
