package com.itb.inf2am.divulgai.model.entity;

public class Servico {
    private Long id;
    private String nome;
    private String descricao;
    private String statusServico;
    private String foto;

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

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
