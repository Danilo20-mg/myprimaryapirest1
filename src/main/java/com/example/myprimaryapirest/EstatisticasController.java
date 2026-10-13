
package com.example.myprimaryapirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstatisticasController {

    private final EstatisticasService service;

    public EstatisticasController(EstatisticasService service) {
        this.service = service;
    }

    @GetMapping("/estatisticas")
    public Estatisticas obterEstatisticas() {
        return service.calcular();
    }
}
