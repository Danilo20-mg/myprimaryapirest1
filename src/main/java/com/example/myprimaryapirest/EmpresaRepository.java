
package com.example.myprimaryapirest;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmpresaRepository {

    public List<Empresa> todas() {
        return List.of(
                new Empresa(
                        "1",
                        "Aurora Tech",
                        "aurora-tech",
                        "https://aurora-tech.example",
                        "Empresa de desenvolvimento de software."
                ),
                new Empresa(
                        "2",
                        "ByteWorks",
                        "byteworks",
                        "https://byteworks.example",
                        "Empresa especializada em desenvolvimento web."
                ),
                new Empresa(
                        "3",
                        "Nuvem Digital",
                        "nuvem-digital",
                        "https://nuvem-digital.example",
                        "Empresa de soluções em computação em nuvem."
                ),
                new Empresa(
                        "4",
                        "DataVision",
                        "datavision",
                        "https://datavision.example",
                        "Empresa especializada em análise de dados."
                ),
                new Empresa(
                        "5",
                        "Pixel Studio",
                        "pixel-studio",
                        "https://pixel-studio.example",
                        "Empresa de design e experiências digitais."
                )
        );
    }
}
