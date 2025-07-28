
package com.itb.inf2am.divulgai.controller;

import com.itb.inf2am.divulgai.model.entity.Feedback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Getter (get): Apenas lê o valor do atributo.
// Setter (set): Apenas modifica o valor do atributo.

@RestController
@RequestMapping("/api/v1/Feedback")

public class FeedbackController {
    List<Feedback> Feedbacks = new ArrayList<>();
    @GetMapping
    public List<Feedback> findAll() {
        Feedback f1 = new Feedback();
        f1.setId(1L);
        f1.setDescricao("O serviço Sicrana Estética é muito bom e acolhedor, parabéns.");
        f1.setDataCadastro(LocalDateTime.now());
        f1.setStatusFeedback("ATIVO");



        // Adicionando o produto
        Feedbacks.add(f1);

        return Feedbacks;
    }
}


