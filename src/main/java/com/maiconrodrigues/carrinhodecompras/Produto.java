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
    private String preco;
    private String quantiade;

    public Produto() {
    }

    public Produto(String nome, String preco, String quantiade) {
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(String quantiade) {
        this.quantiade = quantiade;
    }
    
    
    
    
}
