package br.com.abc.javacore.a14polimorfismo.test;

import br.com.abc.javacore.a14polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.a14polimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.a14polimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();
    }
}
