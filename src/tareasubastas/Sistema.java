/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

import java.util.ArrayList;
import java.util.Iterator;

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
    
    public int buscarUsuario(String nombre, String contrasena)
    {
        int tipo = 2;
        for (Iterator<Usuario> it = usuarios.iterator(); it.hasNext();)
        {
            Usuario u = it.next();
            if(u.getNombreusuario().equals(nombre) && u.getContrasena().equals(contrasena))
            {
                if(u.getTipo()==0)
                {
                    tipo=0;
                }
                else if(u.getTipo()==1)
                {
                    tipo=1;
                }
            }
        }
        return tipo;
    }
    
    public void agregarSubasta(String nombre, String contrasena, Subasta s)
    {
        int tipo = 2;
        for (Iterator<Usuario> it = usuarios.iterator(); it.hasNext();)
        {
            Usuario u = it.next();
            if(u.getNombreusuario().equals(nombre) && u.getContrasena().equals(contrasena))
            {
                u.addSubasta(s);
            }
        }
    }
    
    public void imprimirSubastas()
    {
        for (Iterator<Subasta> it = subastas.iterator(); it.hasNext();)
        {
            Subasta s = it.next();
            System.out.println("Código: "+s.getCodigosubasta());
            System.out.println("-Articulo-");
            System.out.println("Descripción: "+s.getArticulo().descripcion);
            System.out.println("Valor: "+s.getArticulo().valor);
            System.out.println("Fecha Inicio: "+s.getArticulo().fechainicio);
        }
    }
    
    public void listarSubastasUsuario(String nombreusuario)
    {
        
        for (Iterator<Usuario> it = usuarios.iterator(); it.hasNext();)
        {
            Usuario u = it.next();
            if(u.getNombreusuario().equals(nombreusuario))
            {
                ArrayList<Subasta> subastas = u.getSubastas();
                int i=0;
                if(subastas!=null)
                {
                    for (Iterator<Subasta> it2 = subastas.iterator(); it2.hasNext();)
                    {
                        Subasta s = it2.next();
                        System.out.println(i+")"+" "+s.getCodigosubasta());
                        System.out.println("Descripción: "+s.getArticulo().getDescripcion());
                        System.out.println("Valor: "+s.getArticulo().getValor());
                        System.out.println("Fecha Inicio: "+s.getArticulo().getFechainicio());  
                        i+=1;
                    }
                }
            }
        }
    }
}
