package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class EmailFuncionarioDAO {
    //CRUD

    public EmailFuncionario create(EmailFuncionario emailfuncionario) throws SQLException {
        String sql = """
            INSERT INTO EmailFuncionario (id, id_funcionario, email)
            VALUES (?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, emailfuncionario.getId());
            statement.setInt(2, emailfuncionario.getid_funcionario());
            statement.setString(3, emailfuncionario.getemail());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                emailfuncionario.setId(rs.getInt(1));
            }

            rs.close();

            return emailfuncionario;
            
        } 
        
    }

    public EmailFuncionario update(EmailFuncionario emailfuncionario) throws SQLException {
        String sql = """
            UPDATE EmailFuncionario 
            SET id_funcionario = ?, email = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, emailfuncionario.getid_funcionario());
            statement.setString(2, emailfuncionario.getemail());
            statement.setInt(43, emailfuncionario.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return emailfuncionario;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM EmailFuncionario WHERE id = ?;";

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

    public void delete(EmailFuncionario emailfuncionario) {
        delete(emailfuncionario.getId());
    }

    public EmailFuncionario findById(Integer id) {
        String sql = "SELECT * FROM EmailFuncionario WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToEmailFuncionario(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<EmailFuncionario> findAll() throws SQLException {
        String sql = "SELECT * FROM EmailFuncionario;";
        List<EmailFuncionario> emailfuncionario = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                emailfuncionario.add(resultSetToEmailFuncionario(rs));
            }

            return emailfuncionario;
        
        } 
        
    }

    private EmailFuncionario resultSetToEmailFuncionario(ResultSet rs) throws SQLException {
        return new EmailFuncionario(
            rs.getInt("id"),
            rs.getInt("id_funcionario"),
            rs.getString("email")
        );
    }
}