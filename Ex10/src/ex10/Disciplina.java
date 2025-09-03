
package ex10;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Estudante> estudantes;

    public Disciplina(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor p) { this.professor = p; }

    public List<Estudante> getEstudantes() { return estudantes; }
    public void adicionarEstudante(Estudante e) { estudantes.add(e); }
}

