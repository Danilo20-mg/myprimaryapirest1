package modals;

public record Vaga(
        String id,
        String titulo,
        String area,
        String senioridade,
        boolean aceitaIniciante
) {}