package semana24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO = Data Access Object 
public class FuncionarioDAO {
    //CRUD

    public Funcionario create(Funcionario funcionario) throws SQLException {
        String sql = """
            INSERT INTO Funcionario (id, cargo, nome, data_nascimento)
            VALUES (?, ?, ?, ?);
        """;
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {

            statement.setInt(1, funcionario.getId());
            statement.setString(2, funcionario.getCargo());
            statement.setString(3, funcionario.getNome());
            statement.setString(4, funcionario.getData_nascimento());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                funcionario.setId(rs.getInt(1));
            }

            rs.close();

            return funcionario;
            
        } 
        
    }

    public Funcionario update(Funcionario funcionario) throws SQLException {
        String sql = """
            UPDATE Funcionario 
            SET cargo = ?, nome = ?, data_nascimento = ?
            WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {

            statement.setString(1, funcionario.getCargo());
            statement.setString(2, funcionario.getNome());
            statement.setString(3, funcionario.getData_nascimento());
            statement.setInt(4, funcionario.getId());
            
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return funcionario;
            }
            
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM Funcionario WHERE id = ?;";

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

    public void delete(Funcionario funcionario) {
        delete(funcionario.getId());
    }

    public Funcionario findById(Integer id) {
        String sql = "SELECT * FROM Funcionario WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToFuncionario(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Funcionario> findAll() throws SQLException {
        String sql = "SELECT * FROM Funcionario;";
        List<Funcionario> funcionario = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                funcionario.add(resultSetToFuncionario(rs));
            }

            return funcionario;
        
        } 
        
    }

    private Funcionario resultSetToFuncionario(ResultSet rs) throws SQLException {
        return new Funcionario(
            rs.getInt("id"),
            rs.getString("cargo"),
            rs.getString("nome"),
            rs.getString("data_nascimento")
        );
    }
}