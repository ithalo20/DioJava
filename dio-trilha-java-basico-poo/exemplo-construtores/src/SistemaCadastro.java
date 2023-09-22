public class SistemaCadastro {
	public static void main(String[] args) {
        //criamos uma pessoa no sistema
        //estamos puxando o metodo construtor, o valor do parametros colocamos diretamente no novo objeto
        //para ja deixar fixo
        Pessoa ithalo = new Pessoa("Ithalo", "491171273");
        
        //definimos o endereço de Ithalo
        ithalo.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		//imprimindo o marcos sem o nome e cpf
		
        System.out.println(ithalo.getNome() + " portador do CPF:" + ithalo.getCpf() + " e mora no endereço: "
                + ithalo.getEndereco());

	}
}

