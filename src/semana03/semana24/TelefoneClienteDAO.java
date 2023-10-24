package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class TelefoneClienteDAO {
    //CRUD

    public TelefoneCliente create(TelefoneCliente telefonecliente) throws SQLException {
        String sql = """
            INSERT INTO TelefoneCliente (id, id_cliente, ddd, numero)
            VALUES (?, ?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, telefonecliente.getId());
            statement.setInt(2, telefonecliente.getid_cliente());
            statement.setString(3, telefonecliente.getDdd());
            statement.setString(4, telefonecliente.getnumero());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                telefonecliente.setId(rs.getInt(1));
            }

            rs.close();

            return telefonecliente;
            
        } 
        
    }

    public TelefoneCliente update(TelefoneCliente telefonecliente) throws SQLException {
        String sql = """
            UPDATE TelefoneCliente 
            SET id_cliente = ?, ddd = ?, numero = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, telefonecliente.getid_cliente());
            statement.setString(2, telefonecliente.getDdd());
            statement.setString(3, telefonecliente.getnumero());
            statement.setInt(4, telefonecliente.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return telefonecliente;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM TelefoneCliente WHERE id = ?;";

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

    public void delete(TelefoneCliente telefonecliente) {
        delete(telefonecliente.getId());
    }

    public TelefoneCliente findById(Integer id) {
        String sql = "SELECT * FROM TelefoneCliente WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToTelefoneCliente(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<TelefoneCliente> findAll() throws SQLException {
        String sql = "SELECT * FROM TelefoneCliente;";
        List<TelefoneCliente> telefonecliente = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                telefonecliente.add(resultSetToTelefoneCliente(rs));
            }

            return telefonecliente;
        
        } 
        
    }

    private TelefoneCliente resultSetToTelefoneCliente(ResultSet rs) throws SQLException {
        return new TelefoneCliente(
            rs.getInt("id"),
            rs.getInt("id_cliente"),
            rs.getString("ddd"),
            rs.getString("numero")
        );
    }
}