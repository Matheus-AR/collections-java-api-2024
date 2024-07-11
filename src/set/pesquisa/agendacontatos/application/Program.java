package set.pesquisa.agendacontatos.application;

import set.pesquisa.agendacontatos.domain.AgendaContatos;

public class Program {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarCOntato("Camila", 123456);
        agendaContatos.adicionarCOntato("Camila", 5665);
        agendaContatos.adicionarCOntato("Camila Cavalcante", 111111);
        agendaContatos.adicionarCOntato("Camila DIO", 654987);
        agendaContatos.adicionarCOntato("Maria Silva", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Maria"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));

        agendaContatos.exibirContatos();
    }
}
