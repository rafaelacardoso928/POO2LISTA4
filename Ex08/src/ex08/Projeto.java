
package ex08;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Tarefa> getTarefas() { return tarefas; }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public int calcularCargaTrabalho() {
        int total = 0;
        for (Tarefa t : tarefas) {
            total += t.getHoras();
        }
        return total;
    }
}

