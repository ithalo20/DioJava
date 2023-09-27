import java.util.Scanner;
import apps.Facebook;
import apps.MSN;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;
public class ComputadorPedro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ServicoMensagemInstantanea servicoMensagemInstantanea = null;
        /*
            NÃO SE SABE QUAL APP 
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */

        System.out.print("Digite o messenger desejado: ");
        String appEscolhido = scanner.nextLine();
        

        if (appEscolhido.equals("msn"))
            servicoMensagemInstantanea = new MSN();
        else if (appEscolhido.equals("facebook"))
            servicoMensagemInstantanea = new Facebook();
        else if (appEscolhido.equals("telegram"))
            servicoMensagemInstantanea = new Telegram();

        else
            System.out.println("Opção invalida");
        

        servicoMensagemInstantanea.enviarMensagem();
        servicoMensagemInstantanea.receberMensagem();

        scanner.close();
    }  
}

//ServicoMensagemInstantanea servicoMensagemInstantanea = null;