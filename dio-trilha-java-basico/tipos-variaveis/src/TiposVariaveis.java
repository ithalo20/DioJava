public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Converção de tipagem, ele estava em int e transformamos em short
        
        int num = 2;
        num = 3;

        final double VALOR_DE_PI = 3.14;

        System.out.println("As variaveis: "+numeroCurto2+" é "+num);
        System.out.println("As constantes: "+VALOR_DE_PI);
    }
}

// byte = 1 byte na memoria: -128 até 127
// short = 2 byte na memoria: -32.768 até 32.767
// int = 4 byte na memoria: -2.147.483.648 até 2.147.483.647
// long = 8 byte na memoria: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 (no final tem q colocar 'L')

// float = 4 byte na memoria: -3,4028E + 38 até 3,4028E + 38 / 6 – 7 dígitos (no final tem q colocar 'f')
// double = 4 byte na memoria: -1,7976E + 308 até 1,7976E + 308 / 15 dígitos

// boolean = 1 bit na memoria: true ou false

// char = 1 byte na memória: Armazena apenas UM CARACTER ex: 'S', 'N', 'X', 'Y' (So funciona com aspas simples  '')
// ATENÇÃO JAVA TEM DIFICULDADE EM ENTENDER o 0 INICIAL e 0 FINAL

// Lembre-se as CONSTANTE sempre estar em maiusculo e com final atrás ex: final int CONSTANTE = 20;