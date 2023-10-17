package semana24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarCompras {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
    Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE Compras(id INT PRIMARY KEY, produto VARCHAR(50), quantidade VARCHAR(20), preco VARCHAR(30), distribuidora VARCHAR(100));";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
