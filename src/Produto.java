public class Produto {
    String nome;
    double preco ;
    String fornecedor ;

    public Produto(String nome){
        this.nome = nome;
    }

    public Produto(String nome,double preco, String fornecedor){
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public void mostrar(){
        System.out.println("Nome: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Fornecedor"+ fornecedor);
    }
}
