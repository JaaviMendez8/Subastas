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
public class Usuario 
{
    String nombreusuario;
    String contrasena;
    int tipo;
    ArrayList<Subasta> subastas;
    
    //tipo 0 -> observador
    //tipo 1 -> comprador
    //tipo 2-> vendedor

    public Usuario(String nombreusuario, String contrasena, int tipo)
    {
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public String getNombreusuario() 
    {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario)
    {
        this.nombreusuario = nombreusuario;
    }

    public String getContrasena() 
    {
        return contrasena;
    }

    public void setContrasena(String contrasena) 
    {
        this.contrasena = contrasena;
    } 

    public int getTipo() 
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }
    
    
    
}
