package br.usjt.usjt_ccp3anmca_jpa_hibernate.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_model.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_model.Usuario;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		
		Usuario u = new Usuario ();
		u.setNome("Ana");
		u.setFone("11223344");
		u.setEmail("ana@usjt.br");
		manager.persist(u);
		transaction.commit();
	}

}
