package set.ordenacao.cadastroprodutos.application;

import set.ordenacao.cadastroprodutos.domain.ComparatorPorPreco;
import set.ordenacao.cadastroprodutos.domain.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtosSet;

    public CadastroProduto() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();


        cadastroProduto.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 0", 20d, 5);
        cadastroProduto.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProduto.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProduto.produtosSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
