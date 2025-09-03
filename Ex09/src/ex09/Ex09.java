
package ex09;

public class Ex09 {
    public static void main(String[] args) {
        
        Prato p1 = new Prato("Pizza", 40.0);
        Prato p2 = new Prato("Hambúrguer", 25.0);
        Prato p3 = new Prato("Salada", 15.0);
 
        Mesa m1 = new Mesa(1);
        Mesa m2 = new Mesa(2);

        Pedido pedido1 = new Pedido(p1);
        Pedido pedido2 = new Pedido(p2);
        Pedido pedido3 = new Pedido(p3);

        m1.adicionarPedido(pedido1);
        m1.adicionarPedido(pedido3);
        m2.adicionarPedido(pedido2);

        System.out.println("Total da mesa " + m1.getNumero() + ": R$ " + m1.calcularTotal());
        System.out.println("Total da mesa " + m2.getNumero() + ": R$ " + m2.calcularTotal());

        System.out.println("Pedidos da mesa " + m1.getNumero() + ":");
        for (Pedido p : m1.getPedidos()) {
            System.out.println("- " + p.getPrato().getNome());
        }

        System.out.println("Pedidos da mesa " + m2.getNumero() + ":");
        for (Pedido p : m2.getPedidos()) {
            System.out.println("- " + p.getPrato().getNome());
        }
    }
}
