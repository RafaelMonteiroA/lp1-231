package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Cliente(cpf CHAR(11) PRIMARY KEY, nome VARCHAR(100), endereço VARCHAR(100), data_nascimento DATE, email VARCHAR(100), telefone VARCHAR(15));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
