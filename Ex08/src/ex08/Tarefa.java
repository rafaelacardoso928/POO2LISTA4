
package ex08;

public class Tarefa {
    private String descricao;
    private int horas;
    private Desenvolvedor desenvolvedor;

    public Tarefa(String descricao, int horas) {
        this.descricao = descricao;
        this.horas = horas;
        this.desenvolvedor = null;
    }

    public String getDescricao() { return descricao; }
    public int getHoras() { return horas; }
    public Desenvolvedor getDesenvolvedor() { return desenvolvedor; }
    public void setDesenvolvedor(Desenvolvedor d) { this.desenvolvedor = d; }
}
