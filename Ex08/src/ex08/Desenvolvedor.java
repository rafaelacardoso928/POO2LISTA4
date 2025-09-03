
package ex08;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
    private String nome;
    private List<Tarefa> tarefas;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Tarefa> getTarefas() { return tarefas; }

    public void atribuirTarefa(Tarefa t) {
        tarefas.add(t);
        t.setDesenvolvedor(this);
    }
}

