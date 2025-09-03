
package ex07;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
       
        Autor a1 = new Autor("Machado de Assis");
        Autor a2 = new Autor("Clarice Lispector");

        Livro l1 = new Livro("Dom Casmurro", a1);
        Livro l2 = new Livro("A Hora da Estrela", a2);

        Usuario u1 = new Usuario("Alice");
        Usuario u2 = new Usuario("Bob");

        Emprestimo e1 = new Emprestimo(l1, u1, LocalDate.of(2025, 9, 3));
        Emprestimo e2 = new Emprestimo(l2, u2, LocalDate.of(2025, 9, 4));

        u1.adicionarEmprestimo(e1);
        u2.adicionarEmprestimo(e2);

        e1.devolver(LocalDate.of(2025, 9, 10));

        System.out.println("Empréstimos de " + u1.getNome() + ":");
        for (Emprestimo e : u1.getEmprestimos()) {
            System.out.println("- " + e.getLivro().getTitulo() +
                               " (Devolução: " + e.getDataDevolucao() + ")");
        }

        System.out.println("Empréstimos de " + u2.getNome() + ":");
        for (Emprestimo e : u2.getEmprestimos()) {
            System.out.println("- " + e.getLivro().getTitulo() +
                               " (Devolução: " + e.getDataDevolucao() + ")");
        }

        System.out.println("Livro mais popular: " + (l1.getVezesEmprestado() >= l2.getVezesEmprestado() ? l1.getTitulo() : l2.getTitulo()));
    }
}

