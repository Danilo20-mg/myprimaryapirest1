package com.example.myprimaryapirest;

import org.springframework.stereotype.Repository;

import java.util.List;

public record Vaga(
        String id,
        String titulo,
        String area,
        String senioridade,
        boolean aceitaIniciante
) {}