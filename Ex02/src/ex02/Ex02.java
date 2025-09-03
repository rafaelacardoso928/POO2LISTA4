
package ex02;
public class Ex02 {
    public static void main(String[] args) {
        // Criando funcionários
        Funcionario f1 = new Funcionario("Alice", 3000);
        Funcionario f2 = new Funcionario("Bob", 4000);

        // Criando departamento
        Departamento dept = new Departamento("TI");
        dept.adicionarFuncionario(f1);
        dept.adicionarFuncionario(f2);

        // Criando projetos
        Projeto p1 = new Projeto("Sistema Web");
        Projeto p2 = new Projeto("App Mobile");

        // Atribuindo funcionários aos projetos
        p1.atribuirFuncionario(f1);
        p1.atribuirFuncionario(f2);
        p2.atribuirFuncionario(f2);

        // Exibindo média salarial do departamento
        System.out.println("Média salarial do departamento: " + dept.calcularMediaSalarial());

        // Exibindo projetos de cada funcionário
        System.out.println("Projetos de " + f1.getNome() + ":");
        for(Projeto p : f1.getProjetos()) {
            System.out.println("- " + p.getNome());
        }

        System.out.println("Projetos de " + f2.getNome() + ":");
        for(Projeto p : f2.getProjetos()) {
            System.out.println("- " + p.getNome());
        }
    }
}
