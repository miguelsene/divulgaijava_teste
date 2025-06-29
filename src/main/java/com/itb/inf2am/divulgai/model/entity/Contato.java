package com.itb.inf2am.divulgai.model.entity;

public class Contato {
    private Long id;
    private String tipoContato;
    private String link;
    private String statusContato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatusContato() {
        return statusContato;
    }

    public void setStatusContato(String statusContato) {
        this.statusContato = statusContato;
    }
}
