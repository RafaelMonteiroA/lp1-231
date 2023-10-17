package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Estoque {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Estoque(id PRIMARY KEY, produto VARCHAR(50), quantidade VARCHAR(20));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
