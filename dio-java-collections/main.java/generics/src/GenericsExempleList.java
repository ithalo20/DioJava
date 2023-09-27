import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics

        List listaSemGenerics = new ArrayList(); //Sem generics, Permite adicionar qualquer tipo de objeto
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>(); //Com generics, Permite adicionar apenas um tipo de objeto, nesse caso <String>
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}

//Object é a classe mãe dentro de todo o java
