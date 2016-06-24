/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Metodos_Nodos;
import modelo.Nodos;
import vista.FRM_Nodos;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_Nodos implements ActionListener {
    
    FRM_Nodos ventana;
    Metodos_Nodos metodos;
    Nodos nodos;
    
    public Controlador_FRM_Nodos(FRM_Nodos ventana)
    {
        this.ventana=ventana;
        metodos = new  Metodos_Nodos();
        nodos =  new Nodos();
    }
    
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equalsIgnoreCase("Crear"))
        {
            metodos.crear(ventana.getCantidad());
            ventana.mostrar(metodos.devolverLista());
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodos.agregarAlFinal(ventana.getDatoAgregarAlFinal());
            ventana.mostrar(metodos.devolverLista());
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodos.modificarInformacion(ventana.getInformacionModificar()[0], ventana.getInformacionModificar()[1]);
            ventana.mostrar(metodos.devolverLista());
        }
        
        if(evento.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodos.eliminar(ventana.getDatoEliminar());
            ventana.mostrar(metodos.devolverLista());
        }
    }
    
}
