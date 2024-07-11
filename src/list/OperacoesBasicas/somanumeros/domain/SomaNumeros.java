package list.OperacoesBasicas.somanumeros.domain;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }

    public int calcularSoma() {
        int totalSoma = 0;
        if(!listaInteiros.isEmpty()) {
            for (int numero : listaInteiros) {
                totalSoma += numero;
            }
        }
        return totalSoma;
    }

    public int encontrarMaiorNumero() {
        int maior = listaInteiros.get(0);
        if(!listaInteiros.isEmpty()) {
            for (int numero : listaInteiros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = listaInteiros.get(0);
        if(!listaInteiros.isEmpty()) {
            for (int numero : listaInteiros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {

        return listaInteiros;
    }

    @Override
    public String toString() {
        return listaInteiros + "";
    }
}
