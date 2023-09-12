package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn     = DriverManager.getConnection(url);

        String nome = "Maria da Silva";

        String sql = "SELECT * FROM alunos WHERE nome = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        pstm.executeUpdate();
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()){
            String nome1 = rs.getString("nome");
            if (nome1.equals("Maria da Silva")) {
            int id = rs.getInt("id");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id);
            System.out.println(nome1);
            System.out.println(email);
            System.out.println(ativo);
            }
    }

        pstm.close();
        conn.close();
    }
}