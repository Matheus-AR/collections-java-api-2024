package set.operacoesbasicas.conjuntoconvidados.application;

import set.operacoesbasicas.conjuntoconvidados.domain.ConjuntoConvidado;

public class Program {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1237);

        conjuntoConvidado.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidado.exibirConvidados();

    }
}
