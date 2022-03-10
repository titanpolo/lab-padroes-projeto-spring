package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import one.digitalinnovation.gof.model.*;
import one.digitalinnovation.gof.service.GeoPluginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private GeolocalizacaoRepository geolocalizacaoRepository;
	@Autowired
	private GeoPluginService geoPluginService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// Buscar Cliente por ID.
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComGeoPluginRequest(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComGeoPluginRequest(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}

	private void salvarClienteComGeoPluginRequest(Cliente cliente) {

		String geopluginRequest = cliente.getGeolocalizacao().getGeopluginRequest();
		Geolocalizacao geolocalizacao = geolocalizacaoRepository.findById(geopluginRequest).orElseGet(() -> {
			Geolocalizacao novaGeolocalizacao = geoPluginService.consultarGeolocalizacao(geopluginRequest);
			geolocalizacaoRepository.save(novaGeolocalizacao);
			return novaGeolocalizacao;
		});
		cliente.setGeolocalizacao(geolocalizacao);
		clienteRepository.save(cliente);
	}

}
