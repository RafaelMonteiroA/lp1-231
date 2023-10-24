package semana24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTelefoneFuncionario {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE TelefoneFuncionario(id INT PRIMARY KEY, id_funcionario INT, ddd VARCHAR(3), numero VARCHAR(9), FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
} 
