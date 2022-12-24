package SeguradoraAPi.SeguradoraApi.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Veiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer veiculo_id;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Contratos contrato;

	public Integer getVeiculo_id() {
		return veiculo_id;
	}

	public void setVeiculo_id(Integer veiculo_id) {
		this.veiculo_id = veiculo_id;
	}

	public Contratos getContrato() {
		return contrato;
	}

	public void setContrato(Contratos contrato) {
		this.contrato = contrato;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@ManyToOne
	private Clientes cliente;

	private String marca;

	private String modelo;

	private Integer ano;

}
