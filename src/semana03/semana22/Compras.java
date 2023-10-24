package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Compras {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Compras(produto VARCHAR(50) PRIMARY KEY, preco NUMERIC(3,2), quantidade VARCHAR(20), distribuidora VARCHAR(100));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
