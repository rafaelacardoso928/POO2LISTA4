
package ex03;

import java.util.ArrayList;
import java.util.List;

public class Publicacao {
    private String conteudo;
    private Usuario autor;
    private List<Comentario> comentarios;

    public Publicacao(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
    }

    public String getConteudo() { return conteudo; }
    public Usuario getAutor() { return autor; }
    public List<Comentario> getComentarios() { return comentarios; }

    public void adicionarComentario(Comentario c) {
        comentarios.add(c);
    }
}
