package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirNoCardápio {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        int id = 1;
        Double preco = 12.99;
        String sabor_pizza = "Pizza Margherita";

        String sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setDouble(2, preco);
        pstm.setString(3, sabor_pizza);
        pstm.executeUpdate();


	int id2 = 2;
        Double preco2 = 14.99;
        String sabor_pizza2 = "Pizza Pepperoni";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id2);
        pstm.setDouble(2, preco2);
        pstm.setString(3, sabor_pizza2);
        pstm.executeUpdate();

	int id3 = 3;
        Double preco3 = 13.49;
        String sabor_pizza3 = "Pizza Quatro Queijos";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id3);
        pstm.setDouble(2, preco3);
        pstm.setString(3, sabor_pizza3);
        pstm.executeUpdate();

	int id4 = 4;
        Double preco4 = 15.99;
        String sabor_pizza4 = "Pizza Frango com Catupiry";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id4);
        pstm.setDouble(2, preco4);
        pstm.setString(3, sabor_pizza4);
        pstm.executeUpdate();

	int id5 = 5;
        Double preco5 = 16.49;
        String sabor_pizza5 = "Pizza Calabresa";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id5);
        pstm.setDouble(2, preco5);
        pstm.setString(3, sabor_pizza5);
        pstm.executeUpdate();

	int id6 = 6;
        Double preco6 = 13.99;
        String sabor_pizza6 = "Pizza Vegetariana";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id6);
        pstm.setDouble(2, preco6);
        pstm.setString(3, sabor_pizza6);
        pstm.executeUpdate();

	int id7 = 7;
        Double preco7 = 15.49;
        String sabor_pizza7 = "Pizza Portuguesa";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id7);
        pstm.setDouble(2, preco7);
        pstm.setString(3, sabor_pizza7);
        pstm.executeUpdate();

	int id8 = 8;
        Double preco8 = 14.99;
        String sabor_pizza8 = "Pizza Bacon";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id8);
        pstm.setDouble(2, preco8);
        pstm.setString(3, sabor_pizza8);
        pstm.executeUpdate();

	int id9 = 9;
        Double preco9 = 16.99;
        String sabor_pizza9 = "Pizza Carne de Sol";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id9);
        pstm.setDouble(2, preco9);
        pstm.setString(3, sabor_pizza9);
        pstm.executeUpdate();

	int id10 = 10;
        Double preco10 = 14.49;
        String sabor_pizza10 = "Pizza Margherita Especial";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id10);
        pstm.setDouble(2, preco10);
        pstm.setString(3, sabor_pizza10);
        pstm.executeUpdate();	

	int id11 = 11;
        Double preco11 = 17.99;
        String sabor_pizza11 = "Pizza Camarão";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id11);
        pstm.setDouble(2, preco11);
        pstm.setString(3, sabor_pizza11);
        pstm.executeUpdate();

	int id12 = 12;
        Double preco12 = 15.99;
        String sabor_pizza12 = "Pizza Mexicana";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id12);
        pstm.setDouble(2, preco12);
        pstm.setString(3, sabor_pizza12);
        pstm.executeUpdate();

	int id13 = 13;
        Double preco13 = 18.49;
        String sabor_pizza13 = "Pizza Rúcula com Tomate Seco";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id13);
        pstm.setDouble(2, preco13);
        pstm.setString(3, sabor_pizza13);
        pstm.executeUpdate();

	int id14 = 14;
        Double preco14 = 15.49;
        String sabor_pizza14 = "Pizza Alho e Óleo";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id14);
        pstm.setDouble(2, preco14);
        pstm.setString(3, sabor_pizza14);
        pstm.executeUpdate();

	int id15 = 15;
        Double preco15 = 19.99;
        String sabor_pizza15 = "Pizza Coração de Frango";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id15);
        pstm.setDouble(2, preco15);
        pstm.setString(3, sabor_pizza15);
        pstm.executeUpdate();

	int id16 = 16;
        Double preco16 = 16.99;
        String sabor_pizza16 = "Pizza Margherita com Pesto";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id16);
        pstm.setDouble(2, preco16);
        pstm.setString(3, sabor_pizza16);
        pstm.executeUpdate();

	int id17 = 17;
        Double preco17 = 20.49;
        String sabor_pizza17 = "Pizza Filé Mignon";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id17);
        pstm.setDouble(2, preco17);
        pstm.setString(3, sabor_pizza17);
        pstm.executeUpdate();

	int id18 = 18;
        Double preco18 = 17.49;
        String sabor_pizza18 = "Pizza Banana Caramelada";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id18);
        pstm.setDouble(2, preco18);
        pstm.setString(3, sabor_pizza18);
        pstm.executeUpdate();

	
	int id19 = 19;
        Double preco19 = 21.99;
        String sabor_pizza19 = "Pizza Quatro Estações";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id19);
        pstm.setDouble(2, preco19);
        pstm.setString(3, sabor_pizza19);
        pstm.executeUpdate();

	int id20 = 20;
        Double preco20 = 18.99;
        String sabor_pizza20 = "Pizza Chocolate com Morango";

	sql = "INSERT INTO Cardápio VALUES(?,?,?)";
        pstm.setInt(1, id20);
        pstm.setDouble(2, preco20);
        pstm.setString(3, sabor_pizza20);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
