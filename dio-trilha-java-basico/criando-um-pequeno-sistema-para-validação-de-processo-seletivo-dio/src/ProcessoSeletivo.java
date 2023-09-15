import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        for (String candidato : candidatos) { //for each
            entrandoEmContato(candidato);
        }

    }

    //CASO 4
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{ //entra quando for verdadeira a condição
            atendeu = atender(); //random para true ou false,  se ele atendeu == true
            continuarTentando = !atendeu; // se em cima deu true, aqui vira == false, se vira false ele vai no else abaixo, se for false e virar true, ele cairá no if e continuara tentando
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO "); //False vai dar contato realizado.
        }
        while (continuarTentando && tentativasRealizadas < 3);{ //Entra quando for falso a condição
            if (atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

        }
    }

    
    //CASO 4, Método Atender
    static boolean atender() {
        return new Random().nextInt(3) == 1; //de 1 a 3 se for ==1 é True
    }
    
    //CASO 3
    static void imprimirSelecionados (){
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]); // o indice+1 é só na impressao comecar de 1 em vez de 0
        }
        
        //Forma abreviada com For Each
        System.out.println("Forma abreviada com For Each");

        for (String candidato : candidatos) { // For Each, vai percorrer todos os candidatos por esse nova variavel candidato
            System.out.println("O candidato seleciona foi " + candidato);
        }
    }
    

    //CASO 2
    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual]; // indice zero e vai aumentando um em um candidatoAtual++; lá embaixo
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++; //Aqui

        }
    }
    //CASO 2
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    
    //CASO 1
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}







/*      analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);
 */