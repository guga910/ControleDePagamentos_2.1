package controleDePagamentos.springBoot.controleDePagamentos2_1.entidades;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int cod_usuario;
	
	@Column(nullable = false,length= 20)
	private String nome;
	
	@Column(nullable= false)
	private LocalDate dataRegistro;
	
	@Column(nullable= false)
	private String senha;
	
	@Column(nullable= false)
	private boolean ativo;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario( String nome, LocalDate dataRegistro, String senha) {
		this.nome = nome;
		this.dataRegistro = dataRegistro;
		this.senha = senha;
		this.ativo= true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCod_usuario() {
		return cod_usuario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	
	
	
	
	

}
