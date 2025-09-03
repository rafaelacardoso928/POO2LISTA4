
package ex04;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String numero;
    private int capacidade;
    private List<Reserva> reservas;

    public Voo(String numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public String getNumero() { return numero; }
    public int getCapacidade() { return capacidade; }
    public List<Reserva> getReservas() { return reservas; }

    public boolean verificarDisponibilidade() {
        return reservas.size() < capacidade;
    }

    public void adicionarReserva(Reserva r) {
        if(verificarDisponibilidade()) {
            reservas.add(r);
        } else {
            System.out.println("Voo lotado: " + numero);
        }
    }
}

