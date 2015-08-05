/**
 * 
 */
package br.edu.unitri.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.unitri.enumerators.TipoUsuario;

/**
 * @author marcos.fernando
 *
 */
@Entity
@Table(name = "tbUser")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;

	@Column(name = "username", length = 60, nullable = true)
	private String userName;

	@Column(name = "password", length = 60, nullable = true)
	private String password;

	@Column(name = "TPUSUARIO")
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;

	public User() {
		super();
	}

	public User(long id, Role role, String userName, String password,
			TipoUsuario tipoUsuario) {
		super();
		this.id = id;
		this.role = role;
		this.userName = userName;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
	}

	public User(Role role, String userName, String password,
			TipoUsuario tipoUsuario) {
		super();
		this.role = role;
		this.userName = userName;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
