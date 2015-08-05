/**
 * 
 */
package br.edu.unitri.model.Content;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.unitri.enumerators.TipoConteudo;
import br.edu.unitri.enumerators.TipoLevelContent;

/**
 * @author marcos.fernando
 *
 */
@Entity
@Table(name = "tbContent")
public class Content implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String description;

	@Column(name = "TPCONTEUDO")
	@Enumerated(EnumType.STRING)
	private TipoConteudo tipoConteudo;

	@Column(name = "TPLEVCONT")
	@Enumerated(EnumType.STRING)
	private TipoLevelContent tipoLevel;

	public Content() {
		super();
	}

	public Content(long id, String description, TipoConteudo tipoConteudo,
			TipoLevelContent tipoLevel) {
		super();
		this.id = id;
		this.description = description;
		this.tipoConteudo = tipoConteudo;
		this.tipoLevel = tipoLevel;
	}

	public Content(String description, TipoConteudo tipoConteudo,
			TipoLevelContent tipoLevel) {
		super();
		this.description = description;
		this.tipoConteudo = tipoConteudo;
		this.tipoLevel = tipoLevel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TipoConteudo getTipoConteudo() {
		return tipoConteudo;
	}

	public void setTipoConteudo(TipoConteudo tipoConteudo) {
		this.tipoConteudo = tipoConteudo;
	}

	public TipoLevelContent getTipoLevel() {
		return tipoLevel;
	}

	public void setTipoLevel(TipoLevelContent tipoLevel) {
		this.tipoLevel = tipoLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Content other = (Content) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
