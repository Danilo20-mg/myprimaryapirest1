
package com.example.myprimaryapirest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public List<Empresa> listar() {
        return repository.todas();
    }

    public Empresa buscarPorSlug(String slug) {
        return repository.todas().stream()
                .filter(empresa -> empresa.slug().equals(slug))
                .findFirst()
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Empresa não encontrada"
                        )
                );
    }
}
