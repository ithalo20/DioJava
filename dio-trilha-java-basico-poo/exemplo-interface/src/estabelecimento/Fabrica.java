package estabelecimento;
import equipamentos.impressora.Deskjet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional equipamentoMultiFuncional = new EquipamentoMultiFuncional();
        
        equipamentoMultiFuncional.digitalizar();
        equipamentoMultiFuncional.copiar();
        equipamentoMultiFuncional.imprimir();
        
        //Se eu quiser imprimir outra classe que implementa eu posso também.
        Deskjet deskjet = new Deskjet();
        deskjet.imprimir();

    }
}


/*
 * interface: é um tipo uma classe de herança "multipla", está entre aspas pq n existe herança multipla em java
 * e a interface faz um metodo sem corpo como fosse abstrata.
 * implements: é tipo um extends, porém para classes do tipo interfaces, no caso assume o papel.
 */