public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506994");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("\nO CEP deve ter 8 números");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{ // CepInvalidoException é uma outra classe pra tratar isso, atraves de extendes (hierarquia)
        if(cep.length() != 8) // se for diferente de 8 ele lancara um erro
            throw new CepInvalidoException(); // lanca novo CepInvalidoException(); para esse objeto
                
            //simulando um cep formatado
            return "23.765-064";  
            
    }
}

