package controleDePagamentos.springBoot.controleDePagamentos2_1.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boletos")
public class Boleto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int indice;
	
	@Column(name = "descricao", nullable = false,length= 30)
	private String descricao;

	@Column(name = "valor", nullable = false,length= 10)
	private double valor;

	@Column( nullable = false)
	private Date vencimento;
	
	@Column( nullable = false)
	private int cod_usuario;
	
	@Column( nullable = false)
	private boolean pago;

	
	
	public Boleto() {
	}
	
	public Boleto(String descricao, double valor, Date vencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.vencimento = vencimento;
		this.pago= false;
	}


	public Boleto(String descricao, double valor, Date vencimento, int indice) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.vencimento = vencimento;
		this.indice = indice;
		this.pago= false;
	}


	public boolean getPago() {
		return pago;
	}

	public void setPago(boolean ativo) {
		this.pago = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public int getIndice() {
		return indice;
	}

//	public void setIndice(int indice) {
//		this.indice = indice;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, indice, valor, vencimento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boleto other = (Boleto) obj;
		return Objects.equals(descricao, other.descricao) && indice == other.indice
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor)
				&& Objects.equals(vencimento, other.vencimento);
	}
	
	
	

}