package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class EmailClienteDAO {
    //CRUD

    public EmailCliente create(EmailCliente emailcliente) throws SQLException {
        String sql = """
            INSERT INTO EmailCliente (id, id_funcionario, email)
            VALUES (?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, emailcliente.getId());
            statement.setInt(2, emailcliente.getid_cliente());
            statement.setString(3, emailcliente.getemail());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                emailcliente.setId(rs.getInt(1));
            }

            rs.close();

            return emailcliente;
            
        } 
        
    }

    public EmailCliente update(EmailCliente emailcliente) throws SQLException {
        String sql = """
            UPDATE EmailCliente 
            SET id_funcionario = ?, email = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, emailcliente.getid_cliente());
            statement.setString(2, emailcliente.getemail());
            statement.setInt(3, emailcliente.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return emailcliente;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM EmailCliente WHERE id = ?;";

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

    public void delete(EmailCliente emailcliente) {
        delete(emailcliente.getId());
    }

    public EmailCliente findById(Integer id) {
        String sql = "SELECT * FROM EmailCliente WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToEmailCliente(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<EmailCliente> findAll() throws SQLException {
        String sql = "SELECT * FROM EmailCliente;";
        List<EmailCliente> emailcliente = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                emailcliente.add(resultSetToEmailCliente(rs));
            }

            return emailcliente;
        
        } 
        
    }

    private EmailCliente resultSetToEmailCliente(ResultSet rs) throws SQLException {
        return new EmailCliente(
            rs.getInt("id"),
            rs.getInt("id_cliente"),
            rs.getString("email")
        );
    }
}