/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

import java.util.ArrayList;

/**
 *
 * @author jaavi
 */
public class Subasta
{
    int codigosubasta;
    Articulo articulo;
    ArrayList<Puja> pujas;
    //existirá un  valor por artículo y por el total
    //total = suma de todos los valores de c/u de los artículos
    
    public Subasta(int codigo, Articulo articulo)
    {
        this.codigosubasta = codigo;
        this.articulo = articulo;
        this.pujas = new ArrayList<Puja>();
    }

    public int getCodigosubasta() 
    {
        return codigosubasta;
    }

    public void setCodigosubasta(int codigosubasta) 
    {
        this.codigosubasta = codigosubasta;
    }

    public Articulo getArticulo()
    {
        return articulo;
    }

    public void setArticulo(Articulo articulo) 
    {
        this.articulo = articulo;
    }


}
