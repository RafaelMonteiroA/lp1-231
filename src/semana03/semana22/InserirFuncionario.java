package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirFuncionario {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        Connection conn = DriverManager.getConnection(url);

        String cpf = "11122333444";
	String cargo = "Atendente";
        String nome = "Pedro Oliveira";
	String data_nascimento = "1987-03-10";
	String email = "pedro@email.com";
	String telefone = "(11) 2222-3333";

        String sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, cpf);
        pstm.setString(2, cargo);
        pstm.setString(3, nome);
        pstm.setString(4, data_nascimento);
        pstm.setString(5, email);
	pstm.setString(6, telefone);
        pstm.executeUpdate();

	String cpf1 = "55566677788";
	String cargo1 = "Chef de Cozinha";
        String nome1 = "Ana Rodrigues";
        String data_nascimento1 = "1980-11-05";
	String email1 = "ana@email.com";
	String telefone1 = "(11) 5555-6666";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf1);
        pstm.setString(2, cargo1);
        pstm.setString(3, nome1);
        pstm.setString(4, data_nascimento1);
        pstm.setString(5, email1);
	pstm.setString(6, telefone1);
        pstm.executeUpdate();

	String cpf2a = "99988877766";
	String cargo2a = "Garçom";
        String nome2a = "Lucas Silva";
        String data_nascimento2a = "1992-09-15";
	String email2a = "lucas@email.com";
	String telefone2a = "(11) 9998-8877";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf2a);
        pstm.setString(2, cargo2a);
        pstm.setString(3, nome2a);
        pstm.setString(4, data_nascimento2a);
        pstm.setString(5, email2a);
	pstm.setString(6, telefone2a);
        pstm.executeUpdate();

	String cpf2 = "33344455566";
	String cargo2 = "Pizzaiolo";
        String nome2 = "Mariana Santos";
        String data_nascimento2 = "1985-05-25";
	String email2 = "mariana@email.com";
	String telefone2 = "(11) 3334-4455";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf2);
        pstm.setString(2, cargo2);
        pstm.setString(3, nome2);
        pstm.setString(4, data_nascimento2);
        pstm.setString(5, email2);
	pstm.setString(6, telefone2);
        pstm.executeUpdate();

	String cpf3 = "77788899911";
	String cargo3 = "Gerente";
        String nome3 = "Rafael Oliveira";
        String data_nascimento3 = "1978-04-12";
	String email3 = "rafael@email.com";
	String telefone3 = "(11) 7778-8899";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf3);
        pstm.setString(2, cargo3);
        pstm.setString(3, nome3);
        pstm.setString(4, data_nascimento3);	
        pstm.setString(5, email3);
	pstm.setString(6, telefone3);
        pstm.executeUpdate();

	String cpf4 = "22233344455";
	String cargo4 = "Atendente";
        String nome4 = "Isabela Fernandes";
        String data_nascimento4 = "1990-01-30";
	String email4 = "isabela@email.com";
	String telefone4 = "(11) 2223-3344";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf4);
        pstm.setString(2, cargo4);
        pstm.setString(3, nome4);
        pstm.setString(4, data_nascimento4);
        pstm.setString(5, email4);
	pstm.setString(6, telefone4);
        pstm.executeUpdate();

	String cpf5 = "66677788899";
	String cargo5 = "Cozinheiro";
        String nome5 = "Carlos Lima";
        String data_nascimento5 = "1983-12-08";
	String email5 = "carlos@email.com";
	String telefone5 = "(11) 6667-7788";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf5);
        pstm.setString(2, cargo5);
        pstm.setString(3, nome5);
        pstm.setString(4, data_nascimento5);
        pstm.setString(5, email5);
	pstm.setString(6, telefone5);
        pstm.executeUpdate();

	String cpf6 = "44455566677";
	String cargo6 = "Garçom";
        String nome6 = "Thiago Pereira";
        String data_nascimento6 = "1991-07-02";
	String email6 = "thiago@email.com";
	String telefone6 = "(11) 4445-5566";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf6);
        pstm.setString(2, cargo6);
        pstm.setString(3, nome6);
        pstm.setString(4, data_nascimento6);
        pstm.setString(5, email6);
	pstm.setString(6, telefone6);
        pstm.executeUpdate();

	String cpf7 = "88899900011";
	String cargo7 = "Pizzaiolo";
        String nome7 = "Fernanda Souza";
        String data_nascimento7 = "1986-03-20";
	String email7 = "fernanda@email.com";
	String telefone7 = "(11) 8889-9000";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf7);
        pstm.setString(2, cargo7);
        pstm.setString(3, nome7);
        pstm.setString(4, data_nascimento7);
        pstm.setString(5, email7);
	pstm.setString(6, telefone7);
        pstm.executeUpdate();

	String cpf8 = "12345678910";
	String cargo8 = "Gerente";
        String nome8 = "Maria Oliveira";
        String data_nascimento8 = "1980-08-15";
	String email8 = "maria@email.com";
	String telefone8 = "(11) 1234-5678";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf8);
        pstm.setString(2, cargo8);
        pstm.setString(3, nome8);
        pstm.setString(4, data_nascimento8);
        pstm.setString(5, email8);
	pstm.setString(6, telefone8);
        pstm.executeUpdate();

	String cpf9 = "77777777777";
	String cargo9 = "Atendente";
        String nome9 = "Lúcia Oliveira";
        String data_nascimento9 = "1994-06-12";
	String email9 = "lucia@email.com";
	String telefone9 = "(11) 7777-7777";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf9);
        pstm.setString(2, cargo9);
        pstm.setString(3, nome9);
        pstm.setString(4, data_nascimento9);
        pstm.setString(5, email9);
	pstm.setString(6, telefone9);
        pstm.executeUpdate();

	String cpf10 = "55555555555";
	String cargo10 = "Pizzaiolo";
        String nome10 = "Roberto Silva";
        String data_nascimento10 = "1989-09-23";
	String email10 = "roberto@email.com";
	String telefone10 = "(11) 5555-5555";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf10);
        pstm.setString(2, cargo10);
        pstm.setString(3, nome10);
        pstm.setString(4, data_nascimento10);
        pstm.setString(5, email10);
	pstm.setString(6, telefone10);
        pstm.executeUpdate();

	String cpf11 = "33333333333";
	String cargo11 = "Garçom";
        String nome11 = "Carla Santos";
        String data_nascimento11 = "1992-04-28";
	String email11 = "carla@email.com";
	String telefone11 = "(11) 3333-3333";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf11);
        pstm.setString(2, cargo11);
        pstm.setString(3, nome11);
        pstm.setString(4, data_nascimento11);
        pstm.setString(5, email11);
	pstm.setString(6, telefone11);
        pstm.executeUpdate();

	String cpf12 = "99999999999";
	String cargo12 = "Chef de Cozinha";
        String nome12 = "Gustavo Lima";
        String data_nascimento12 = "1984-02-17";
	String email12 = "gustavo@email.com";
	String telefone12 = "(11) 9999-9999";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf12);
        pstm.setString(2, cargo12);
        pstm.setString(3, nome12);
        pstm.setString(4, data_nascimento12);
        pstm.setString(5, email12);
	pstm.setString(6, telefone12);
        pstm.executeUpdate();

	String cpf13 = "11111111111";
	String cargo13 = "Atendente";
        String nome13 = "Mariana Oliveira";
        String data_nascimento13 = "1997-11-05";
	String email13 = "mariana@email.com";
	String telefone13 = "(11) 1111-1111";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf13);
        pstm.setString(2, cargo13);
        pstm.setString(3, nome13);
        pstm.setString(4, data_nascimento13);
        pstm.setString(5, email13);
	pstm.setString(6, telefone13);
        pstm.executeUpdate();

	String cpf14 = "88888888888";
	String cargo14 = "Cozinheiro";
        String nome14 = "Eduardo Fernandes";
        String data_nascimento14 = "1986-07-30";
	String email14 = "eduardo@email.com";
	String telefone14 = "(11) 8888-8888";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf14);
        pstm.setString(2, cargo14);
        pstm.setString(3, nome14);
        pstm.setString(4, data_nascimento14);
        pstm.setString(5, email14);
	pstm.setString(6, telefone14);
        pstm.executeUpdate();

	String cpf15 = "44444444444";
	String cargo15 = "Gerente";
        String nome15 = "Sandra Lima";
        String data_nascimento15 = "1981-12-08";
	String email15 = "sandra@email.com";
	String telefone15 = "(11) 4444-4444";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf15);
        pstm.setString(2, cargo15);
        pstm.setString(3, nome15);
        pstm.setString(4, data_nascimento15);
        pstm.setString(5, email15);
	pstm.setString(6, telefone15);
        pstm.executeUpdate();

	String cpf16 = "22222222222";
	String cargo16 = "Pizzaiolo";
        String nome16 = "Lucas Rodrigues";
        String data_nascimento16 = "1988-05-19";
	String email16 = "lucas@email.com";
	String telefone16 = "(11) 2222-2222";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf16);
        pstm.setString(2, cargo16);
        pstm.setString(3, nome16);
        pstm.setString(4, data_nascimento16);
        pstm.setString(5, email16);
	pstm.setString(6, telefone16);
        pstm.executeUpdate();

	String cpf17 = "66666666666";
	String cargo17 = "Garçom";
        String nome17 = "Antônio Souza";
        String data_nascimento17 = "1993-03-15";
	String email17 = "antonio@email.com";
	String telefone17 = "(11) 6666-6666";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf17);
        pstm.setString(2, cargo17);
        pstm.setString(3, nome17);
        pstm.setString(4, data_nascimento17);
        pstm.setString(5, email17);
	pstm.setString(6, telefone17);
        pstm.executeUpdate();

	String cpf18 = "55554444333";
	String cargo18 = "Chef de Cozinha";
        String nome18 = "Juliana Fernandes";
        String data_nascimento18 = "1982-08-10";
	String email18 = "juliana@email.com";
	String telefone18 = "(11) 5555-4444";

	sql = "INSERT INTO Funcionario VALUES(?,?,?,?,?,?)";
        pstm.setString(1, cpf18);
        pstm.setString(2, cargo18);
        pstm.setString(3, nome18);
        pstm.setString(4, data_nascimento18);
        pstm.setString(5, email18);
	pstm.setString(6, telefone18);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
