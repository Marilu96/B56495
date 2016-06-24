/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class MetodosBanco {
    Cliente primero=null;
    public MetodosBanco()
    {
    
    }
    
    public void agregarCliente(String arreglo[])
    {
         Cliente auxiliar = primero;
         if(auxiliar.getPrioridad().equalsIgnoreCase("Normal"))
        {
             if(primero==null)
         {
             primero = new Cliente(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], null);
             
         }
         
         else
         {
          devolverUltimoCliente().setSiguiente(new Cliente(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], null));
         }
        }
         if(auxiliar.getPrioridad().equalsIgnoreCase("7600"))
         {
             if(primero==null)
             {
                 primero = new Cliente(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], null);
             }
             
             else
             {
                 Cliente prioridad = new Cliente(arreglo[0], Integer.parseInt(arreglo[1]), arreglo[2], arreglo[3], primero);
                 primero = prioridad;
             }
         }
        
    }
    
  
    public Cliente devolverUltimoCliente()
    {
        Cliente auxiliar = primero;
        while(auxiliar.getSiguiente()!=null)
        {
            auxiliar = auxiliar.getSiguiente();
        }
        return auxiliar;
    }
    
    public String devolverLista()
    {
        Cliente auxiliar = primero;
        String valores ="";
        
        while(auxiliar.getSiguiente()!=null)
        {
            valores+="Valor del Nodo: "+auxiliar.getNombre()+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
         valores+="Valor del Nodo: "+auxiliar.getNombre();
        return valores;
    }
    
}
