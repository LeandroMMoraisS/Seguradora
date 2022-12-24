package SeguradoraAPi.SeguradoraApi.Models;

import java.math.BigDecimal;
import java.sql.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Contratos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contrato_id;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Clientes cliente;

	@OneToOne(cascade=CascadeType.PERSIST)
	private Veiculos veiculo;

	private Date data_contratacao;
	private Date data_renovacao;
	private BigDecimal mensaliade;
	private Boolean ativo;

	
	public Integer getContrato_id() {
		return contrato_id;
	}

	public void setContrato_id(Integer contrato_id) {
		this.contrato_id = contrato_id;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Date getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(Date data_contratacao) {
		this.data_contratacao = data_contratacao;
	}

	public Date getData_renovacao() {
		return data_renovacao;
	}

	public void setData_renovacao(Date data_renovacao) {
		this.data_renovacao = data_renovacao;
	}

	public BigDecimal getMensaliade() {
		return mensaliade;
	}

	public void setMensaliade(BigDecimal mensaliade) {
		this.mensaliade = mensaliade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	

}
