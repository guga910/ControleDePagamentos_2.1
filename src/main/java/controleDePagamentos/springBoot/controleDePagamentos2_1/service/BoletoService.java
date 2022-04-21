package controleDePagamentos.springBoot.controleDePagamentos2_1.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controleDePagamentos.springBoot.controleDePagamentos2_1.entidades.Boleto;
import controleDePagamentos.springBoot.controleDePagamentos2_1.repository.BoletoRepository;


@Service
public class BoletoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boleto boleto;

	@Autowired
	private BoletoRepository repository;


	public Boleto novoBoleto(Boleto boleto) {
		return repository.save(boleto);
	}
	
	public void deleteBoleto(int indice) {
		 boleto= encontrarBoletoPorCod(indice);
		repository.delete(boleto);
	}
	
	public Boleto encontrarBoletoPorCod(int indice) {
		
		return repository.findById(indice).orElseThrow();
	}
	
	public List<Boleto> todosOsBoletos() {
		return repository.findAll();
	}
	
	public Boleto updateService(Boleto boleto) {

		Boleto entity = encontrarBoletoPorCod(boleto.getIndice());
		entity.setDescricao(boleto.getDescricao());
		entity.setValor(boleto.getValor());
		entity.setVencimento(boleto.getVencimento());
		entity.setPago(boleto.getPago());
		
		return repository.save(entity);
	}
	
	public Boolean pagarConta(int indice) {
		Boleto boletoASerPago= encontrarBoletoPorCod(indice);
		 boletoASerPago.setPago(true);
		 return boletoASerPago.getPago();
	}
	

}
