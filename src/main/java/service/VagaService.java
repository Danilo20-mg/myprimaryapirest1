package service;

import modals.Vaga;
import org.springframework.stereotype.Service;
import repository.VagaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VagaService {

    private final VagaRepository repository;

    public VagaService(VagaRepository repository) {
        this.repository = repository;
    }

    public List<Vaga> listar() {
        return repository.todas();
    }

    public List<Vaga> buscarPorId(String id) {
        return repository.todas().stream()
                .filter(vaga -> vaga.id().equals(id))
                .collect(Collectors.toList());
    }
}