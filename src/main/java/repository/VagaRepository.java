package repository;

import modals.Vaga;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VagaRepository {

    public List<Vaga> todas() {
        return List.of(
                new Vaga("1", "Dev Backend Java", "Engenharia de Software", "Júnior", true),
                new Vaga("2", "Dev Frontend React", "Engenharia de Software", "Pleno", false),
                new Vaga("3", "Arquiteto de Software", "Engenharia de Software", "Sênior", false),

                new Vaga("4", "Analista de Dados", "Dados", "Júnior", true),
                new Vaga("5", "Engenheiro de Dados", "Dados", "Pleno", false),
                new Vaga("6", "Cientista de Dados", "Dados", "Sênior", false),

                new Vaga("7", "UX Designer", "Design", "Júnior", true),
                new Vaga("8", "UI Designer", "Design", "Pleno", false),
                new Vaga("9", "Product Designer", "Design", "Sênior", false),

                new Vaga("10", "Associate Product Manager", "Produto", "Júnior", true),
                new Vaga("11", "Product Owner", "Produto", "Pleno", false),
                new Vaga("12", "Product Manager", "Produto", "Sênior", false)
        );
    }
}
