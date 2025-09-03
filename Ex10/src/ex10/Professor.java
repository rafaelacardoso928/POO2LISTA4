
package ex10;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
        d.setProfessor(this);
    }
}

