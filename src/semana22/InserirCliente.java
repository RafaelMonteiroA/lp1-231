package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirCliente {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        String cpf = "12345678901";
        String nome = "João Silva";
        String endereço = "Rua A, 123";
	String data_nascimento = "1990-05-15";
	String email = "joao@email.com";
	String telefone = "(11) 1234-5678";

        String sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf);
        pstm.setString(2, nome);
        pstm.setString(3, endereço);
	pstm.setString(4, data_nascimento);
	pstm.setString(5, email);
	pstm.setString(6, telefone);
        pstm.executeUpdate();

	String cpf1 = "98765432109";
        String nome1 = "Maria Santos";
        String endereço1 = "Avenida B, 456";
        String data_nascimento1 = "1985-08-22";
	String email1 = "maria@email.com";
	String telefone1 = "(11) 9876-5432";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf1);
        pstm.setString(2, nome1);
        pstm.setString(3, endereço1);
	pstm.setString(4, data_nascimento1);
	pstm.setString(5, email1);
	pstm.setString(6, telefone1);

	String cpf2 = "55555555555";
        String nome2 = "Carlos Oliveira";
        String endereço2 = "Rua C, 789";
        String data_nascimento2 = "1982-02-10";
	String email2 = "carlos@email.com";
	String telefone2 = "(11) 5555-5555";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf2);
        pstm.setString(2, nome2);
        pstm.setString(3, endereço2);
        pstm.setString(4, data_nascimento2);
	pstm.setString(5, email2);
	pstm.setString(6, telefone2);

	String cpf3 = "33333333333";
        String nome3 = "Lúcia Pereira";
        String endereço3 = "Avenida D, 101";
        String data_nascimento3 = "1995-12-30";
	String email3 = "lucia@email.com";
	String telefone3 = "(11) 3333-3333";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf3);
        pstm.setString(2, nome3);
        pstm.setString(3, endereço3);
        pstm.setString(4, data_nascimento3);
	pstm.setString(5, email3);
	pstm.setString(6, telefone3);

	String cpf4 = "77777777777";
        String nome4 = "Pedro Rocha";
        String endereço4 = "Rua E, 567";
        String data_nascimento4 = "1987-07-05";
	String email4 = "pedro@email.com";
	String telefone4 = "(11) 7777-7777";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf4);
        pstm.setString(2, nome4);
        pstm.setString(3, endereço4);
        pstm.setString(4, data_nascimento4);
	pstm.setString(5, email4);
	pstm.setString(6, telefone4);

	String cpf5 = "44444444444";
        String nome5 = "Ana Santos";
        String endereço5 = "Avenida F, 202";
        String data_nascimento5 = "1993-04-12";
	String email5 = "ana@email.com";
	String telefone5 = "(11) 4444-4444";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf5);
        pstm.setString(2, nome5);
        pstm.setString(3, endereço5);
        pstm.setString(4, data_nascimento5);
	pstm.setString(5, email5);
	pstm.setString(6, telefone5);

	String cpf6 = "88888888888";
        String nome6 = "Laura Fernandes";
        String endereço6 = "Rua G, 876";
        String data_nascimento6 = "1980-09-18";
	String email6 = "laura@email.com";
	String telefone6 = "(11) 8888-8888";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf6);
        pstm.setString(2, nome6);
        pstm.setString(3, endereço6);
        pstm.setString(4, data_nascimento6);
	pstm.setString(5, email6);
	pstm.setString(6, telefone6);

	String cpf7 = "66666666666";
        String nome7 = "Rafael Lima";
        String endereço7 = "Avenida H, 303";
        String data_nascimento7 = "1998-08-25";
	String email7 = "rafael@email.com";
	String telefone7 = "(11) 6666-6666";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf7);
        pstm.setString(2, nome7);
        pstm.setString(3, endereço7);
        pstm.setString(4, data_nascimento7);
	pstm.setString(5, email7);
	pstm.setString(6, telefone7);

	String cpf8 = "22222222222";
        String nome8 = "Mariana Souza";
        String endereço8 = "Rua I, 432";
        String data_nascimento8 = "1989-11-17";
	String email8 = "mariana@email.com";
	String telefone8 = "(11) 2222-2222";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf8);
        pstm.setString(2, nome8);
        pstm.setString(3, endereço8);
        pstm.setString(4, data_nascimento8);
	pstm.setString(5, email8);
	pstm.setString(6, telefone8);

	String cpf9 = "99999999999";
        String nome9 = "Juliana Oliveira";
        String endereço9 = "Avenida J, 654";
        String data_nascimento9 = "1994-03-03";
	String email9 = "juliana@email.com";
	String telefone9 = "(11) 9999-9999";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf9);
        pstm.setString(2, nome9);
        pstm.setString(3, endereço9);
        pstm.setString(4, data_nascimento9);
	pstm.setString(5, email9);
	pstm.setString(6, telefone9);

	String cpf10 = "11111111111";
        String nome10 = "Antônio Silva";
        String endereço10 = "Rua K, 789";
        String data_nascimento10 = "1986-06-20";
	String email10 = "antonio@email.com";
	String telefone10 = "(11) 1111-1111";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf10);
        pstm.setString(2, nome10);
        pstm.setString(3, endereço10);
        pstm.setString(4, data_nascimento10);
	pstm.setString(5, email10);
	pstm.setString(6, telefone10);

	String cpf11 = "12121212121";
        String nome11 = "Fernanda Almeida";
        String endereço11 = "Avenida L, 1010";
        String data_nascimento11 = "1984-10-08";
	String email11 = "fernanda@email.com";
	String telefone11 = "(11) 1212-1212";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf11);
        pstm.setString(2, nome11);
        pstm.setString(3, endereço11);
        pstm.setString(4, data_nascimento11);
	pstm.setString(5, email11);
	pstm.setString(6, telefone11);

	String cpf12 = "34343434343";
        String nome12 = "Gustavo Santos";
        String endereço12 = "Rua M, 3030";
        String data_nascimento12 = "1991-07-15";
	String email12 = "gustavo@email.com";
	String telefone12 = "(11) 3434-3434";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf12);
        pstm.setString(2, nome12);
        pstm.setString(3, endereço12);
        pstm.setString(4, data_nascimento12);
	pstm.setString(5, email12);
	pstm.setString(6, telefone12);

	String cpf13 = "56565656565";
        String nome13 = "Isabela Lima";
        String endereço13 = "Avenida N, 5050";
        String data_nascimento13 = "1997-02-28";
	String email13 = "isabela@email.com";
	String telefone13 = "(11) 5656-5656";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf13);
        pstm.setString(2, nome13);
        pstm.setString(3, endereço13);
        pstm.setString(4, data_nascimento13);
	pstm.setString(5, email13);
	pstm.setString(6, telefone13);

	String cpf14 = "78787878787";
        String nome14 = "Thiago Pereira";
        String endereço14 = "Rua O, 7070";
        String data_nascimento14 = "1983-05-22";
	String email14 = "thiago@email.com";
	String telefone14 = "(11) 7878-7878";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf14);
        pstm.setString(2, nome14);
        pstm.setString(3, endereço14);
        pstm.setString(4, data_nascimento14);
	pstm.setString(5, email14);
	pstm.setString(6, telefone14);

	String cpf15 = "90909090909";
        String nome15 = "Sandra Rocha";
        String endereço15 = "Avenida P, 9090";
        String data_nascimento15 = "1990-12-10";
	String email15 = "sandra@email.com";
	String telefone15 = "(11) 9090-9090";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf15);
        pstm.setString(2, nome15);
        pstm.setString(3, endereço15);
        pstm.setString(4, data_nascimento15);
	pstm.setString(5, email15);
	pstm.setString(6, telefone15);

	String cpf16 = "23232323232";
        String nome16 = "Roberto Silva";
        String endereço16 = "Rua Q, 8080";
        String data_nascimento16 = "1986-09-03";
	String email16 = "roberto@email.com";
	String telefone16 = "(11) 2323-2323";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf16);
        pstm.setString(2, nome16);
        pstm.setString(3, endereço16);
        pstm.setString(4, data_nascimento16);
	pstm.setString(5, email16);
	pstm.setString(6, telefone16);

	String cpf17 = "45454545454";
        String nome17 = "Carla Oliveira";
        String endereço17 = "Avenida R, 6060";
        String data_nascimento17 = "1995-04-17";
	String email17 = "carla@email.com";
	String telefone17 = "(11) 4545-4545";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf17);
        pstm.setString(2, nome17);
        pstm.setString(3, endereço17);
        pstm.setString(4, data_nascimento17);
	pstm.setString(5, email17);
	pstm.setString(6, telefone17);

	String cpf18 = "67676767676";
        String nome18 = "Lucas Fernandes";
        String endereço18 = "Rua S, 909";
        String data_nascimento18 = "1988-11-29";;
	String email18 = "lucas@email.com";
	String telefone18 = "(11) 6767-6767";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf18);
        pstm.setString(2, nome18);
        pstm.setString(3, endereço18);
        pstm.setString(4, data_nascimento18);
	pstm.setString(5, email18);
	pstm.setString(6, telefone18);

	String cpf19 = "89898989898";
        String nome19 = "Eduarda Souza";
        String endereço19 = "Avenida T, 505";
        String data_nascimento19 = "1993-03-05";
	String email19 = "eduarda@email.com";
	String telefone19 = "(11) 8989-8989";

	sql = "INSERT INTO Cliente VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf19);
        pstm.setString(2, nome19);
        pstm.setString(3, endereço19);
        pstm.setString(4, data_nascimento19);
	pstm.setString(5, email19);
	pstm.setString(6, telefone19);

        pstm.close();
        conn.close();
    }
}
