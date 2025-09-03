
package ex05;

import java.time.LocalDate;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDate data;

    public Consulta(Medico medico, Paciente paciente, LocalDate data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

   

    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public LocalDate getData() { return data; }
}
