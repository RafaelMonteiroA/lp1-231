package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarAluno {
    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
    Connection conn = DriverManager.getConnection(url);

        int id = 1;

        String sql = "DELETE FROM alunos WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}