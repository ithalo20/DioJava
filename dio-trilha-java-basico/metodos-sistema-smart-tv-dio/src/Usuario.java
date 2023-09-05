public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); //Ele jogou a classe SmartTv e convertou para a classe com o metodo principal


        //Estado ligado ou desligado
        smartTv.ligar();
        smartTv.desligar();

        //Canais
        System.out.println("\nCanal Atual: " + smartTv.canal);
        smartTv.mudarCanal(14);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        //Volume
        System.out.println("\nVolume Atual: " + smartTv.volume);
        smartTv.diminuirVolume(); //metodo da outra classe, transferido
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        
        
    }
}