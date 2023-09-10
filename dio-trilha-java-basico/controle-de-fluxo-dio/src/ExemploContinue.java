public class ExemploContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}

// break ele interrompe o fluxo, o continue ele simplesmente faz voltar para o fluxo normal quando bate nele.