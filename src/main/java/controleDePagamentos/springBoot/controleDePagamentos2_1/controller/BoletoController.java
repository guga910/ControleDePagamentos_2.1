package controleDePagamentos.springBoot.controleDePagamentos2_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import controleDePagamentos.springBoot.controleDePagamentos2_1.entidades.Boleto;
import controleDePagamentos.springBoot.controleDePagamentos2_1.service.BoletoService;

//@RestController
@RequestMapping("/boleto")
public class BoletoController {
	
	@Autowired
	private BoletoService service;

	
	@RequestMapping(value = "/{descricao}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String descricaoBoleto(@PathVariable("descricao") String descricao) {
		return "voce esta pagando a/o "+descricao;
	}
	
	@RequestMapping(method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Boleto> boletoFindyAll() {
//		BoletoService bs= new BoletoService();
		
		return service.todosOsBoletos();
	}

	@RequestMapping(
			name = "/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Boleto boletoFindBy(@PathVariable("id") int id) {
//		BoletoService bs= new BoletoService();
		
		return service.encontrarBoletoPorCod(id);
	}
	
	
}
