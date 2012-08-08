package sis.com.fachadas;

import java.util.List;

import sis.com.basicas.Categoria;
import sis.com.conexao.DAOFactory;
import sis.com.interfaces.ICategoriaDAO;



public class CategoriaFachada {
	
private ICategoriaDAO iCategoriaDAO;
	
	public  CategoriaFachada(){
		
		this.iCategoriaDAO = DAOFactory.criaCategoriaDAO();
		
	}
	
	public Categoria carregarCategoria(int codigoCategoria){

		return this.iCategoriaDAO.carregarCategoria(codigoCategoria);
	}

	public Categoria buscarCategoria(int codigoCategoria){
		return this.iCategoriaDAO.buscarCategoria(codigoCategoria);
	}
	
	public void salvarCategoria(Categoria categoria){
		
		int codigoCategoria = categoria.getCodigoCategoria();
		
			if ( codigoCategoria == 0){
				this.iCategoriaDAO.salvarCatecoria(categoria);
			}else{
				this.iCategoriaDAO.atualizarCategoria(categoria);
			}
	}
	
	public void excluirCategoria (Categoria categoria){
		this.iCategoriaDAO.excluirCategoria(categoria);
	}
	
	public List <?> listar(){
		return  this.iCategoriaDAO.listarCategoria();
	}

}
