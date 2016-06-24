/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosPersona;
import vista.FRM_VentanaPrincipal;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener {
    
    FRM_VentanaPrincipal ventana;
    MetodosPersona metodos;
    public Controlador_FRM_VentanaPrincipal(FRM_VentanaPrincipal ventana)
    {
        this.ventana=ventana;
        metodos = new MetodosPersona();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            
            if(ventana.agregarPersona()[3].equalsIgnoreCase("Normal"))
            {
                metodos.insertarPersona(ventana.agregarPersona());
                ventana.mostrar(metodos.mostrarInformacion());
                
            }
            else
            {
                metodos.insertarPersona7600(ventana.agregarPersona());
                ventana.mostrar(metodos.mostrarInformacion());
            }      


            //System.out.println("Escucho!");
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            
        
        }
        if(e.getActionCommand().equalsIgnoreCase(""))
        {
        
        }
        if(e.getActionCommand().equalsIgnoreCase(""))
        {
        
        }
    }
    
}
