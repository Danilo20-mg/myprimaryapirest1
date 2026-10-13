package controller;

import modals.Vaga;
import service.VagaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private final VagaService service;

    public VagaController(VagaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vaga> obterTodas() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public List<Vaga> obterPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }
}