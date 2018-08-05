package com.edu.up.Cliente.clienterest.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.up.Cliente.clienterest.model.Cliente;
import com.edu.up.Cliente.clienterest.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteResources {
	
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/teste")
	public String teste()
	{
		return "Hello World";
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Cliente> listaClientes()
	{
		Iterable<Cliente> listaClientes = cr.findAll();
		return listaClientes;
		
	}
	
	@PostMapping
	public Cliente cadastrarCliente(@RequestBody @Valid Cliente cliente)
	{
		
		return cr.save(cliente);
	}
	
	@DeleteMapping
	public Cliente deletarCliente(@RequestBody Cliente cliente )
	{
		cr.delete(cliente);
		return cliente;
				
	}
	
}
