package semana24;


public class Compras {
    private Integer id;
    private String produto;
    private String quantidade;
    private String preco;
    private String distribuidora;

    public Compras(Integer id, String produto, String quantidade, String preco, String distribuidora) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.distribuidora = distribuidora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "Compras [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + ", distribuidora=" + distribuidora + "]";
    }

    

}