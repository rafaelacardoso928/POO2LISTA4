
package ex07;

public class Livro {
    private String titulo;
    private Autor autor;
    private int vezesEmprestado;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.vezesEmprestado = 0;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public int getVezesEmprestado() { return vezesEmprestado; }

    public void emprestado() {
        vezesEmprestado++;
    }
}

