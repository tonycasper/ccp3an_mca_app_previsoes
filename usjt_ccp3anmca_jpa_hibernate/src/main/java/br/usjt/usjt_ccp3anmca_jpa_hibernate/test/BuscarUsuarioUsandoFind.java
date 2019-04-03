package br.usjt.usjt_ccp3anmca_jpa_hibernate.test;

import javax.persistence.EntityManager;

import br.usjt.usjt_ccp3anmca_jpa_hibernate_model.JPAUtil;
import br.usjt.usjt_ccp3anmca_jpa_hibernate_model.Usuario;

public class BuscarUsuarioUsandoFind {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();

	}

}
