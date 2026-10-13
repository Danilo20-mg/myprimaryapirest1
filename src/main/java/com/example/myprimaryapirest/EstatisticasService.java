
package com.example.myprimaryapirest;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class EstatisticasService {

    private final VagaRepository repository;

    public EstatisticasService(VagaRepository repository) {
        this.repository = repository;
    }

    public Estatisticas calcular() {
        List<Vaga> vagas = repository.todas();

        long totalDeVagas = vagas.size();

        long aceitamIniciante = vagas.stream()
                .filter(Vaga::aceitaIniciante)
                .count();

        Map<String, Long> porArea = vagas.stream()
                .collect(Collectors.groupingBy(
                        Vaga::area,
                        Collectors.counting()
                ));

        Map<String, Long> porSenioridade = vagas.stream()
                .collect(Collectors.groupingBy(
                        Vaga::senioridade,
                        Collectors.counting()
                ));

        return new Estatisticas(
                totalDeVagas,
                aceitamIniciante,
                porArea,
                porSenioridade
        );
    }
}
