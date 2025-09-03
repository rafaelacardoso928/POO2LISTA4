
package ex06;

    import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private List<Carro> carrosVendidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Carro> getCarrosVendidos() { return carrosVendidos; }

    public void venderCarro(Carro c) {
        carrosVendidos.add(c);
    }
}


