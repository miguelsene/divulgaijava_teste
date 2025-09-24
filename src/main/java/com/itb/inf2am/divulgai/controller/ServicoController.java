
    package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Servico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/servico")

    public class ServicoController {
        List<Servico> Servicos = new ArrayList<>();
        @GetMapping
        public List<Servico> findAll() {
            Servico s1 = new Servico();
            s1.setId(1L);
            s1.setNome("Sicrana Bolos");
            s1.setStatusServico(true);
            s1.setFoto(null);



            // Adicionando o produto
            Servicos.add(s1);




            return Servicos;
        }
    }





