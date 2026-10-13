
package com.example.myprimaryapirest;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PessoaRepository {

    public List<Pessoa> todas() {
        return List.of(
                new Pessoa("1", "Ana Silva", "ana@example.com", "Backend Java", "Júnior"),
                new Pessoa("2", "Bruno Costa", "bruno@example.com", "Frontend React", "Pleno"),
                new Pessoa("3", "Carla Souza", "carla@example.com", "Dados", "Júnior"),
                new Pessoa("4", "Daniel Lima", "daniel@example.com", "Design UX/UI", "Pleno"),
                new Pessoa("5", "Eduarda Alves", "eduarda@example.com", "Produto", "Sênior"),
                new Pessoa("6", "Felipe Rocha", "felipe@example.com", "DevOps", "Júnior")
        );
    }
}
