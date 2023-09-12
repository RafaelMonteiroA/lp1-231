package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirVenda {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        String cpf_cliente0 = "12345678901";
	String sabor_pizza0 = "Pizza Margherita";
        String cpf_funcionario0 = "11122333444";
	String desc_pizza0 = "Pizza deliciosa";
	Double preco0 = 12.99;

        String sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf_cliente0);
        pstm.setString(2, sabor_pizza0);
        pstm.setString(3, cpf_funcionario0);
	pstm.setString(4, desc_pizza0);
	pstm.setDouble(5, preco0);
        pstm.executeUpdate();

	String cpf_cliente = "98765432109";
	String sabor_pizza = "Pizza Pepperoni";
        String cpf_funcionario = "55566677788";
	String desc_pizza = "Pizza apimentada";
	Double preco = 14.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente);
        pstm.setString(2, sabor_pizza);
        pstm.setString(3, cpf_funcionario);
	pstm.setString(4, desc_pizza);
	pstm.setDouble(5, preco);
        pstm.executeUpdate();

	String cpf_cliente2 = "12345678901";
	String sabor_pizza2 = "Pizza Quatro Queijos";
        String cpf_funcionario2 = "99988877766";
	String desc_pizza2 = "Pizza cremosa";
	Double preco2 = 13.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente2);
        pstm.setString(2, sabor_pizza2);
        pstm.setString(3, cpf_funcionario2);
	pstm.setString(4, desc_pizza2);
	pstm.setDouble(5, preco2);
        pstm.executeUpdate();

	String cpf_cliente3 = "55555555555";
	String sabor_pizza3 = "Pizza Frango com Catupiry";
        String cpf_funcionario3 = "33344455566";
	String desc_pizza3 = "Pizza de frango deliciosa";
	Double preco3 = 15.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente3);
        pstm.setString(2, sabor_pizza3);
        pstm.setString(3, cpf_funcionario3);
	pstm.setString(4, desc_pizza3);
	pstm.setDouble(5, preco3);
        pstm.executeUpdate();

	String cpf_cliente4 = "98765432109";
	String sabor_pizza4 = "Pizza Calabresa";
        String cpf_funcionario4 = "11122333444";
	String desc_pizza4 = "Pizza picante";
	Double preco4 = 16.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente4);
        pstm.setString(2, sabor_pizza4);
        pstm.setString(3, cpf_funcionario4);
	pstm.setString(4, desc_pizza4);
	pstm.setDouble(5, preco4);
        pstm.executeUpdate();

	String cpf_cliente5 = "12345678901";
	String sabor_pizza5 = "Pizza Vegetariana";
        String cpf_funcionario5 = "55566677788";
	String desc_pizza5 = "Pizza saudável";
	Double preco5 = 13.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente5);
        pstm.setString(2, sabor_pizza5);
        pstm.setString(3, cpf_funcionario5);
	pstm.setString(4, desc_pizza5);
	pstm.setDouble(5, preco5);
        pstm.executeUpdate();

	String cpf_cliente6 = "55555555555";
	String sabor_pizza6 = "Pizza Portuguesa";
        String cpf_funcionario6 = "99988877766";
	String desc_pizza6 = "Pizza clássica";
	Double preco6 = 15.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente6);
        pstm.setString(2, sabor_pizza6);
        pstm.setString(3, cpf_funcionario6);
	pstm.setString(4, desc_pizza6);
	pstm.setDouble(5, preco6);
        pstm.executeUpdate();

	String cpf_cliente7 = "12345678901";
	String sabor_pizza7 = "Pizza Bacon";
        String cpf_funcionario7 = "33344455566";
	String desc_pizza7 = "Pizza saborosa";
	Double preco7 = 14.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente7);
        pstm.setString(2, sabor_pizza7);
        pstm.setString(3, cpf_funcionario7);
	pstm.setString(4, desc_pizza7);
	pstm.setDouble(5, preco7);
        pstm.executeUpdate();

	String cpf_cliente8 = "98765432109";
	String sabor_pizza8 = "Pizza Carne de Sol";
        String cpf_funcionario8 = "11122333444";
	String desc_pizza8 = "Pizza nordestina";
	Double preco8 = 16.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente8);
        pstm.setString(2, sabor_pizza8);
        pstm.setString(3, cpf_funcionario8);
	pstm.setString(4, desc_pizza8);
	pstm.setDouble(5, preco8);
        pstm.executeUpdate();

	String cpf_cliente9 = "12345678901";
	String sabor_pizza9 = "Pizza Margherita Especial";
        String cpf_funcionario9 = "55566677788";
	String desc_pizza9 = "Pizza especial do chef";
	Double preco9 = 14.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente9);
        pstm.setString(2, sabor_pizza9);
        pstm.setString(3, cpf_funcionario9);
	pstm.setString(4, desc_pizza9);
	pstm.setDouble(5, preco9);
        pstm.executeUpdate();

	String cpf_cliente10 = "55555555555";
	String sabor_pizza10 = "Pizza Camarão";
        String cpf_funcionario10 = "99988877766";
	String desc_pizza10 = "Pizza de frutos do mar";
	Double preco10 = 17.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente10);
        pstm.setString(2, sabor_pizza10);
        pstm.setString(3, cpf_funcionario10);
	pstm.setString(4, desc_pizza10);
	pstm.setDouble(5, preco10);
        pstm.executeUpdate();

	String cpf_cliente11 = "98765432109";
	String sabor_pizza11 = "Pizza Mexicana";
        String cpf_funcionario11 = "11122333444";
	String desc_pizza11 = "Pizza picante com pimentões";
	Double preco11 = 15.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente11);
        pstm.setString(2, sabor_pizza11);
        pstm.setString(3, cpf_funcionario11);
	pstm.setString(4, desc_pizza11);
	pstm.setDouble(5, preco11);
        pstm.executeUpdate();

	String cpf_cliente12 = "12345678901";
	String sabor_pizza12 = "Pizza Rúcula com Tomate Seco";
        String cpf_funcionario12 = "55566677788";
	String desc_pizza12 = "Pizza gourmet";
	Double preco12 = 18.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente12);
        pstm.setString(2, sabor_pizza12);
        pstm.setString(3, cpf_funcionario12);
	pstm.setString(4, desc_pizza12);
	pstm.setDouble(5, preco12);
        pstm.executeUpdate();

	String cpf_cliente13 = "55555555555";
	String sabor_pizza13 = "Pizza Alho e Óleo";
        String cpf_funcionario13 = "99988877766";
	String desc_pizza13 = "Pizza com muito alho";
	Double preco13 = 15.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente13);
        pstm.setString(2, sabor_pizza13);
        pstm.setString(3, cpf_funcionario13);
	pstm.setString(4, desc_pizza13);
	pstm.setDouble(5, preco13);
        pstm.executeUpdate();

	String cpf_cliente14 = "12345678901";
	String sabor_pizza14 = "Pizza Coração de Frango";
        String cpf_funcionario14 = "33344455566";
	String desc_pizza14 = "Pizza em forma de coração";
	Double preco14 = 19.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente14);
        pstm.setString(2, sabor_pizza14);
        pstm.setString(3, cpf_funcionario14);
	pstm.setString(4, desc_pizza14);
	pstm.setDouble(5, preco14);
        pstm.executeUpdate();

	String cpf_cliente15 = "98765432109";
	String sabor_pizza15 = "Pizza Margherita com Pesto";
        String cpf_funcionario15 = "11122333444";
	String desc_pizza15 = "Pizza clássica com molho pesto";
	Double preco15 = 16.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente15);
        pstm.setString(2, sabor_pizza15);
        pstm.setString(3, cpf_funcionario15);
	pstm.setString(4, desc_pizza15);
	pstm.setDouble(5, preco15);
        pstm.executeUpdate();

	String cpf_cliente16 = "55555555555";
	String sabor_pizza16 = "Pizza Filé Mignon";
        String cpf_funcionario16 = "99988877766";
	String desc_pizza16 = "Pizza com carne de filé mignon";
	Double preco16 = 20.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente16);
        pstm.setString(2, sabor_pizza16);
        pstm.setString(3, cpf_funcionario16);
	pstm.setString(4, desc_pizza16);
	pstm.setDouble(5, preco16);
        pstm.executeUpdate();

	String cpf_cliente17 = "12345678901";
	String sabor_pizza17 = "Pizza Banana Caramelada";
        String cpf_funcionario17 = "33344455566";
	String desc_pizza17 = "Pizza de sobremesa";
	Double preco17 = 17.49;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente17);
        pstm.setString(2, sabor_pizza17);
        pstm.setString(3, cpf_funcionario17);
	pstm.setString(4, desc_pizza17);
	pstm.setDouble(5, preco17);
        pstm.executeUpdate();

	String cpf_cliente18 = "98765432109";
	String sabor_pizza18 = "Pizza Quatro Estações";
        String cpf_funcionario18 = "11122333444";
	String desc_pizza18 = "Pizza com ingredientes variados";
	Double preco18 = 21.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente18);
        pstm.setString(2, sabor_pizza18);
        pstm.setString(3, cpf_funcionario18);
	pstm.setString(4, desc_pizza18);
	pstm.setDouble(5, preco18);
        pstm.executeUpdate();

	String cpf_cliente19 = "12345678901";
	String sabor_pizza19 = "Pizza Chocolate com Morango";
        String cpf_funcionario19 = "55566677788";
	String desc_pizza19 = "Pizza doce de sobremesa";
	Double preco19 = 18.99;

        sql = "INSERT INTO Vendas VALUES(?,?,?,?,?)";
        pstm.setString(1, cpf_cliente19);
        pstm.setString(2, sabor_pizza19);
        pstm.setString(3, cpf_funcionario19);
	pstm.setString(4, desc_pizza19);
	pstm.setDouble(5, preco19);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
