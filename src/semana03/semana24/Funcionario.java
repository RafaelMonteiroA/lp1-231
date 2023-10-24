package semana24;


public class Funcionario {
    private Integer id;
    private String cargo;
    private String nome;
    private String data_nascimento;

    public Funcionario(Integer id, String cargo, String nome, String data_nascimento) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", cargo=" + cargo + ", nome=" + nome + ", data_nascimento=" + data_nascimento + "]";
    }

    

}