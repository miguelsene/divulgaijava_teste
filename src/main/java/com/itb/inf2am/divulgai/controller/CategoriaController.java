package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/categoria")

    public class CategoriaController {
        List<Categoria> Categorias = new ArrayList<>();
        @GetMapping
        public List<Categoria> findAll() {
            Categoria ca1 = new Categoria();
            ca1.setId(1L);
            ca1.setNome("Alimentação");
            ca1.setDescricao("Serviços relacionados à produção, preparo e venda de alimentos, como marmitas, doces, bolos e catering.");
            ca1.setStatusCategoria("ATIVO");



            // Adicionando o produto
            Categorias.add(ca1);

            return Categorias;
        }
    }




