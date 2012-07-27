package sis.com.conexao;

import sis.com.dao.CategoriaDAO;
import sis.com.interfaces.ICategoriaDAO;



public class DAOFactory {
	
	public static ICategoriaDAO criaCategoriaDAO(){
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return categoriaDAO;
	}

}
