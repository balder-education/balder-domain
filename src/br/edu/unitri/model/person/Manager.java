/**
 * 
 */
package br.edu.unitri.model.person;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.unitri.model.user.User;

/**
 * @author marcos.fernando
 *
 */
@Entity
@Table(name = "tbManager")
public class Manager extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager() {
		super();
	}

	public Manager(long id, String name, Date burnDate, String rg, String cpf,
			String email, Collection<Endereco> listaEnderecos,
			Collection<Contato> listaContatos,
			Collection<Occupation> listaOcupacao, User user) {
		super(id, name, burnDate, rg, cpf, email, listaEnderecos,
				listaContatos, listaOcupacao, user);
	}

	public Manager(String name, Date burnDate, String rg, String cpf,
			String email, Collection<Endereco> listaEnderecos,
			Collection<Contato> listaContatos,
			Collection<Occupation> listaOcupacao, User user) {
		super(name, burnDate, rg, cpf, email, listaEnderecos, listaContatos,
				listaOcupacao, user);
	}

	public Manager(String name, Date burnDate, String rg, String cpf,
			String email, User user) {
		super(name, burnDate, rg, cpf, email, user);
	}

}
