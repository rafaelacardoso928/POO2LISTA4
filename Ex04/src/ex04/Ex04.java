
package ex04;

public class Ex04 {
    public static void main(String[] args) {
       
        Passageiro p1 = new Passageiro("Cami");
        Passageiro p2 = new Passageiro("Gaby");

        Voo v1 = new Voo("V001", 2);
        Voo v2 = new Voo("V002", 1);

        Reserva r1 = new Reserva(p1, v1);
        Reserva r2 = new Reserva(p2, v1);
        Reserva r3 = new Reserva(p2, v2);

        v1.adicionarReserva(r1);
        v1.adicionarReserva(r2);
        v2.adicionarReserva(r3);

        p1.adicionarReserva(r1);
        p2.adicionarReserva(r2);
        p2.adicionarReserva(r3);

        System.out.println("Reservas de " + p1.getNome() + ":");
        for(Reserva r : p1.getReservas()) {
            System.out.println("- Voo: " + r.getVoo().getNumero());
        }

        System.out.println("Reservas de " + p2.getNome() + ":");
        for(Reserva r : p2.getReservas()) {
            System.out.println("- Voo: " + r.getVoo().getNumero());
        }
    }
}
