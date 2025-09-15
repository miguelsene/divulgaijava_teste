package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Prestador;
import com.itb.inf2am.divulgai.model.repository.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestadorService {

    @Autowired       // Injeção de dependência
    private PrestadorRepository PrestadorRepository;

    // Método responsável em listar todos os Prestadors cadastrados no banco de dados

    public List<Prestador> findAll() {
        return PrestadorRepository.findAll();

    }

    // Método responsável em Criar o Prestador no banco de dados

    public Prestador save(Prestador Prestador) {
        Prestador.setStatusPrestador(true);
        return PrestadorRepository.save(Prestador);
    }
}
