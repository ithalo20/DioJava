public class SmartTv {
    boolean estadoTv = false; //Ligada ou Desligada, estado da TV no momento
    int volume = 25;
    int canal = 1;
    
    public void ligar(){
        estadoTv = true;
        System.out.println("A TV está ligada");
    }
    
    public void desligar() {
        estadoTv = false;
        System.out.println("A TV está desligada");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume +1;
        //volume += 1;
        
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        //volume = volume -1;
        //volume -= 1;
    }

    public void mudarCanal(int novoCanal) { //Tem parametro, pq teria que saber o canal
        canal = novoCanal;
        
    }

    public void aumentarCanal() {
        canal++;

    }

    public void diminuirCanal() {
        canal--;

    }
    
    

}