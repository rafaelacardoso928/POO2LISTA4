
package ex03;

public class Ex03 {
    public static void main(String[] args) {
       
        Usuario u1 = new Usuario("Cami");
        Usuario u2 = new Usuario("Gaby");

        
        Publicacao pub1 = new Publicacao("Olá, mundo!", u1);
        Publicacao pub2 = new Publicacao("Bom dia a todos!", u2);

        
        u1.criarPublicacao(pub1);
        u2.criarPublicacao(pub2);

       
        Comentario c1 = new Comentario("Que legal!", u2);
        Comentario c2 = new Comentario("Bom dia!", u1);

    
        pub1.adicionarComentario(c1);
        pub2.adicionarComentario(c2);

       
        System.out.println("Publicações de " + u1.getNome() + ":");
        for(Publicacao p : u1.getPublicacoes()) {
            System.out.println("- " + p.getConteudo());
            for(Comentario c : p.getComentarios()) {
                System.out.println("  Comentário de " + c.getAutor().getNome() + ": " + c.getConteudo());
            }
        }

        System.out.println("Publicações de " + u2.getNome() + ":");
        for(Publicacao p : u2.getPublicacoes()) {
            System.out.println("- " + p.getConteudo());
            for(Comentario c : p.getComentarios()) {
                System.out.println("  Comentário de " + c.getAutor().getNome() + ": " + c.getConteudo());
            }
        }
    }
}
