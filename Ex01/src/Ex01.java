import ex01.Fornecedor;
import ex01.Pedido;
import ex01.Produto;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarEstoqueBaixo(int limite) {
        List<Produto> baixo = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getQuantidade() < limite) {
                baixo.add(p);
            }
        }
        return baixo;
    }

    public static void main(String[] args) {
        Ex01 estoque = new Ex01();

        Produto arroz = new Produto("Arroz", 3, 20.0);
        Produto feijao = new Produto("Feijão", 10, 8.0);

        Fornecedor fornecedor = new Fornecedor("Fornecedor A");
        Pedido pedido = new Pedido(arroz, fornecedor, 50);

        estoque.adicionarProduto(arroz);
        estoque.adicionarProduto(feijao);

        System.out.println("Produtos com estoque baixo:");
        for (Produto p : estoque.listarEstoqueBaixo(5)) {
            System.out.println(p.getNome() + " - Quantidade: " + p.getQuantidade());
        }
    }
}
