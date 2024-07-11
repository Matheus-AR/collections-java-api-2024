package map.pesquisa.contagempalavras.application;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasMap);
    }


    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorFrequencia = 0;
        if(!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry: palavrasMap.entrySet()) {
                if (entry.getValue() > maiorFrequencia) {
                    maiorFrequencia = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Abacaxi", 12);
        contagemPalavras.adicionarPalavra("Caju", 32);
        contagemPalavras.adicionarPalavra("Maracujá", 28);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Caju");

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
