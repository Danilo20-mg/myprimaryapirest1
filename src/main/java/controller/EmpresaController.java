
package controller;

import modals.Empresa;
import service.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Empresa> obterTodas() {
        return service.listar();
    }

    @GetMapping("/{slug}")
    public Empresa obterPorSlug(@PathVariable String slug) {
        return service.buscarPorSlug(slug);
    }
}
