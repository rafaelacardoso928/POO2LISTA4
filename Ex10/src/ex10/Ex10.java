
package ex10;

public class Ex10 {
    public static void main(String[] args) {
        
        Estudante e1 = new Estudante("Alice");
        Estudante e2 = new Estudante("Bob");

        Professor prof = new Professor("Dr. João");

        Disciplina d1 = new Disciplina("Matemática");
        Disciplina d2 = new Disciplina("História");

        prof.adicionarDisciplina(d1);
        prof.adicionarDisciplina(d2);

        e1.matricular(d1);
        e1.matricular(d2);
        e2.matricular(d1);

        e1.adicionarNota(8.5);
        e1.adicionarNota(9.0);
        e2.adicionarNota(7.5);

        System.out.println("Média de " + e1.getNome() + ": " + e1.calcularMedia());
        System.out.println("Média de " + e2.getNome() + ": " + e2.calcularMedia());

        System.out.println("Disciplinas do professor " + prof.getNome() + ":");
        for (Disciplina d : prof.getDisciplinas()) {
            System.out.println("- " + d.getNome());
        }
    }
}

