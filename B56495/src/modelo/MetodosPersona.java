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
public class MetodosPersona {
    
    Persona primero=null;
    
    public MetodosPersona()
    {
    
    }
    
    public void insertarPersona(String informacion[])
    {
        Persona aux = primero;
        if(primero==null)
        {
            primero = new Persona(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], null);
        }
        else
        {   
            getUltimaPersona().setSiguiente(new Persona(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4],null));
        }
        
    }
    
    public void insertarPersona7600(String informacion[])
    {
        Persona aux=null;
        if(primero==null)
        {
            primero = new Persona(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], null);
        }
        else
        {
            aux = new Persona(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], primero);
            primero=aux;
        }
        
    }
    
     public Persona getUltimaPersona()
    {
        Persona aux = primero;
        while(aux.getSiguiente()!=null)
        {
            aux = aux.getSiguiente();            
        }
        return aux;
    }
     
      public String mostrarInformacion()
    {
        String texto="";
        Persona aux=primero;
        
        while(aux!=null)
        {
            texto+=aux.getInformacion()+"\n";
            aux=aux.getSiguiente();
        }
        return texto;
    }
    
}
