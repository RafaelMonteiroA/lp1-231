package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class EstoqueDAO {
    //CRUD

    public Estoque create(Estoque estoque) throws SQLException {
        String sql = """
            INSERT INTO Estoque (id, produto, quantidade)
            VALUES (?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, estoque.getId());
            statement.setString(2, estoque.getProduto());
            statement.setString(3, estoque.getQuantidade());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                estoque.setId(rs.getInt(1));
            }

            rs.close();

            return estoque;
            
        } 
        
    }

    public Estoque update(Estoque estoque) throws SQLException {
        String sql = """
            UPDATE Estoque 
            SET produto = ?, quantidade = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setString(1, estoque.getProduto());
            statement.setString(2, estoque.getQuantidade());
            statement.setInt(3, estoque.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return estoque;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM Estoque WHERE id = ?;";

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

    public void delete(Estoque estoque) {
        delete(estoque.getId());
    }

    public Estoque findById(Integer id) {
        String sql = "SELECT * FROM Estoque WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToEstoque(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Estoque> findAll() throws SQLException {
        String sql = "SELECT * FROM Estoque;";
        List<Estoque> estoque = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                estoque.add(resultSetToEstoque(rs));
            }

            return estoque;
        
        } 
        
    }

    private Estoque resultSetToEstoque(ResultSet rs) throws SQLException {
        return new Estoque(
            rs.getInt("id"),
            rs.getString("produto"),
            rs.getString("quantidade")
        );
    }
}