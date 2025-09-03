
package ex06;

public class Carro {
    private String modelo;
    private Marca marca;
    private double preco;
    private Vendedor vendedor;

    public Carro(String modelo, Marca marca, double preco, Vendedor vendedor) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.vendedor = vendedor;
    }

    public String getModelo() { return modelo; }
    public Marca getMarca() { return marca; }
    public double getPreco() { return preco; }
    public Vendedor getVendedor() { return vendedor; }
}

