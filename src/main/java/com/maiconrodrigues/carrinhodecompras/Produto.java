/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maiconrodrigues.carrinhodecompras;

/**
 *
 * @author Lucas
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantiade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantiade) {
        this.nome = nome;
        this.preco = preco;
        this.quantiade = quantiade;
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

    public int getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(int quantiade) {
        this.quantiade = quantiade;
    }
    
    
    
    
}
