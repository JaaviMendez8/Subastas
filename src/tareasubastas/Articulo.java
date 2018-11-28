/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

import java.util.Date;

/**
 *
 * @author jaavi
 */
public class Articulo 
{
    String descripcion;
    int valor;
    String fechainicio;
    
    public Articulo(String descripcion, int valor, String fecha)
    {
        this.descripcion = descripcion;
        this.valor = valor;
        this.fechainicio = fecha;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public int getValor() 
    {
        return valor;
    }

    public void setValor(int valor) 
    {
        this.valor = valor;
    }

    public String getFechainicio() 
    {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) 
    {
        this.fechainicio = fechainicio;
    }   
}
