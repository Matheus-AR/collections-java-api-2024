package list.ordenacao.OrdenacaoNumeros.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenadosAscendente = new ArrayList<>(inteirosList);
        Collections.sort(ordenadosAscendente);
        return ordenadosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenadosDescendente = new ArrayList<>(inteirosList);
        Collections.sort(ordenadosDescendente);
        Collections.reverse(ordenadosDescendente);
        return ordenadosDescendente;
    }
}

