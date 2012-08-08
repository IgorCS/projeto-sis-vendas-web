package sis.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import sis.com.basicas.Categoria;
import sis.com.interfaces.ICategoriaDAO;

public class CategoriaDAO implements ICategoriaDAO{
private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}
	
	@Override
	public void salvarCatecoria(Categoria categoria) {
		this.session.save(categoria);
		
	}

	@Override
	public void atualizarCategoria(Categoria categoria) {
		this.session.update(categoria);
		
	}

	@Override
	public void excluirCategoria(Categoria categoria) {
		this.session.delete(categoria);
	}

	@Override
	public Categoria buscarCategoria(int codigoCategoria) {
		
		String hql = "select c from Categoria c where c.codigoCategoria = :codigoCategoria ";
		Query consulta =   this.session.createQuery(hql);
		consulta.setInteger(codigoCategoria, codigoCategoria);
		
		return (Categoria) consulta.uniqueResult();
	}

	@Override
	public List<?> listarCategoria() {
		
		return this.session.createCriteria(Categoria.class).list();
	}

	@Override
	public Categoria carregarCategoria(int codigo) {
		
		return (Categoria) this.session.get(Categoria.class, codigo);
	}
	

}
