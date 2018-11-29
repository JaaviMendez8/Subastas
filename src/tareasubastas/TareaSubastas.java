/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasubastas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
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
        int opcion=1;
        
        
        Sistema sistema = new Sistema();

        while (opcion!=0)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("------");
            System.out.println("-MENÚ-");
            System.out.println("1) Registrarse en el sistema");
            System.out.println("2) Acceder al sistema");
            System.out.println("3) Observar Subastas");
            System.out.println("0) Salir");
            System.out.println("------");
            System.out.println("Ingresar opción: ");
            s = new Scanner(System.in);
            opcion = s.nextInt();

            while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=0)
            {
                System.out.println("Opción no válida. Vuelva a ingresar una opción: ");
                s = new Scanner(System.in);
                opcion = s.nextInt();
            }
            
            if(opcion==1)
            {
                System.out.println("Ingrese su nombre de usuario: ");
                s = new Scanner(System.in);
                String nombre = s.nextLine();
                
                System.out.println("Ingrese su contraseña: ");
                s = new Scanner(System.in);
                String contrasena = s.nextLine();
                
                System.out.println("Escoja un tipo de usuario: ");
                System.out.println("0) Vendedor");
                System.out.println("1) Comprador");
                s = new Scanner(System.in);
                int tipo = s.nextInt();
                
                Usuario u = new Usuario(nombre, contrasena, tipo);
                sistema.crearUsuario(u);
            }
            
            if(opcion==2)
            {
                System.out.println("Ingrese su nombre de usuario: ");
                s = new Scanner(System.in);
                String nombre = s.nextLine();
                
                System.out.println("Ingrese su contraseña: ");
                s = new Scanner(System.in);
                String contrasena = s.nextLine();
                
                int tipo = sistema.buscarUsuario(nombre, contrasena);
                System.out.println("tipo: "+tipo);
                //si retorna 0 es vendedor, 1 comprador, 2 no existe
                if(tipo==0)
                {
                    int op=1;
                    //mostrar menu de vendedor con while hasta que quiera salir!
                    //vendedor puede modificar artículos
                    while(op!=0)
                    {
                        System.out.println("1) Crear Subasta ");
                        System.out.println("2) Editar Subasta");
                        System.out.println("3) Mostrar Subastas");
                        //para editar la subasta pedirà codigo
                        System.out.println("0) Salir");

                        System.out.println("Ingrese opción: ");
                        s = new Scanner(System.in);
                        op = s.nextInt();  
                        
                        if(op==1)
                        {
                            Random r = new Random();
                            int codigo = r.nextInt(99999999);
                            
                            System.out.println("Ingrese descripción del producto: ");
                            s = new Scanner(System.in);
                            String descripcion = s.nextLine();  
                            
                            System.out.println("Valor del artículo: ");
                            s = new Scanner(System.in);
                            int valor = s.nextInt();  
                            
                            String fecha = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                            
                            Articulo a = new Articulo(descripcion, valor, fecha);
                            
                            Subasta subasta = new Subasta(codigo, a);
                            sistema.agregarSubasta(nombre, contrasena, subasta);
                        }
                        else if(op==2)
                        {
                            
                        }
                        
                        else if(op==3)
                        {
                            sistema.listarSubastasUsuario(nombre);
                        }
                    } 
                }
                else if(tipo==1)
                {
                    //mostrar menu de comprador con while hasta que quiera salir!
                    //comprador puede pujar!!
                }
                else if(tipo!=0 && tipo!=1)
                {
                    System.out.println("Usuario o contrasena incorrectos.");
                }
            }
            
            if(opcion==3)
            {
                System.out.println("1) Mostrar Subastas ");
                System.out.println("2) Volver al inicio");
                System.out.println("0) Salir");
                
                System.out.println("Ingrese Opción: ");
                s = new Scanner(System.in);
                int op = s.nextInt();
                
                if(op==1)
                {
                    sistema.imprimirSubastas();
                }
            }
        }

    }
    
}
