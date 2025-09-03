
package ex05;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private List<Consulta> consultas;

    public Medico(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Consulta> getConsultas() { return consultas; }

    public void adicionarConsulta(Consulta c) {
        consultas.add(c);
    }
}

