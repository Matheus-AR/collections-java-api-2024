package set.operacoesbasicas.conjuntopalavrasunicas.application;

import set.operacoesbasicas.conjuntopalavrasunicas.domain.ConjuntoPalavrasUnicas;

public class Program {

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 3");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Tem a palavra 'Palavra 4'? " + conjuntoPalavrasUnicas.vericarPalavra("Palavra 4"));
        System.out.println("Tem a palavra 'Palavra 12'? " + conjuntoPalavrasUnicas.vericarPalavra("Palavra 12"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
