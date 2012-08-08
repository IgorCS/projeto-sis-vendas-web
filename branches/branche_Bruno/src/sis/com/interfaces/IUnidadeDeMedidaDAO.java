package sis.com.interfaces;

import java.util.List;

import sis.com.basicas.UnidadeDeMedida;


public interface IUnidadeDeMedidaDAO {
	
	public void salvarUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida);
	public void atualizarUnidadeDeMedida (UnidadeDeMedida unidadeDeMedida);
	public void excluirUnidadeDeMedida (UnidadeDeMedida unidadeDeMedida);
	public UnidadeDeMedida buscarUnidadeDeMedida (int codigoUMedida);
	public List<?> listarUnidadeDeMedida();
	public UnidadeDeMedida carregarUnidadeDeMedida (int codigoUMedida);

}
