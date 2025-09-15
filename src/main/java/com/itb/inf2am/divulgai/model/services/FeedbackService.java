package com.itb.inf2am.divulgai.model.services;


import com.itb.inf2am.divulgai.model.entity.Feedback;
import com.itb.inf2am.divulgai.model.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired       // Injeção de dependência
    private FeedbackRepository FeedbackRepository;

    // Método responsável em listar todos os Feedbacks cadastrados no banco de dados

    public List<Feedback> findAll() {
        return FeedbackRepository.findAll();

    }

    // Método responsável em Criar o Feedback no banco de dados

    public Feedback save(Feedback Feedback) {
        Feedback.setStatusFeedback(true);
        return FeedbackRepository.save(Feedback);
    }
}
