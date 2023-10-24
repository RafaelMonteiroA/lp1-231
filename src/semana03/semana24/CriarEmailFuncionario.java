package semana24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarEmailFuncionario {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE EmailFuncionario(id INT PRIMARY KEY, id_funcionario INT, email VARCHAR(100), FOREIGN KEY(id_funcionario) REFERENCES Funcionario(id));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
