package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class TelefoneFuncionarioDAO {
    //CRUD

    public TelefoneFuncionario create(TelefoneFuncionario telefonefuncionario) throws SQLException {
        String sql = """
            INSERT INTO TelefoneFuncionario (id, id_funcionario, ddd, numero)
            VALUES (?, ?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, telefonefuncionario.getId());
            statement.setInt(2, telefonefuncionario.getId_funcionario());
            statement.setString(3, telefonefuncionario.getDdd());
            statement.setString(4, telefonefuncionario.getnumero());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                telefonefuncionario.setId(rs.getInt(1));
            }

            rs.close();

            return telefonefuncionario;
            
        } 
        
    }

    public TelefoneFuncionario update(TelefoneFuncionario telefonefuncionario) throws SQLException {
        String sql = """
            UPDATE TelefoneFuncionario 
            SET id_funcionario = ?, ddd = ?, numero = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setInt(1, telefonefuncionario.getId_funcionario());
            statement.setString(2, telefonefuncionario.getDdd());
            statement.setString(3, telefonefuncionario.getnumero());
            statement.setInt(4, telefonefuncionario.getId());
            
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
        String sql = "DELETE FROM TelefoneFuncionario WHERE id = ?;";

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

    public void delete(TelefoneFuncionario telefonefuncionario) {
        delete(telefonefuncionario.getId());
    }

    public TelefoneFuncionario findById(Integer id) {
        String sql = "SELECT * FROM TelefoneFuncionario WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToTelefoneFuncionario(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<TelefoneFuncionario> findAll() throws SQLException {
        String sql = "SELECT * FROM TelefoneFuncionario;";
        List<TelefoneFuncionario> telefonefuncionario = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                telefonefuncionario.add(resultSetToTelefoneFuncionario(rs));
            }

            return telefonefuncionario;
        
        } 
        
    }

    private TelefoneFuncionario resultSetToTelefoneFuncionario(ResultSet rs) throws SQLException {
        return new TelefoneFuncionario(
            rs.getInt("id"),
            rs.getInt("id_funcionario"),
            rs.getString("ddd"),
            rs.getString("numero")
        );
    }
}