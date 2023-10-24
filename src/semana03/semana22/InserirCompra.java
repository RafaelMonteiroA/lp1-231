package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirCompra {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        String produto = "Farinha de Trigo";
	Double preco = 5.99;
	String quantidade = "100 kg";
        String distribuidora = "Distribuidora A";

        String sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, produto);
        pstm.setDouble(2, preco);
        pstm.setString(3, quantidade);
	pstm.setString(4, distribuidora);
        pstm.executeUpdate();

	String produto2 = "Queijo Mussarela";
	Double preco2 = 7.99;
	String quantidade2 = "50 kg";
        String distribuidora2 = "Distribuidora B";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto2);
        pstm.setDouble(2, preco2);
        pstm.setString(3, quantidade2);
	pstm.setString(4, distribuidora2);
        pstm.executeUpdate();

	String produto3 = "Pepperoni";
	Double preco3 = 6.49;
	String quantidade3 = "20 kg";
        String distribuidora3 = "Distribuidora D";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto3);
        pstm.setDouble(2, preco3);
        pstm.setString(3, quantidade3);
	pstm.setString(4, distribuidora3);
        pstm.executeUpdate();

	String produto4 = "Cebola";
	Double preco4 = 2.99;
	String quantidade4 = "10 kg";
        String distribuidora4 = "Distribuidora E";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto4);
        pstm.setDouble(2, preco4);
        pstm.setString(3, quantidade4);
	pstm.setString(4, distribuidora4);
        pstm.executeUpdate();

	String produto5 = "Pimentão";
	Double preco5 = 3.99;
	String quantidade5 = "15 kg";
        String distribuidora5 = "Distribuidora F";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto5);
        pstm.setDouble(2, preco5);
        pstm.setString(3, quantidade5);
	pstm.setString(4, distribuidora5);
        pstm.executeUpdate();

	String produto6 = "Azeitonas";
	Double preco6 = 4.99;
	String quantidade6 = "5 kg";
        String distribuidora6 = "Distribuidora G";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto6);
        pstm.setDouble(2, preco6);
        pstm.setString(3, quantidade6);
	pstm.setString(4, distribuidora6);
        pstm.executeUpdate();

	String produto7 = "Cogumelos";
	Double preco7 = 5.49;
	String quantidade7 = "8 kg";
        String distribuidora7 = "Distribuidora H";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto7);
        pstm.setDouble(2, preco7);
        pstm.setString(3, quantidade7);
	pstm.setString(4, distribuidora7);
        pstm.executeUpdate();

	String produto8 = "Presunto";
	Double preco8 = 6.99;
	String quantidade8 = "25 kg";
        String distribuidora8 = "Distribuidora I";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto8);
        pstm.setDouble(2, preco8);
        pstm.setString(3, quantidade8);
	pstm.setString(4, distribuidora8);
        pstm.executeUpdate();

	String produto9 = "Calabresa";
	Double preco9 = 4.49;
	String quantidade9 = "18 kg";
        String distribuidora9 = "Distribuidora J";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto9);
        pstm.setDouble(2, preco9);
        pstm.setString(3, quantidade9);
	pstm.setString(4, distribuidora9);
        pstm.executeUpdate();

	String produto10 = "Anchovas";
	Double preco10 = 7.49;
	String quantidade10 = "12 kg";
        String distribuidora10 = "Distribuidora K";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto10);
        pstm.setDouble(2, preco10);
        pstm.setString(3, quantidade10);
	pstm.setString(4, distribuidora10);
        pstm.executeUpdate();

	String produto11 = "Molho BBQ";
	Double preco11 = 3.99;
	String quantidade11 = "10 litros";
        String distribuidora11 = "Distribuidora L";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto11);
        pstm.setDouble(2, preco11);
        pstm.setString(3, quantidade11);
	pstm.setString(4, distribuidora11);
        pstm.executeUpdate();

	String produto12 = "Tomate";
	Double preco12 = 2.49;
	String quantidade12 = "20 kg";
        String distribuidora12 = "Distribuidora D";

        sql = "INSERT INTO Compras VALUES(?,?,?,?)";
        pstm.setString(1, produto12);
        pstm.setDouble(2, preco12);
        pstm.setString(3, quantidade12);
	pstm.setString(4, distribuidora12);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
