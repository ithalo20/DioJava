package escola;

public class Aluno {

    //Seguindo as convenções JavaBeans, esta estrutura de atributos deverá ser privada
    private String nome;
    private int idade;
    private String sexo;

    //getX (Não recebe parametro) e retorna um valor
    //setX (Recebe parametro) e não retorna valor
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

//IMPORTANTE: Da para fazer o Getter and Setter com o Source Action do VSCODE e com outras IDEs.
//Pode escrever tambem só get que ja aparece para voce criar e o set a mesma coisa só escrever set, que ja aparece pra criar


/*
 * O this é usado para referenciar a um atributo externo fora do metodo. 
 * Por exemplo ser dentro de um método se estiver dois atributos com o 
 * mesmo nome oque estiver com a palavra "this" estará se referenciando a um atributo fora do metodo.
 */