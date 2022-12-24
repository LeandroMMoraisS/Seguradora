package SeguradoraAPi.SeguradoraApi.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cliente_id;
	private String nome;
	private Date data_de_nascimento;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Enderecos endereco;

	@OneToMany
	private List<Contratos> contratos = new ArrayList<Contratos>();
	@OneToMany
	private List<Veiculos> veiculo = new ArrayList<Veiculos>();

	public List<Contratos> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contratos> contratos) {
		this.contratos = contratos;
	}

	public List<Veiculos> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculos> veiculo) {
		this.veiculo = veiculo;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}

}