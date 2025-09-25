    package com.itb.inf2am.divulgai.controller;

    import com.itb.inf2am.divulgai.model.entity.Categoria;
    import com.itb.inf2am.divulgai.model.services.CategoriaService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;


    import java.util.ArrayList;
    import java.util.List;

    // Getter (get): Apenas lê o valor do atributo.
    // Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/categoria")
    public class CategoriaController {

        @Autowired
        private CategoriaService categoriaService; // Service, não repository

        @GetMapping
        public List<Categoria> findAll() {
            return categoriaService.findAll(); // chama o service
        }

        @PostMapping
        public Categoria create(@RequestBody Categoria categoria) {
            return categoriaService.save(categoria); // chama o service
        }
    }

