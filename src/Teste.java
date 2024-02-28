import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            String fornecedor = scanner.nextLine();
            Produto produto = new Produto(nome, preco, fornecedor);
            produto.mostrar();

            double quantidade = scanner.nextDouble();
            ItemVenda venda = new ItemVenda(produto,quantidade);
            venda.mostrar();
        }

    }
}
