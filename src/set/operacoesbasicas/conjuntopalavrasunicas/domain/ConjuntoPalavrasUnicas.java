package set.operacoesbasicas.conjuntopalavrasunicas.domain;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : palavrasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = palavra;
                break;
            }
        }
        palavrasSet.remove(palavra);
    }

    public boolean vericarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }
}
