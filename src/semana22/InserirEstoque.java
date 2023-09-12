package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirEstoque {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        String produto = "Farinha de Trigo";
	String quantidade = "100 kg";

        String sql = "INSERT INTO Estoque VALUES(?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, produto);
        pstm.setString(2, quantidade);
        pstm.executeUpdate();

	String produto2 = "Queijo Mussarela";
	String quantidade2 = "50 kg";

        sql = "INSERT INTO Estoque VALUES(?,?,?,?)";
        pstm.setString(1, produto2);
        pstm.setString(2, quantidade2);
        pstm.executeUpdate();

	String produto3 = "Molho de Tomate";
	String quantidade3 = "30 litros";

        sql = "INSERT INTO Estoque VALUES(?,?,?,?)";
        pstm.setString(1, produto3);
        pstm.setString(2, quantidade3);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
