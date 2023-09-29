package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {//Metodo construtor sem parametro
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) { //Como vou pesquisar por autor, então pesquisa dentro do array no caso List<Livro>
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) { //Intervalo, então é ranged
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(livro);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null; //está null, pq ainda n temos nenhum objeto do tipo livro
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro; //Se for igual, ele para
                    break; //Como é o primeiro livro encontrado, não tem pq ficar repetindo varias vezes

                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2012);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1999);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }

}