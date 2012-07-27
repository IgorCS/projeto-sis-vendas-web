package sis.com.beans;

import java.util.List;

import sis.com.basicas.Categoria;
import sis.com.fachadas.CategoriaFachada;



public class CategoriaBean {
	
	private Categoria categoria = new Categoria();
	private List<?> lista;
	
	public String novo(){
		this.categoria = new Categoria();
	
		return "categoria";
	}
	
	
	public String salvar(){
		
		
		CategoriaFachada categoriaFachada = new CategoriaFachada();
		categoriaFachada.salvarCategoria(this.categoria);
		
		return "categoriaSucesso";
	}
	
	public List<?> getLista(){
		
		
			
			CategoriaFachada categoriaFachada = new CategoriaFachada();
			this.lista = categoriaFachada.listar();
			
		
		return this.lista;
		
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public void setLista(List<?> lista) {
		this.lista = lista;
	}
	
	
}