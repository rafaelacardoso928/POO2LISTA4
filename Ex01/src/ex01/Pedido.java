
package ex01;

public class Pedido {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Pedido(Produto produto, Fornecedor fornecedor, int quantidade) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public Produto getProduto() { return produto; }
    public Fornecedor getFornecedor() { return fornecedor; }
    public int getQuantidade() { return quantidade; }
}

