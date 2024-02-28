public class ItemVenda {
    Produto produto;
    double quantidade;

    public double valor(){
        double valor;
        valor = quantidade * (produto.preco);
        return valor;
    }

    public ItemVenda(Produto produto, double quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void mostrar(){
        System.out.println("Valor total: "+valor()+" do produto "+ produto.nome);
    }
}
