
package controller;

import modals.Pessoa;
import service.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pessoa> obterTodas() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pessoa obterPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }
}
