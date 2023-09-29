package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() { //Metodo construtor, sem parametros.
        this.itemList = new ArrayList<>(); //ArrayList vazio
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade)); //Adicionei os elementos dos parametros
    }

    public void removerItem(String nome) {
        if (!itemList.isEmpty()) { //Se der falso vai bater no bloco
            List<Item> itensParaRemover = new ArrayList<>(); //Nova variavel criada e lista vazia criada
            for (Item itens : itemList) {
                if (itens.getNome().equalsIgnoreCase(nome))
                    itensParaRemover.add(itens);
            }

            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("Lista está vazia"); //Se for verdadeira vai bater nesse bloco
        }
    }

    public double calcularValorTotal() {
        if (!itemList.isEmpty()) {
            double valorTotal = 0; //Variavel = 0, pois ela armazenara o valor no for

            for (Item itens : itemList) {
                double valorItens = itens.getPreco() * itens.getQuantidade();
                valorTotal += valorItens;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia!"); //Exceção dentro do else
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty())
            System.out.println(itemList);

        else{
            System.out.println("A lista está vazia!");
        }


    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mamão",25.5,3);
        carrinhoDeCompras.adicionarItem("Açai",30,7);
        carrinhoDeCompras.adicionarItem("Limão",9,2);
        carrinhoDeCompras.adicionarItem("Banana",2,4);

        carrinhoDeCompras.removerItem("Banana"); //Removi banana
        System.out.println("R$: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }

}