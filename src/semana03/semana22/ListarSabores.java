package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarSabores {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        String sql = "SELECT sabor_pizza FROM Cardápio";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()) {
            String sabor_pizza = rs.getString("sabor_pizza");

            System.out.println(sabor_pizza);
        }


    }
}
