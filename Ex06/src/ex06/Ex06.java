
package ex06;

public class Ex06 {
    public static void main(String[] args) {
       
        Vendedor v1 = new Vendedor("Carlos");
        Vendedor v2 = new Vendedor("Ana");

        Marca m1 = new Marca("Toyota");
        Marca m2 = new Marca("Honda");

        Carro c1 = new Carro("Corolla", m1, 120000, v1);
        Carro c2 = new Carro("Civic", m2, 130000, v2);
        Carro c3 = new Carro("Yaris", m1, 90000, v1);

        m1.adicionarCarro(c1);
        m1.adicionarCarro(c3);
        m2.adicionarCarro(c2);

        v1.venderCarro(c1);
        v1.venderCarro(c3);
        v2.venderCarro(c2);

        System.out.println("Média de preços da marca " + m1.getNome() + ": " + m1.calcularMediaPreco());
        System.out.println("Média de preços da marca " + m2.getNome() + ": " + m2.calcularMediaPreco());

      
        System.out.println("Carros vendidos por " + v1.getNome() + ":");
        for (Carro c : v1.getCarrosVendidos()) {
            System.out.println("- " + c.getModelo() + " (" + c.getMarca().getNome() + ")");
        }

        System.out.println("Carros vendidos por " + v2.getNome() + ":");
        for (Carro c : v2.getCarrosVendidos()) {
            System.out.println("- " + c.getModelo() + " (" + c.getMarca().getNome() + ")");
        }
    }
}

