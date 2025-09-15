package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Servico;
import com.itb.inf2am.divulgai.model.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired       // Injeção de dependência
    private ServicoRepository ServicoRepository;

    // Método responsável em listar todos os Servicos cadastrados no banco de dados

    public List<Servico> findAll() {
        return ServicoRepository.findAll();

    }

    // Método responsável em Criar o Servico no banco de dados

    public Servico save(Servico Servico) {
        Servico.setStatusServico(true);
        return ServicoRepository.save(Servico);
    }
}
