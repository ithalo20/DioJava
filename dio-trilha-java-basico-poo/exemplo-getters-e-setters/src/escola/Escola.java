package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        
        felipe.setNome("Felipe José");
        felipe.setIdade(22);
        felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " de sexo " + felipe.getSexo() + " tem " + felipe.getIdade() + " anos");	
	}
}