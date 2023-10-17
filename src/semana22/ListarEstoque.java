package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarEstoque {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        String sql = "SELECT produto, quantidade FROM Estoque";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()) {
            String produto = rs.getString("produto");
        String quantidade = rs.getString("quantidade");

            System.out.println(produto);
        System.out.println(quantidade);

               }
       }
}

