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
    ArrayList<Subasta> subastas;
    
    //tipo 0 -> observador
    //tipo 1 -> comprador
    //tipo 2-> vendedor

    public Usuario(String nombreusuario, String contrasena)
    {
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
    }
}
