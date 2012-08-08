package sis.com.fachadas;

import java.util.List;

import sis.com.basicas.UnidadeDeMedida;
import sis.com.conexao.DAOFactory;
import sis.com.interfaces.IUnidadeDeMedidaDAO;

public class UnidadeDeMedidaFachada {

	private IUnidadeDeMedidaDAO iUnidadeDeMedidaDAO;

	public UnidadeDeMedidaFachada() {

		this.iUnidadeDeMedidaDAO = DAOFactory.criaUnidadeDeMedidaDAO();

	}

	public UnidadeDeMedida carregarUnidadeDeMedida(int codigoUMedida) {

		return this.iUnidadeDeMedidaDAO.carregarUnidadeDeMedida(codigoUMedida);

	}

	public UnidadeDeMedida buscarUnidadeDeMedida(int codigoUMedida) {
		return this.iUnidadeDeMedidaDAO.buscarUnidadeDeMedida(codigoUMedida);
	}

	public void salvarUnidadedeMedida(UnidadeDeMedida unidadeDeMedida) {
		int codigoUMedida = unidadeDeMedida.getCodigoUMedida();

		if (codigoUMedida == 0) {
			this.iUnidadeDeMedidaDAO.salvarUnidadeDeMedida(unidadeDeMedida);
		} else {
			this.iUnidadeDeMedidaDAO.atualizarUnidadeDeMedida(unidadeDeMedida);
		}
	}

	public void excluirUnidadeDeMedida (UnidadeDeMedida unidadeDeMedida){
		this.iUnidadeDeMedidaDAO.excluirUnidadeDeMedida(unidadeDeMedida);
	}
	
	public List<?> listarUnidadeDeMedida(){
		return this.iUnidadeDeMedidaDAO.listarUnidadeDeMedida();
		
	}
}
