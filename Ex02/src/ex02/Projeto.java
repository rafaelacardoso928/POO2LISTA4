
package ex02;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Funcionario> membros;

    public Projeto(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    

    public void atribuirFuncionario(Funcionario f) {
        if(!membros.contains(f)) {
            membros.add(f);
            f.adicionarProjeto(this);
        }
    }

    public String getNome() { return nome; }
    public List<Funcionario> getMembros() { return membros; }
}

