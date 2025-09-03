
package ex04;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Reserva> reservas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Reserva> getReservas() { return reservas; }

    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }
}

