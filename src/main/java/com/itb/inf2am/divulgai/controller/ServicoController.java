
    package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Servico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

    @RestController
    @RequestMapping("/api/v1/servico")

    public class ServicoController {
        List<Servico> Servicos = new ArrayList<>();
        @GetMapping
        public List<Servico> findAll() {
            Servico s1 = new Servico();
            s1.setId(1L);
            s1.setNome("Confeitaria");
            s1.setDescricao("Produção e venda de bolos, doces e confeitos artesanais");
            s1.setStatusServico("ATIVO");
            s1.setFoto(null);

            Servico s2 = new Servico();
            s2.setId(2L);
            s2.setNome("Marmitaria");
            s2.setDescricao("Preparação e entrega de marmitas caseiras e saudáveis");
            s2.setStatusServico("INATIVO");
            s2.setFoto(null);

            Servico s3 = new Servico();
            s3.setId(3L);
            s3.setNome("Buffet");
            s3.setDescricao("Serviços de alimentação para festas e eventos");
            s3.setStatusServico("INATIVO");
            s3.setFoto(null);

            Servico s4 = new Servico();
            s4.setId(4L);
            s4.setNome("Salgados");
            s4.setDescricao("Produção de salgadinhos para festas e pronta-entrega");
            s4.setStatusServico("INATIVO");
            s4.setFoto(null);

            // Adicionando o produto
            Servicos.add(s1);
            Servicos.add(s2);
            Servicos.add(s3);
            Servicos.add(s4);



            return Servicos;
        }
    }





