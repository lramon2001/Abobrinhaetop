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
    
    ArrayList<Produto>ListaDeCompras;

    public Carrinho(ArrayList<Produto> ListaDeCompras) {
        ListaDeCompras = new ArrayList();
    }

    public Carrinho() {
    }

    public ArrayList<Produto> getListaDeCompras() {
        return ListaDeCompras;
    }

    public void setListaDeCompras(ArrayList<Produto> ListaDeCompras) {
        this.ListaDeCompras = ListaDeCompras;
    }
   
           

    
    
}
