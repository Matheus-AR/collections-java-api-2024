package list.OperacoesBasicas.carrinhocompras.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        // valorTotal = (preco * quantidade) + (preco * quantidade) + (preco * quantidade);

        for (Item item : carrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        return valorTotal;
    }
    
    public void exibirItens() {
        for (Item item : carrinho) {
            System.out.println(item);
        }
        System.out.println();
    }

}
