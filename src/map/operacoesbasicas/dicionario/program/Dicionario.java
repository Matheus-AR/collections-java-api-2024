package map.operacoesbasicas.dicionario.program;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Programador", "Profissional que desenvolve sistemas de informação");
        dicionario.adicionarPalavra("Testador", "Profissional responsável por testar o sistema.");
        dicionario.adicionarPalavra("Analista de requisitos", "Profissional que trabalha com requisitos de sistemas.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Testador");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Programador"));
    }
}
