package com.estoque.estoquejavau2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

// Entidade de fluxo: uma entrada ou saída de estoque (tabela "movimentacoes").
@Entity
@Table(name = "movimentacoes")
public class Movimentacao {

    public enum Tipo {
        ENTRADA,
        SAIDA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private Tipo tipo;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime data;

    public Movimentacao() {
    }

    public Movimentacao(Produto produto, Tipo tipo, int quantidade) {
        this.produto = produto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }
}
