package SeguradoraAPi.SeguradoraApi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SeguradoraAPi.SeguradoraApi.Models.Clientes;
import SeguradoraAPi.SeguradoraApi.Repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController

{
	@Autowired
	ClienteRepository clienterepository;

	@GetMapping("/{cliente_id}")
	public Optional<Clientes> RetornaCLiente(@PathVariable Integer cliente_id) {
		return clienterepository.findById(cliente_id);
	}
	@GetMapping("/todos")
	public List<Clientes> TodosCLientes()
	{
		return clienterepository.findAll();
	}
	
	@PostMapping
	public Clientes GerandoClientes(@RequestBody Clientes cliente) {
		return clienterepository.save(cliente);

	}

	@PutMapping
	public Clientes Atualizando(@RequestBody Clientes cliente) {
		return clienterepository.save(cliente);

	}

	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable int id) {
		clienterepository.deleteById(id);
	}

}
