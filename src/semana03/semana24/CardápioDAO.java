CardapioDAO.java

package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CardapioDAO {

    public Cardapio create(Cardapio cardapio) throws SQLException {
        String sql = """
            INSERT INTO Cardapio (id, preco, sabor_pizza)
            VALUES (?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            
            statement.setDouble(1, cardapio.getId());
            statement.setDouble(2, cardapio.getPreco());
            statement.setString(3, cardapio.getsaborPizza());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                cardapio.setId(rs.getInt(1));
            }

            rs.close();

            return cardapio;
            
        }
        
    }

    public Cardapio update(Cardapio cardapio) throws SQLException {
        String sql = """
            UPDATE Cardapio
            SET preco = ?, sabor_pizza = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setDouble(1, cardapio.getPreco());
            statement.setString(2, cardapio.getsaborPizza());
            statement.setInt(3, cardapio.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return cardapio;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM Cardapio WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Cardapio cardapio) {
        delete(cardapio.getId());
    }

    public Cardapio findById(Integer id) {
        String sql = "SELECT * FROM Cardapio WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToCardapio(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Cardapio> findAll() throws SQLException {
        String sql = "SELECT * FROM Cardapio;";
        List<Cardapio> cardapios = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                cardapios.add(resultSetToCardapio(rs));
            }

            return cardapios;
        
        }
        
    }

    private Aluno resultSetToCardapio(ResultSet rs) throws SQLException {
        return new Cardapio(
            rs.getInt("id"),
            rs.getDouble("preco"),
            rs.getString("sabor_pizza"),
        );
    }
}