package list.OperacoesBasicas.carrinhocompras.application;

import list.OperacoesBasicas.carrinhocompras.domain.CarrinhoDeCompras;

public class Program {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Caderno", 23.00, 1);
        carrinho.adicionarItem("Livro", 23.00, 2);
        carrinho.adicionarItem("Caneta", 2.00, 3);

        carrinho.exibirItens();

        carrinho.removerItem("Caneta");

        carrinho.exibirItens();

        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());

    }
}
