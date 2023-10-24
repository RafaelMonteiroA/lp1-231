package semana24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Vendas {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Vendas(id INT PRIMARY KEY, id_cliente INT, id_funcionario INT, id_pizza INT, adicional VARCHAR(100), preco_adicionar VARCHAR(50), FOREIGN KEY (id_cliente) REFERENCES Cliente(id), FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id), FOREIGN KEY (id_pizza) REFERENCES Cardápio(id));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
} 
