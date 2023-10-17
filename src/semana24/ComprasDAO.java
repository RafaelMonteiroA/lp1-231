package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class ComprasDAO {
    //CRUD

    public Compras create(Compras compras) throws SQLException {
        String sql = """
            INSERT INTO Compras (id, produto, quantidade, preco, distribuidora)
            VALUES (?, ?, ?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, compras.getId());
            statement.setString(2, compras.getProduto());
            statement.setString(3, compras.getQuantidade());
            statement.setString(4, compras.getPreco());
            statement.setString(5, compras.getDistribuidora());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                compras.setId(rs.getInt(1));
            }

            rs.close();

            return compras;
            
        } 
        
    }

    public Compras update(Compras compras) throws SQLException {
        String sql = """
            UPDATE Compras 
            SET produto = ?, quantidade = ?, preco = ?, distribuidora
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setString(1, compras.getProduto());
            statement.setString(2, compras.getQuantidade());
            statement.setString(3, compras.getPreco());
            statement.setString(4, compras.getDistribuidora());
            statement.setInt(5, compras.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return compras;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM Compras WHERE id = ?;";

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

    public void delete(Compras compras) {
        delete(compras.getId());
    }

    public Compras findById(Integer id) {
        String sql = "SELECT * FROM Compras WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToCompras(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Compras> findAll() throws SQLException {
        String sql = "SELECT * FROM Compras;";
        List<Compras> compras = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                compras.add(resultSetToCompras(rs));
            }

            return compras;
        
        } 
        
    }

    private Compras resultSetToCompras(ResultSet rs) throws SQLException {
        return new Compras(
            rs.getInt("id"),
            rs.getString("produto"),
            rs.getString("quantidade"),
            rs.getString("Preco"),
            rs.getString("distribuidora")
        );
    }
}