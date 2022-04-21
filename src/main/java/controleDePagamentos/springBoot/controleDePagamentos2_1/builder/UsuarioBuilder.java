package controleDePagamentos.springBoot.controleDePagamentos2_1.builder;

import java.time.LocalDate;

import controleDePagamentos.springBoot.controleDePagamentos2_1.entidades.Usuario;

public class UsuarioBuilder {
	
	public Usuario umUsuario() {
		Usuario usuario= new Usuario();
		
		usuario.setAtivo(true);
		usuario.setDataRegistro(LocalDate.now());
		usuario.setNome("usuario");
		usuario.setSenha("senha");
		
		return usuario;
	
	
	}

}
