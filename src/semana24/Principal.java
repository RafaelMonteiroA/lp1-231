package semana24;

import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) throws SQLException {
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        
        Estoque estoque = new Estoque(1, "Abacate", "0 KG");

        Estoque estoqueCriado = estoqueDAO.create(estoque);

        System.out.println(estoqueCriado.getId());

        System.out.println(estoqueDAO.findById(2));
    }
    
}