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
    Date fechainicio;
    
    public Articulo(String descripcion, int valor, Date fecha)
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

    public Date getFechainicio() 
    {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) 
    {
        this.fechainicio = fechainicio;
    }   
}
