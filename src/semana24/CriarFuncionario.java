package semana24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarFuncionario {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Funcionario(id INT PRIMARY KEY, cargo VARCHAR(100), nome VARCHAR(100), data_nascimento DATE);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
} 
