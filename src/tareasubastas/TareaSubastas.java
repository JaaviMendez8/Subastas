/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

import java.util.Scanner;

/**
 *
 * @author jaavi
 */
public class TareaSubastas 
{

    public static void main(String[] args) 
    {
        //MENÚ para observador, comprador y vendedor.
        //Observador, método para mostrar listado de subastas -> mensaje de que no existen subastas
        //Comprador, opción de pujar a través del código de la subasta
        //AGREGAR MÉTODO PARA AÑADIR DINERO A LA CARTERA 
        //Vendedor, método para agregar subasta. (primero ingresar la cantidad de artículos para que hacer el while i<cantarticulos -> solicitar información artículo)
        int opcion;
        Scanner s = new Scanner(System.in);
        System.out.println("------");
        System.out.println("-MENÚ-");
        System.out.println("1) Registrarse en el sistema");
        System.out.println("2) Acceder al sistema como vendedor");
        System.out.println("3) Acceder al sistema como comprador");
        System.out.println("4) Observar Subastas");
        System.out.println("0) Salir");
        System.out.println("------");
        System.out.println("Ingresar opción: ");
        s = new Scanner(System.in);
        opcion = s.nextInt();
        
        while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=0)
        {
            System.out.println("Opción no válida. Vuelva a ingresar una opción: ");
            s = new Scanner(System.in);
            opcion = s.nextInt();
        }
        
        Sistema sistema = new Sistema();

        while (opcion!=0)
        {
            if(opcion==1)
            {
                System.out.println("Ingrese su nombre de usuario: ");
                s = new Scanner(System.in);
                String nombre = s.nextLine();
                
                System.out.println("Ingrese su contraseña: ");
                s = new Scanner(System.in);
                String contrasena = s.nextLine();
                
                Usuario u = new Usuario(nombre, contrasena);
                sistema.crearUsuario(u);
            }
            
            if(opcion==2)
            {
                
            }
            
            if(opcion==3)
            {
                
            }
            
            if(opcion==4)
            {
                
            }
        }

    }
    
}
