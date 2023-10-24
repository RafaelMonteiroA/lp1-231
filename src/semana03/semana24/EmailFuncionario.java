package semana24;


public class EmailFuncionario {
    private Integer id;
    private Integer id_funcionario;
    private String email;

    public EmailFuncionario(Integer id, Integer id_funcionario, String email) {
        this.id = id;
        this.id_funcionario = id_funcionario;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getid_funcionario() {
        return id_funcionario;
    }

    public void setid_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailFuncionario [id=" + id + ", id_funcionario=" + id_funcionario + ", email=" + email + "]";
    }

    

}