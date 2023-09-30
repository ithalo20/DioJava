package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno removerPorMatricula = null;
        for (Aluno aluno : alunoSet){
            if(aluno.getMatricula() == matricula){
                removerPorMatricula = aluno;
                break; //Parar
            }
        }
        alunoSet.remove(removerPorMatricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){ //Comparable
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMedia(){ //Comparator
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorNota());
        alunoPorMedia.addAll(alunoSet);
        return alunoPorMedia;
    }

    public Set<Aluno> exibirAlunos(){
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 3132, 9.5);
        gerenciadorAlunos.adicionarAluno("Ithalo", 3133, 9.0);
        gerenciadorAlunos.adicionarAluno("Giovanna", 3133, 8.5);
        gerenciadorAlunos.adicionarAluno("Lucas", 3134, 8.2);
        gerenciadorAlunos.adicionarAluno("Gabriel", 3137, 8.3);

        System.out.println(gerenciadorAlunos.exibirAlunos()); //Imprimi todos os alunos


        gerenciadorAlunos.removerAluno(3133); //Pela matricula

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome()); //Imprime alunos por ordem alfabetica

        System.out.println(gerenciadorAlunos.exibirAlunosPorMedia()); //Exibe pela media

        System.out.println(gerenciadorAlunos.exibirAlunos()); //Imprimi todos os alunos

    }
}
