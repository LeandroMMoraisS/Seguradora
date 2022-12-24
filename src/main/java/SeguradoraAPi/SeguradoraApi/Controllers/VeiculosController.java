package SeguradoraAPi.SeguradoraApi.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SeguradoraAPi.SeguradoraApi.Models.Veiculos;
import SeguradoraAPi.SeguradoraApi.Repository.VeiculosRepository;

@RestController
@RequestMapping("veiculos")
public class VeiculosController {

	@Autowired
	VeiculosRepository veiculosRepository;
	
	@GetMapping
	public List<Veiculos> RetornaTudo()
	{
		return veiculosRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Veiculos>BuscaPorId(@PathVariable Integer id)
	{
		return veiculosRepository.findById(id);
	}
	
	@RequestMapping( method = {RequestMethod.POST,RequestMethod.PUT})
	public Veiculos AdicionaMuda(Veiculos veiculo)
	{
		return veiculosRepository.save(veiculo);
	}
	
	@DeleteMapping("{id}")
	public void deleta(@PathVariable Integer id)
	{
		
		veiculosRepository.deleteById(id);
	}
}
