public class SistemaIbge {
    public static void main(String[] args) {
        
        //esse "e" foi é o nome da variavel para percorrer a classe enum
        //o for serve para percorrer como fosse uma lista que contem todas as informações
        for (EstadoBrasileiro estados : EstadoBrasileiro.values()) {
            System.out.println(estados.getSigla() + " - " + estados.getNomeMaiusculo() + " - " + estados.getIbge());
        }
        
        /*Escolhendo de forma avulsa um estado que contem no enum
        //percebe-se que é como fosse instanciar um objeto, bem semelhante
        //porem nao coloco o new, eu apenas especifico a constante que quero
        escolher do enum
        */
        EstadoBrasileiro saoPaulo = EstadoBrasileiro.SAO_PAULO;

        System.out.println("\n" + saoPaulo.getSigla());
        System.out.println(saoPaulo.getNome());
        System.out.println(saoPaulo.getNomeMaiusculo());
        System.out.println(saoPaulo.getIbge());
    }
}

// values(): como percorrer valores enum
/*utilizamos a estrutura de repetição for para percorrer os itens armazenados na variável “estados”
que retorna os valores por meio da chamada ao método values() em “EstadoBrasileiro.values()
*/
