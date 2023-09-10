public class ExemploBreak {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 6; numero++) {
            if (numero == 3)
                break;
            
            System.out.println(numero);
        }
    }
}


// break ele interrompe o fluxo, o continue ele simplesmente faz voltar para o fluxo normal quando bate nele.