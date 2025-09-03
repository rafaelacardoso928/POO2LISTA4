
package ex10;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Double> notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public List<Double> getNotas() { return notas; }

    public void matricular(Disciplina d) {
        disciplinas.add(d);
        d.adicionarEstudante(this);
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.size();
    }
}

