package sis.com.basicas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name="unidadedemedida")
@SequenceGenerator (name="codigoUMedida", sequenceName = "codigoUMedida")

public class UnidadeDeMedida implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (generator = "codigoUMedida", strategy = GenerationType.SEQUENCE)
	@Column (name="codigoumedida")
	
	private int codigoUMedida;

	@Column (name="descricaoumedida")
	private String descricaoUMedida;
	
	public UnidadeDeMedida(){
		
	}

	public int getCodigoUMedida() {
		return codigoUMedida;
	}

	public void setCodigoUMedida(int codigoUMedida) {
		this.codigoUMedida = codigoUMedida;
	}

	public String getDescricaoUMedida() {
		return descricaoUMedida;
	}

	public void setDescricaoUMedida(String descricaoUMedida) {
		this.descricaoUMedida = descricaoUMedida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoUMedida;
		result = prime
				* result
				+ ((descricaoUMedida == null) ? 0 : descricaoUMedida.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeDeMedida other = (UnidadeDeMedida) obj;
		if (codigoUMedida != other.codigoUMedida)
			return false;
		if (descricaoUMedida == null) {
			if (other.descricaoUMedida != null)
				return false;
		} else if (!descricaoUMedida.equals(other.descricaoUMedida))
			return false;
		return true;
	}

	
}
