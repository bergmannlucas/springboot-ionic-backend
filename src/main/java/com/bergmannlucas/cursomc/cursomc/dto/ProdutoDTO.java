package com.bergmannlucas.cursomc.cursomc.dto;

import com.bergmannlucas.cursomc.cursomc.domain.Produto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {

    private static final long serialVersionUID = 8456262643338925612L;

    private Integer id;
    private String nome;
    private Double preco;

    public ProdutoDTO() {

    }

    public ProdutoDTO(Produto obj) {
        id = obj.getId();
        nome = obj.getNome();
        preco = obj.getPreco();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
