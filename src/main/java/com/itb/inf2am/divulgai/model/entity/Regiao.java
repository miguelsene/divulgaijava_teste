package com.itb.inf2am.divulgai.model.entity;

public class Regiao {
    private Long id;
    private String cidade;
    private String uf;
    private String zona;
    private String descricao;
    private String statusRegiao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusRegiao() {
        return statusRegiao;
    }

    public void setStatusRegiao(String statusRegiao) {
        this.statusRegiao = statusRegiao;
    }
}
