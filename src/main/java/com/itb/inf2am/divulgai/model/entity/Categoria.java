package com.itb.inf2am.divulgai.model.entity;

import jakarta.persistence.*;

@Entity

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (length = 100, nullable = false)
    private String nome;

    @Column (length = 200, nullable = false)
    private String descricao;

    @Column (length = 20, nullable = false)
    private String statusCategoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusCategoria() {
        return statusCategoria;
    }

    public void setStatusCategoria(boolean statusCategoria) {
        this.statusCategoria = statusCategoria;
    }
}
