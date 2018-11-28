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
public class Sistema 
{
    ArrayList<Usuario> usuarios; //comprobar si existe el usuario
    ArrayList<Subasta> subastas; 
    
    public Sistema()
    {
        this.usuarios = new ArrayList<Usuario>();
        this.subastas = new ArrayList<Subasta>();
    }
    
    public void crearUsuario(Usuario u)
    {
        this.usuarios.add(u);
    }
    
}
