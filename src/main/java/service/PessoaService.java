
package service;

import modals.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listar() {
        return repository.todas();
    }

    public Pessoa buscarPorId(String id) {
        return repository.todas().stream()
                .filter(pessoa -> pessoa.id().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Pessoa não encontrada"
                        )
                );
    }
}
