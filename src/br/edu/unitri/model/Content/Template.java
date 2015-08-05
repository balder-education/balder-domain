package br.edu.unitri.model.Content;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author marcos.fernando
 *
 */
@Entity
@Table(name = "tbTemplate")
public class Template implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String description;

	private boolean status;

	@OneToOne
	@JoinColumn(name = "content_id", referencedColumnName = "id")
	private Content content;

	public Template() {
		super();
	}

	public Template(long id, String description, boolean status, Content content) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.content = content;
	}

	public Template(String description, boolean status, Content content) {
		super();
		this.description = description;
		this.status = status;
		this.content = content;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
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
		Template other = (Template) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
