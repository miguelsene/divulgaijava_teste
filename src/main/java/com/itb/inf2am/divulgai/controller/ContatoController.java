
    package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/contato")

    public class ContatoController {
        List<Contato> Contatos = new ArrayList<>();
        @GetMapping
        public List<Contato> findAll() {
            Contato c1 = new Contato();
            c1.setId(1L);
            c1.setTipoContato("Instagram");
            c1.setLink("https://instagram.com/sicranaestetica");
            c1.setStatusContato(true);



            // Adicionando o produto
            Contatos.add(c1);

            return Contatos;
        }
    }


