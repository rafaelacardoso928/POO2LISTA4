
package ex03;

public class Comentario {
    private String conteudo;
    private Usuario autor;

    public Comentario(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public String getConteudo() { return conteudo; }
    public Usuario getAutor() { return autor; }
}
