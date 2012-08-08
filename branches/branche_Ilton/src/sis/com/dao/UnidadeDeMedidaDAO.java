package sis.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import sis.com.basicas.UnidadeDeMedida;
import sis.com.interfaces.IUnidadeDeMedidaDAO;

public class UnidadeDeMedidaDAO implements IUnidadeDeMedidaDAO {

private Session session;
	
	public void setSession(Session session){
		this.session = session;
	}
	
	@Override
	public void salvarUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
		this.session.save(unidadeDeMedida);
		
	}

	@Override
	public void atualizarUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
		this.session.update(unidadeDeMedida);
		
	}

	@Override
	public void excluirUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
		this.session.delete(unidadeDeMedida);
		
	}

	@Override
	public UnidadeDeMedida buscarUnidadeDeMedida(int codigoUMedida) {
		
		UnidadeDeMedida unidadeDeMedidaretorno = null;
		
		String hql = "select u from unidadedemedida u where u.codigoUMedida = :codigoUMedida";
		Query consulta =   this.session.createQuery(hql);
		consulta.setInteger(codigoUMedida, codigoUMedida);
		
		unidadeDeMedidaretorno = (UnidadeDeMedida) consulta.uniqueResult();
		return unidadeDeMedidaretorno; 

	}

	@Override
	public List<?> listarUnidadeDeMedida() {
		
		
		return this.session.createCriteria(UnidadeDeMedida.class).list();
	}

	@Override
	public UnidadeDeMedida carregarUnidadeDeMedida(int codigoUMedida) {
		
		return (UnidadeDeMedida) this.session.get(UnidadeDeMedida.class, codigoUMedida);
	}

}
