/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maiconrodrigues.carrinhodecompras;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Carrinho {
    private String nome;
   
    private String quantiade;
     private String preco;
    
    private ArrayList<Produto>ListaDeCompras;

    public Carrinho() {
    }

    public Carrinho(String nome, String quantiade, String preco) {
        this.nome = nome;
        this.quantiade = quantiade;
        this.preco = preco;
    }

    public Carrinho(String nome, String quantiade, String preco, ArrayList<Produto> ListaDeCompras) {
        this.nome = nome;
        this.quantiade = quantiade;
        this.preco = preco;
        this.ListaDeCompras = ListaDeCompras;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quantiade
     */
    public String getQuantiade() {
        return quantiade;
    }

    /**
     * @param quantiade the quantiade to set
     */
    public void setQuantiade(String quantiade) {
        this.quantiade = quantiade;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return the ListaDeCompras
     */
    public ArrayList<Produto> getListaDeCompras() {
        return ListaDeCompras;
    }

    /**
     * @param ListaDeCompras the ListaDeCompras to set
     */
    public void setListaDeCompras(ArrayList<Produto> ListaDeCompras) {
        this.ListaDeCompras = ListaDeCompras;
    }
    
    
    

    /**
     *
     * @param nome
     * @param quantiade
     * @param preco
     * @param ListaDeCompras
     */
    
   
   
           

    
    
}
