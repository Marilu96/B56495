/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.MetodosBanco;
import vista.FRM_Banco;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_Banco implements ActionListener{
    MetodosBanco metodos;
    FRM_Banco ventana;
    Cliente cliente;
    
    public Controlador_FRM_Banco(FRM_Banco ventana)
    {
        metodos = new MetodosBanco();
        this.ventana=ventana;
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Generar"))
        {
            metodos.agregarCliente(ventana.guardarPersona());
            ventana.mostrar(metodos.devolverLista());
            System.out.println("Escucho!");
        }
        if(e.getActionCommand().equalsIgnoreCase("Siguiente"))
        {
            
        }
        if(e.getActionCommand().equalsIgnoreCase("mayorque"))
        {
            
        }
        if(e.getActionCommand().equalsIgnoreCase("menorque"))
        {
            
        }
        
        if(e.getActionCommand().equalsIgnoreCase(""))
        {
            
        }
    }
    
}
