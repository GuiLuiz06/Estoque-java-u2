package com.estoque.estoquejavau2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// Entidade de cadastro (tabela "produtos").
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "preco", nullable = false)
    private double preco;

    @Column(name = "estoque", nullable = false)
    private int estoque;

    @Column(name = "estoque_minimo", nullable = false)
    private int estoqueMinimo;

    // vira a coluna categoria_id
    @ManyToOne(optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, double preco, int estoqueMinimo, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.estoqueMinimo = estoqueMinimo;
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    // Regra: não dá para retirar mais do que existe em estoque.
    public void removerEstoque(int quantidade) {
        if (quantidade > estoque) {
            throw new IllegalStateException("Estoque insuficiente. Saldo atual: " + estoque + ".");
        }
        estoque -= quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
