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

import SeguradoraAPi.SeguradoraApi.Models.Contratos;
import SeguradoraAPi.SeguradoraApi.Repository.ContratosRepository;

@RestController
@RequestMapping("/contratos")
public class ContratosController {

	
	@Autowired
	ContratosRepository contratorepository;
	
	@GetMapping("/todos")
	public List<Contratos>RetornaContratos()
	{
		return contratorepository.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Contratos>RetornaContrato(@PathVariable int id)
	{
		return contratorepository.findById(id);
	}
	
	@PostMapping("adicionar")
	public Contratos AdicionaContrato(@RequestBody Contratos contrato)
	{
		return contratorepository.save(contrato);
	}
	
	@PutMapping
	public Contratos AtualizarContratos(Contratos contrato)
	{
		return contratorepository.save(contrato);
	}
	
	@DeleteMapping("/{id}")
	public void Deleting(@PathVariable int id)
	{
		contratorepository.deleteById(id);
	}
	
}
