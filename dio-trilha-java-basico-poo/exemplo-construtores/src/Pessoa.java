public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Metodo construtor, serve pra ja definir um valor ja imutavel
    //Lembrando que da para criar varios construtores com diferentes parametros ou até sem parametros.
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
    //...
    //setters de nome e cpf ?
    //não colocamos set os outros elementos por que são identidade imutaveis
    //exemplo nome, cpf, marca de carro, matricula entre outros.

// assim como get e set, o construtor da para construir no Source Action da IDE

// Vale ressaltar para NÃO ABUSAR DOS CONSTRUTORES, usar apenas para dados importantes 
//como Nome, CPF, RG, Matricula, dados que sejam meio que a identidade.