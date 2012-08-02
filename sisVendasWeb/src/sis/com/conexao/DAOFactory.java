package sis.com.conexao;

import sis.com.dao.CategoriaDAO;
import sis.com.dao.UnidadeDeMedidaDAO;
import sis.com.interfaces.ICategoriaDAO;
import sis.com.interfaces.IUnidadeDeMedidaDAO;



public class DAOFactory {
	
	public static ICategoriaDAO criaCategoriaDAO(){
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return categoriaDAO;
	}

	public static IUnidadeDeMedidaDAO criaUnidadeDeMedidaDAO(){
		
		UnidadeDeMedidaDAO unidadeDeMedidaDAO = new UnidadeDeMedidaDAO();
		unidadeDeMedidaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return unidadeDeMedidaDAO;
	}
}
