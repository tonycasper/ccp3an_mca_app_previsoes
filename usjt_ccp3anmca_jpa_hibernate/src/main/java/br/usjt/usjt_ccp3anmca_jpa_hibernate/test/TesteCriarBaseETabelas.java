package br.usjt.usjt_ccp3anmca_jpa_hibernate.test;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
			Persistence.createEntityManagerFactory("usjtPU");
	}

}
