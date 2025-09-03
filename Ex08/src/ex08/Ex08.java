
package ex08;

public class Ex08 {
    public static void main(String[] args) {
        // Criando desenvolvedores
        Desenvolvedor d1 = new Desenvolvedor("Alice");
        Desenvolvedor d2 = new Desenvolvedor("Bob");

        Projeto p1 = new Projeto("Sistema de Gestão");

        Tarefa t1 = new Tarefa("Desenvolver tela de login", 5);
        Tarefa t2 = new Tarefa("Criar banco de dados", 8);
        Tarefa t3 = new Tarefa("Implementar API", 10);

        d1.atribuirTarefa(t1);
        d2.atribuirTarefa(t2);
        d2.atribuirTarefa(t3);

        p1.adicionarTarefa(t1);
        p1.adicionarTarefa(t2);
        p1.adicionarTarefa(t3);

        System.out.println("Carga de trabalho do projeto " + p1.getNome() + ": " + p1.calcularCargaTrabalho() + " horas");

        System.out.println("Tarefas de " + d1.getNome() + ":");
        for (Tarefa t : d1.getTarefas()) {
            System.out.println("- " + t.getDescricao() + " (" + t.getHoras() + " horas)");
        }

        System.out.println("Tarefas de " + d2.getNome() + ":");
        for (Tarefa t : d2.getTarefas()) {
            System.out.println("- " + t.getDescricao() + " (" + t.getHoras() + " horas)");
        }
    }
}

