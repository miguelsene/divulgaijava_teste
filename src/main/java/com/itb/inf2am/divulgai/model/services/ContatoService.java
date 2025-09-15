package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Contato;
import com.itb.inf2am.divulgai.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired       // Injeção de dependência
    private ContatoRepository ContatoRepository;

    // Método responsável em listar todos os Contatos cadastrados no banco de dados

    public List<Contato> findAll() {
        return ContatoRepository.findAll();

    }

    // Método responsável em Criar o Contato no banco de dados

    public Contato save(Contato Contato) {
        Contato.setStatusContato(true);
        return ContatoRepository.save(Contato);
    }
}
