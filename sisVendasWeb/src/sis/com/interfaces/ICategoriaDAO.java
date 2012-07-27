package sis.com.interfaces;

import java.util.List;

import sis.com.basicas.Categoria;



public interface ICategoriaDAO {
	
	public void salvarCatecoria(Categoria categoria);
	public void atualizarCategoria (Categoria categoria);
	public void excluirCategoria (Categoria categoria);
	public Categoria buscarCategoria (int codigoCategoria);
	public List<?> listarCategoria();
	public Categoria carregarCategoria (int codigo);

}
