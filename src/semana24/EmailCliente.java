package semana24;


public class EmailCliente {
    private Integer id;
    private Integer id_cliente;
    private String email;

    public EmailCliente(Integer id, Integer id_cliente, String email) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.email = email;
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

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailCliente [id=" + id + ", id_cliente=" + id_cliente + ", email=" + email + "]";
    }

    

}