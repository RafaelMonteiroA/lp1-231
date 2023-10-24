package semana24;


public class TelefoneCliente {
    private Integer id;
    private Integer id_cliente;
    private String ddd;
    private String numero;

    public TelefoneCliente(Integer id, Integer id_cliente, String ddd, String numero) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.ddd = ddd;
        this.numero = numero;
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

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getnumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "TelefoneCliente [id=" + id + ", id_cliente=" + id_cliente + ", ddd=" + ddd + ", numero=" + numero + "]";
    }

    

}