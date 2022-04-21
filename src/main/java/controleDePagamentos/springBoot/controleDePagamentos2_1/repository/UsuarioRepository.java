package controleDePagamentos.springBoot.controleDePagamentos2_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controleDePagamentos.springBoot.controleDePagamentos2_1.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
