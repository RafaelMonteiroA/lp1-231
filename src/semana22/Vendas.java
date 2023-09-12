package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Vendas {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Vendas(id INT PRIMARY KEY, cpf_cliente CHAR(11), sabor_pizza VARCHAR(11), cpf_funcionario CHAR(11), desc_pizza VARCHAR(100), preco NUMERIC(3,2), FOREIGN KEY(cpf_cliente) REFERENCES Cliente(cpf), FOREIGN KEY(sabor_pizza) REFERENCES Cardápio(sabor_pizza), FOREIGN KEY(cpf_funcionario) REFERENCES Funcionario(cpf));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
