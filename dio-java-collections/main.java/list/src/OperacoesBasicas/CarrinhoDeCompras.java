package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoItem;

    public CarrinhoDeCompras() { //Metodo construtor, sem parametros.
        this.carrinhoItem = new ArrayList<>(); //ArrayList vazio
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoItem.add(new Item(nome, preco, quantidade)); //Adicionei os elementos dos parametros
    }

    public void removerItem(String nome) {
        if (!carrinhoItem.isEmpty()) { //Se der falso vai bater no bloco
            List<Item> itensParaRemover = new ArrayList<>(); //Nova lista vazia criada
            for (Item itens : carrinhoItem) {
                if (itens.getNome().equalsIgnoreCase(nome))
                    itensParaRemover.add(itens);
            }

            carrinhoItem.removeAll(itensParaRemover);
        } else {
            System.out.println("Lista está vazia"); //Se for verdadeira vai bater nesse bloco
        }
    }

    public double calcularValorTotal() {
        if (!carrinhoItem.isEmpty()) {
            double valorTotal = 0; //Variavel = 0, pois ela armazenara o valor no for

            for (Item itens : carrinhoItem) {
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
        if (!carrinhoItem.isEmpty())
            System.out.println(carrinhoItem);

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
