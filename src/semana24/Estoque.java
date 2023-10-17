package semana24;


public class Estoque {
    private Integer id;
    private String produto;
    private String quantidade;

    public Estoque(Integer id, String produto, String quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
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

    @Override
    public String toString() {
        return "Estoque [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + "]";
    }

    

}