
package modals;

import java.util.Map;

public record Estatisticas(
        long totalDeVagas,
        long aceitamIniciante,
        Map<String, Long> porArea,
        Map<String, Long> porSenioridade
) {
}
