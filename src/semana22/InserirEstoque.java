package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirEstoque {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante1?user=estudante1&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        Integer id = 1;
        String produto = "Farinha de Trigo";
	String quantidade = "100 kg";

        String sql = "INSERT INTO Estoque VALUES(?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, produto);
        pstm.setString(3, quantidade);
        pstm.executeUpdate();

        Integer id2 = 2;
	String produto2 = "Queijo Mussarela";
	String quantidade2 = "50 kg";

        sql = "INSERT INTO Estoque VALUES(?,?,?)";
        pstm.setInt(1, id2);
        pstm.setString(2, produto2);
        pstm.setString(3, quantidade2);
        pstm.executeUpdate();

        Integer id3 = 3;
	String produto3 = "Molho de Tomate";
	String quantidade3 = "30 litros";

        sql = "INSERT INTO Estoque VALUES(?,?,?)";
        pstm.setInt(1, id3);
        pstm.setString(2, produto3);
        pstm.setString(3, quantidade3);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
