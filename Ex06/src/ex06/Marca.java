
package ex06;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private String nome;
    private List<Carro> carros;

    public Marca(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Carro> getCarros() { return carros; }

    public void adicionarCarro(Carro c) {
        carros.add(c);
    }

    public double calcularMediaPreco() {
        if (carros.isEmpty()) return 0;
        double soma = 0;
        for (Carro c : carros) {
            soma += c.getPreco();
        }
        return soma / carros.size();
    }
}

