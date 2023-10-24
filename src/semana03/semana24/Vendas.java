package semana24;


public class Vendas {
    private Integer id;
    private Integer id_cliente;
    private Integer id_funcionario;
    private Integer id_pizza;
    private String adicional;
    private String preco_adicional;

    public EmailCliente(Integer id, Integer id_cliente, Integer id_funcionario, Integer id_pizza, String adicional, String preco_adicional) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
        this.id_pizza = id_pizza;
        this.adicional = adicional;
        this.preco_adicional = preco_adicional;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getid_cliente() {
        return id_cliente;
    }

    public void setid_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

        public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

        public Integer getId_pizza() {
        return id_pizza;
    }

    public void setId_pizza(Integer id_pizza) {
        this.id_pizza = id_pizza;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

        public String getPreco_adicional() {
        return preco_adicional;
    }

    public void setPreco_adicional(String preco_adicional) {
        this.preco_adicional = preco_adicional;
    }

    @Override
    public String toString() {
        return "EmailCliente [id=" + id + ", id_cliente=" + id_cliente + ", id_funcionario=" + id_funcionario + ", id_pizza=" + id_pizza + ", adicional=" + adicional + ", preco_adicional=" + preco_adicional + "]";
    }

    

}