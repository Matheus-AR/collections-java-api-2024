package list.OperacoesBasicas.somanumeros.application;

import list.OperacoesBasicas.somanumeros.domain.SomaNumeros;

public class Program {

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionarNumero(65);
        listaNumeros.adicionarNumero(200);
        listaNumeros.adicionarNumero(81);
        listaNumeros.adicionarNumero(100);
        listaNumeros.adicionarNumero(74);
        listaNumeros.adicionarNumero(90);
        listaNumeros.adicionarNumero(34);

        System.out.println("Maior = " + listaNumeros.encontrarMaiorNumero());

        System.out.println("Menor = " + listaNumeros.encontrarMenorNumero());

        System.out.println(listaNumeros);
    }
}
