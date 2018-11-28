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
    String codigosubasta;
    Articulo articulo;
    //existirá un valor por artículo y por el total
    //total = suma de todos los valores de c/u de los artículos
    
    public Subasta(String codigo, Articulo articulo)
    {
        this.codigosubasta = codigo;
        this.articulo = articulo;
    }

    public String getCodigosubasta() 
    {
        return codigosubasta;
    }

    public void setCodigosubasta(String codigosubasta) 
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
