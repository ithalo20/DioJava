public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;
    
        if (condicao1 && (7>4)) { // As duas condições são true
            System.out.println("As duas condições são verdadeiras");
        }
        
        if (condicao1 || condicao2) { // Apenas condicao1 é true
            System.out.println("Uma das condições é verdadeira");
        }
        
        System.out.println("Fim");

    }
}
