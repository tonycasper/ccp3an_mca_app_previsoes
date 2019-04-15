package br.ustj.exercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ustj.exercicios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}