package set.pesquisa.listatarefas.application;

import set.pesquisa.listatarefas.domain.ListaTarefas;

public class Program {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("\nTotal de tarefas = " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        System.out.println("\nTotal de tarefas = " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 3");

        System.out.println("\nTotal de tarefas = " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        System.out.println("\nTarefas concluidas");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("\nTarefas pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");

        System.out.println("\nTarefas concluidas");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa 1");

        System.out.println("\nTarefas pendentes");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparTodasTarefas();

        System.out.println("\nMostrar tarefas");
        listaTarefas.exibirTarefas();

    }
}
