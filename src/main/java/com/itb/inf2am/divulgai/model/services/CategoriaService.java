package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Categoria;
import com.itb.inf2am.divulgai.model.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired       // Injeção de dependência
    private CategoriaRepository categoriaRepository;

    // Método responsável em listar todos os Categorias cadastrados no banco de dados
    //READ DO CRUD
    public List<Categoria> findAll() {

        return categoriaRepository.findAll();
    }

    // Método responsável em Criar o Categoria no banco de dados
    //CREATE DO CRUD
    public Categoria save(Categoria Categoria) {
        Categoria.setStatusCategoria(true);
        return categoriaRepository.save(Categoria);
    }

        // Método responsável em listar o produto por ID
        public Categoria findById (Long id) {
            return categoriaRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado com o id " + id));
        }

        // Método responsável em atualizar em atualizar o produto
        public Categoria update(Long id, Categoria categoria) {
            Categoria categoriaExistente = findById(id);
            categoriaExistente.setNome(categoria.getNome());
            categoriaExistente.setStatusCategoria(categoria.isStatusCategoria());

            return categoriaRepository.save(categoriaExistente);
        }

        // Método responsável em excluir o produto ( exclusão física )
        public void delete(Long id) {


            Categoria categoriaExistente = findById(id);
            categoriaRepository.delete(categoriaExistente);
    }
}
