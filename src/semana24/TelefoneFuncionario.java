package semana24;


public class TelefoneFuncionario {
    private Integer id;
    private Integer id_funcionario;
    private String ddd;
    private String numero;

    public TelefoneFuncionario(Integer id, Integer id_funcionario, String ddd, String numero) {
        this.id = id;
        this.id_funcionario = id_funcionario;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
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
        return "TelefoneFuncionario [id=" + id + ", id_funcionario=" + id_funcionario + ", ddd=" + ddd + ", numero=" + numero + "]";
    }

    

}