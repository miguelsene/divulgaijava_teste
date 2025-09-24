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
            ca1.setNome("Confeitaria");
            ca1.setStatusCategoria(true);

            Categoria ca2 = new Categoria();
            ca2.setId(2L);
            ca2.setNome("Marmitaria");
            ca2.setStatusCategoria(true);

            Categoria ca3 = new Categoria();
            ca3.setId(3L);
            ca3.setNome("Buffet");
            ca3.setStatusCategoria(true);

            Categoria ca4 = new Categoria();
            ca4.setId(1L);
            ca4.setNome("Salgados");
            ca4.setStatusCategoria(true);

            // Adicionando o produto
            Categorias.add(ca1);
            Categorias.add(ca2);
            Categorias.add(ca3);
            Categorias.add(ca4);


            return Categorias;
        }
    }




