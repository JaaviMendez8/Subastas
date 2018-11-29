/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

/**
 *
 * @author jaavi
 */
public class Puja 
{
    String nombrecomprador;
    int valorpuja, codigosubasta;
    
    public Puja(String nombre, int valor, int codigo)
    {
        this.nombrecomprador = nombre;
        this.valorpuja = valor;
        this.codigosubasta = codigo;
    }

    public String getNombrecomprador() 
    {
        return nombrecomprador;
    }

    public void setNombrecomprador(String nombrecomprador) 
    {
        this.nombrecomprador = nombrecomprador;
    }

    public int getValorpuja()
    {
        return valorpuja;
    }

    public void setValorpuja(int valorpuja) 
    {
        this.valorpuja = valorpuja;
    }

    public int getCodigosubasta()
    {
        return codigosubasta;
    }

    public void setCodigosubasta(int codigosubasta)
    {
        this.codigosubasta = codigosubasta;
    }
    
    
}
