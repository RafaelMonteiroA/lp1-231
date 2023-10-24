package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarAlunoId {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        int id = 1;

        String sql = "SELECT * FROM alunos WHERE id = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.executeUpdate();
        ResultSet rs = pstm.executeQuery(sql);
        
        while(rs.next()){
            int id1 = rs.getInt("id");
            if (id1 == 1) {
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id1);
            System.out.println(nome);
            System.out.println(email);
            System.out.println(ativo);
            }
    }

        pstm.close();
        conn.close();
    }
}
