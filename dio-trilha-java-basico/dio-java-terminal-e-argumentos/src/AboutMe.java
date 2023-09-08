public class AboutMe {
    public static void main(String[] args) {

        //os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    } 
}

/*
 * No terminal eu consigo preencher os argumentos e pegar cada indice dos array, parametros externos
 * ex: cd D:\DioJava\dio-trilha-java-basico\dio-java-terminal-e-argumentos\bin> Ithalo Laurentino 24 1.73
 * Tem como ja deixar o valor dos argumentos salvos na config json, em Run-> Open configuration e colocar os "arg":[], exemplo:
 * "args": [
                "Ithalo",
                "Laurentino",
                "24",
                "1.73"
            ]
 */
