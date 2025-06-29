 package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Prestador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/prestador")

    public class PrestadorController {
        List<Prestador> Prestadors = new ArrayList<>();

        @GetMapping
        public List<Prestador> findAll() {
            Prestador p1 = new Prestador();
            p1.setId(1L);
            p1.setNome("Sicrana Bolos");
            p1.setDataNascimento(LocalDateTime.now());
            p1.setCpf("12345678910");
            p1.setGenero("Feminino");
            p1.setTelefone("11940028922");
            p1.setLogradouro("Rua Lorena");
            p1.setNumeroResidencial("13");
            p1.setComplemento("Casa 1");
            p1.setCep("01234567");
            p1.setBairro("Engenho Novo");
            p1.setCidade("Barueri");
            p1.setUf("SP");
            p1.setStatusPrestador("ATIVO");



            // Adicionando o produto
            Prestadors.add(p1);


            return Prestadors;
        }
    }