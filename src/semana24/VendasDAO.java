package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class VendasDAO {
    //CRUD

    public Vendas create(Vendas vendas) throws SQLException {
        String sql = """
            INSERT INTO Vendas (id, id_cliente, id_funcionario, id_pizza, adicional, preco_adicional)
            VALUES (?, ?, ?, ?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, vendas.getId());
            statement.setInt(2, vendas.getId_cliente());
            statement.setString(3, vendas.getId_funcionario());
            statement.setString(4, vendas.getId_pizza());
            statement.setString(5, vendas.getAdicional());
            statement.setString(6, vendas.getPreco_adicional());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                telefonefuncionario.setId(rs.getInt(1));
            }

            rs.close();

            return vendas;
            
        } 
        
    }

    public Vendas update(Vendas vendas) throws SQLException {
        String sql = """
            UPDATE Vendas 
            SET id_cliente = ?, id_funcionario = ?, id_pizza = ?, adicional = ?, preco_adicional = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, vendas.getId_cliente());
            statement.setString(2, vendas.getId_funcionario());
            statement.setString(3, vendas.getId_pizza());
            statement.setString(4, vendas.getAdicional());
            statement.setString(5, vendas.getPreco_adicional());
            statement.setInt(6, vendas.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return telefonefuncionario;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM Vendas WHERE id = ?;";

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

    public void delete(Vendas vendas) {
        delete(vendas.getId());
    }

    public Vendas findById(Integer id) {
        String sql = "SELECT * FROM Vendas WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToVendas(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Vendas> findAll() throws SQLException {
        String sql = "SELECT * FROM Vendas;";
        List<Vendas> vendas = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                vendas.add(resultSetToVendas(rs));
            }

            return vendas;
        
        } 
        
    }

    private Vendas resultSetToVendas(ResultSet rs) throws SQLException {
        return new Vendas(
            rs.getInt("id"),
            rs.getInt("id_cliente"),
            rs.getInt("id_funcionario"),
            rs.getInt("id_pizza"),
            rs.getString("adicional"),
            rs.getString("preco_adicional")
        );
    }
}