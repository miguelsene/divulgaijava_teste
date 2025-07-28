package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Regiao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/regiao")

public class RegiaoController {
    List<Regiao> regiaos = new ArrayList<>();
    @GetMapping
    public List<Regiao> findAll() {
        Regiao r1 = new Regiao();
        r1.setId(1L);
        r1.setCidade("Barueri");
        r1.setUf("SP");
        r1.setZona("ZONA LESTE");
        r1.setDescricao("Atende toda a região do Engenho Novo e proximidades");
        r1.setStatusRegiao("ATIVO");

        Regiao r2 = new Regiao();
        r2.setId(2L);
        r2.setCidade("Osasco");
        r2.setUf("SP");
        r2.setZona("ZONA LESTE");
        r2.setDescricao("Atende toda a região central de Osasco e bairros adjacentes");
        r2.setStatusRegiao("ATIVO");

        Regiao r3 = new Regiao();
        r3.setId(3L);
        r3.setCidade("Carapicuíba");
        r3.setUf("SP");
        r3.setZona("ZONA LESTE");
        r3.setDescricao("Atende bairros como Vila Dirce, Ariston e Centro");
        r3.setStatusRegiao("ATIVO");

        Regiao r4 = new Regiao();
        r4.setId(4L);
        r4.setCidade("Santana de Parnaíba");
        r4.setUf("SP");
        r4.setZona("ZONA LESTE");
        r4.setDescricao("Atende bairros históricos e condomínios residenciais");
        r4.setStatusRegiao("ATIVO");



        // Adicionando o produto
        regiaos.add(r1);
        regiaos.add(r2);
        regiaos.add(r3);
        regiaos.add(r4);


        return regiaos;
    }
}
