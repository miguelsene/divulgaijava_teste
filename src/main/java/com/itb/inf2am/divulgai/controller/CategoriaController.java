    package com.itb.inf2am.divulgai.controller;

    import com.itb.inf2am.divulgai.model.entity.Categoria;
    import com.itb.inf2am.divulgai.model.services.CategoriaService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;


    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;

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


        @GetMapping("/{id}")
        public ResponseEntity<Object> listarCategoriaPorId(@PathVariable String id) {
            try {
                return ResponseEntity.ok(categoriaService.findById(Long.parseLong(id)));
            } catch (NumberFormatException e) {
                return ResponseEntity.badRequest().body(
                        Map.of(
                                "status", 400,
                                "error", "Bad Request",
                                "message", "O id informado não é válido: " + id
                        )
                );


            } catch (RuntimeException e) {
                return ResponseEntity.status(404).body(
                        Map.of(
                                "status", 404,
                                "error", "Not Found",
                                "message", "Categoria não encontrada com o id " + id
                        )

                );

            }


        }

        @PutMapping("/{id}")
        public ResponseEntity<Object> atualizarCategoria(@PathVariable String id, @RequestBody Categoria categoria) {
            try {
                Long categoriaId = Long.parseLong(id);
                Categoria categoriaExistente = categoriaService.findById(categoriaId); // já lança exceção se não achar

                categoriaExistente.setNome(categoria.getNome());

                Categoria categoriaAtualizada = categoriaService.save(categoriaExistente);

                return ResponseEntity.ok(categoriaAtualizada);
            } catch (NumberFormatException e) {
                return ResponseEntity.badRequest().body(
                        Map.of(
                                "status", 400,
                                "error", "Bad Request",
                                "message", "O id informado não é válido: " + id
                        )
                );
            } catch (RuntimeException e) {
                return ResponseEntity.status(404).body(
                        Map.of(
                                "status", 404,
                                "error", "Not Found",
                                "message", "Categoria não encontrada com o id " + id
                        )
                );
            }
        }


        @DeleteMapping("/{id}")
        public ResponseEntity<Object> excluirCategoria(@PathVariable String id) {
            try {
                Long categoriaId = Long.parseLong(id);
                categoriaService.delete(categoriaId); // chama o service
                return ResponseEntity.ok(Map.of("message", "Categoria deletada com sucesso"));
            } catch (NumberFormatException e) {
                return ResponseEntity.badRequest().body(
                        Map.of(
                                "status", 400,
                                "error", "Bad Request",
                                "message", "O id informado não é válido: " + id
                        )
                );
            } catch (RuntimeException e) {
                return ResponseEntity.status(404).body(
                        Map.of(
                                "status", 404,
                                "error", "Not Found",
                                "message", "Categoria não encontrada com o id " + id
                        )
                );
            }
        }
    }


