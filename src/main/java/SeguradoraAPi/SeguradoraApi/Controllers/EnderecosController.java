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

import SeguradoraAPi.SeguradoraApi.Models.Enderecos;
import SeguradoraAPi.SeguradoraApi.Repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecosController 
{
	@Autowired
	EnderecoRepository enderecorepository;
	
	@GetMapping
	public List<Enderecos> RetornaTodos()
	{
		return enderecorepository.findAll();
	}
	
	
	@GetMapping("{id}")
	public Optional<Enderecos> RetornaPorId(@PathVariable Integer id)
	{
		return enderecorepository.findById(id);
	}
	
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Enderecos Adiciona(Enderecos endereco)
	{
		return enderecorepository.save(endereco);
	}
	
	
	@DeleteMapping
	public void Deleta(@PathVariable Integer id)
	{
		enderecorepository.deleteById(id);
	}
}
