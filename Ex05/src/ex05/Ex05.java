
package ex05;

import java.time.LocalDate;

public class Ex05 {
    public static void main(String[] args) {
       
        Medico m1 = new Medico("Dr. João");
        Medico m2 = new Medico("Dra. Maria");

        Paciente p1 = new Paciente("Rafa");
        Paciente p2 = new Paciente("Bruna");

        Consulta c1 = new Consulta(m1, p1, LocalDate.of(2025, 9, 10));
        Consulta c2 = new Consulta(m1, p2, LocalDate.of(2025, 9, 12));
        Consulta c3 = new Consulta(m2, p1, LocalDate.of(2025, 9, 15));

        m1.adicionarConsulta(c1);
        m1.adicionarConsulta(c2);
        m2.adicionarConsulta(c3);

        p1.adicionarConsulta(c1);
        p1.adicionarConsulta(c3);
        p2.adicionarConsulta(c2);

        System.out.println("Pacientes do " + m1.getNome() + ":");
        for (Consulta c : m1.getConsultas()) {
            System.out.println("- " + c.getPaciente().getNome() + " (Data: " + c.getData() + ")");
        }

        System.out.println("Pacientes do " + m2.getNome() + ":");
        for (Consulta c : m2.getConsultas()) {
            System.out.println("- " + c.getPaciente().getNome() + " (Data: " + c.getData() + ")");
        }
    }
}
