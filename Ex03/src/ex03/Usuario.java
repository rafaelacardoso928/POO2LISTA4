
package ex03;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Publicacao> publicacoes;

    public Usuario(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Publicacao> getPublicacoes() { return publicacoes; }

    public void criarPublicacao(Publicacao p) {
        publicacoes.add(p);
    }
}
