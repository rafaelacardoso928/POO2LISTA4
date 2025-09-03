
package ex02;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private double salario;
    private List<Projeto> projetos;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
    public List<Projeto> getProjetos() { return projetos; }

    public void adicionarProjeto(Projeto projeto) {
        if(!projetos.contains(projeto)) {
            projetos.add(projeto);
        }
    }
}

