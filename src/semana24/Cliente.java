package semana24;


public class Cliente {
    private Integer id;
    private String nome;
    private String data_nascimento;

    public Cliente(Integer id, String nome, String data_nascimento) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Cliente [id=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + "]";
    }

    

}