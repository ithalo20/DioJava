public class ExemploForEachArray {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
        //Forma abreviada
        for (String aluno : alunos) { // A cada interação de alunos o aluno do indice atual, vai atualizar automaticamente a variavel (aluno)
          System.out.println("Nome do Aluno é: " + aluno);
        }
    
    }
    }

/*
 * O uso do for / each está fortemente relacionado,
 *com um cenário onde contenha um array ou coleção, 
 *e assim , a interação é baseada nos elementos da coleção.
 *  String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
 *  A impressão de cada aluno é realizada
 * String pq os elementos são desse tipo de dados
 */