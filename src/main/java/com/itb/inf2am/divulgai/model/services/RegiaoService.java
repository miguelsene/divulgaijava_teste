package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Regiao;
import com.itb.inf2am.divulgai.model.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegiaoService {

    @Autowired       // Injeção de dependência
    private RegiaoRepository RegiaoRepository;

    // Método responsável em listar todos os Regiaos cadastrados no banco de dados

    public List<Regiao> findAll() {
        return RegiaoRepository.findAll();

    }

    // Método responsável em Criar o Regiao no banco de dados

    public Regiao save(Regiao Regiao) {
        Regiao.setStatusRegiao(true);
        return RegiaoRepository.save(Regiao);
    }
}
