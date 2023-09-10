public class ExemploForArray {
    public static void main(String[] args) {
        
        // Em arrays o indice se inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; // Array, conjunto de elementos de um tipo correspondente.

        for (int x = 0; x < alunos.length; x++) { // Criamos uma variavel x dentro do for, lenght conta a quantidade de elementos 

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]); // alunos [x] é pra mostrar o aluno daquele certo indice
            
        }
    }
}

/*Array Array, conjunto de elementos de um tipo correspondente
 * ex: String alunos [] = {"João", "Felipe", "Jonas"}
*/