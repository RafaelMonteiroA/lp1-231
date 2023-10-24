package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarVendas {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        String sql = "SELECT * FROM Vendas";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()) {
            String cpf_cliente = rs.getString("cpf_cliente");
        String sabor_pizza = rs.getString("sabor_pizza");
        String cpf_funcionario = rs.getString("cpf_funcionario");
        String desc_pizza = rs.getString("desc_pizza");
        Double preco = rs.getDouble("preco");

            System.out.println(cpf_cliente);
        System.out.println(sabor_pizza);
        System.out.println(cpf_funcionario);
        System.out.println(desc_pizza);
        System.out.println(preco);
        }


    }
}
