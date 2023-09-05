public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Ithalo";
        String nomeDois = new String("Ithalo"); //Sempre que é criada uma String através da palavra chave new, um novo objeto será criado na memória.

        System.out.println(nomeUm.equals(nomeDois)); //o metodo .equals compara CONTEUDOS, mesmo estando em estruturas diferentes.
        

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) { //true
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente que numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}

// new é um operador
// new significa que voce esta criando um novo objeto, exemplo: novoObjeto = new String ("Novo objeto")
//o metodo .equals() compara CONTEUDOS, mesmo estando em estruturas diferentes, comparações de textos é interessante usar o .equals()