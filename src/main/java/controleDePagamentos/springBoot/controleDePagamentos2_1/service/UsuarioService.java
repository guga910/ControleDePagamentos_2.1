package controleDePagamentos.springBoot.controleDePagamentos2_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controleDePagamentos.springBoot.controleDePagamentos2_1.entidades.Usuario;
import controleDePagamentos.springBoot.controleDePagamentos2_1.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario create(Usuario usuario) {
//		UsuarioBuilder usuB= new UsuarioBuilder();
		
		
		return repository.save(usuario);
	}
	
	public Usuario fildById(int	id) {
		return  repository.findById(id).orElseThrow();
	}
	
	public List<Usuario> findAll(){
		return repository.findAll();
	}

}
