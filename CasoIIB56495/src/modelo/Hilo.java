/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.FRM_Juego;

/**
 *
 * @author Usuario
 */
public class Hilo extends Thread {
    
    FRM_Juego ventana;
    public Hilo(FRM_Juego ventana)
    {
        this.ventana=ventana;
    }
   
    public void run()
    {
        while(true)
        {
            try
            {
                sleep(100);
                ventana.moverFondo();
               ventana.moverObstaculo1();
//               ventana.moverObstaculo2();
//               ventana.moverObstaculo3();
//               ventana.moverObstaculo4();
               ventana.comprobarColision1();
//               ventana.comprobarColision2();
//               ventana.comprobarColision3();
//               ventana.comprobarColision4();
//                ventana.cambiarIcono();
                comprobarPersonaje();
                ventana.ganaste();
                ventana.limite();
                ventana.tiempo();
                
            }
            catch(Exception e)
            {
                System.out.println("Hubo un error en el hilo de ejecución"+e);
            }
        }
    }
    
    public void comprobarPersonaje()
    {
        if(ventana.estado.equals("Subiendo"))
        {
            ventana.subiendoPersonaje();
        }
        
        if(ventana.estado.equals("Bajando"))
        {
            ventana.bajandoPersonaje();
        }
       
       
       
    }
    
}
