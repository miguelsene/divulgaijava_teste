package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Categoria;
import com.itb.inf2am.divulgai.model.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired       // Injeção de dependência
    private CategoriaRepository CategoriaRepository;

    // Método responsável em listar todos os Categorias cadastrados no banco de dados
    //READ DO CRUD
    public List<Categoria> findAll() {
        return CategoriaRepository.findAll();
    }

    // Método responsável em Criar o Categoria no banco de dados
    //CREATE DO CRUD
    public Categoria save(Categoria Categoria) {
        Categoria.setStatusCategoria(true);
        return CategoriaRepository.save(Categoria);


    }
}
