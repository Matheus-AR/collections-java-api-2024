package set.ordenacao.listadealunos.application;

import set.ordenacao.listadealunos.domain.Aluno;
import set.ordenacao.listadealunos.domain.ComparatorPorNota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno("Matheus", 1234L, 6.75);
        gerenciadorAlunos.adicionarAluno("Felipe", 1234L, 6.44);
        gerenciadorAlunos.adicionarAluno("Marcos", 1324L, 6.12);
        gerenciadorAlunos.adicionarAluno("Carlos", 1423L, 6.45);
        gerenciadorAlunos.adicionarAluno("Maria", 4321L, 8.32);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(1234L);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirPorNome());

        System.out.println(gerenciadorAlunos.exibirPorNota());


    }
}
