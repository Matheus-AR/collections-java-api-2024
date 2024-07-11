package map.operacoesbasicas.agendacontatos.program;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroProNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroProNome = agendaContatoMap.get(nome);
        }
        return numeroProNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcos" , 123456);
        agendaContatos.adicionarContato("Marcos", 5665);
        agendaContatos.adicionarContato("Camila", 11111111);
        agendaContatos.adicionarContato("Marta", 54934840);
        agendaContatos.adicionarContato("Maria Silva", 11111111);
        agendaContatos.adicionarContato("Marcos", 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));

    }
}
