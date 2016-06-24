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
    int contador=0;
    int promedioEd=0;
    
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
      public int getCantidadPersonas()
    {
        Persona aux=primero;
        int contador=0;
        while(aux!=null)
        {
            contador++;
            aux=aux.getSiguiente();
        }
        return contador;
    }
      public String reportes(String arreglo[])
      {
          String informacion="Reportes!!";
          informacion+= "Cantidad de personas: "+getCantidadPersonas();
          informacion+= "\nPromedio: "+promedioEdad();
          return informacion;
      }
      
      public int promedioEdad()
      {
          int promedio=0;
          int suma =0;
          Persona aux = primero;
           while(aux!=null)
          {
             suma+=Integer.parseInt(aux.getEdad());
             aux=aux.getSiguiente();
          }
           return promedio = suma/getCantidadPersonas();
      }
      public String[] buscarPersona(String cedula)
      {
          String informacion[]= new String[5];
          Persona auxiliar = primero;
          while(auxiliar!=null)
          {
              informacion[0]= auxiliar.getCedula();
              informacion[1]= auxiliar.getNombre();
              informacion[2]= auxiliar.getEdad();
              informacion[3]= auxiliar.getPrioridad();
              informacion[4]= auxiliar.getFechaCita();
          }
          
          return informacion;
          
      }
      
      
      
       public void modificarInformacion(String arreglo[])
    {
        Persona aux = primero;
        
        while(aux!=null)
        {
            if(aux.getCedula().equals(arreglo[0]))
            {
                aux.setNombre(arreglo[1]);
                aux.setEdad(arreglo[2]);
                aux.setPrioridad(arreglo[3]);
                aux.setFechaCita(arreglo[4]);
            }
            
            aux=aux.getSiguiente();
        }
    }
      
        public void eliminar(String dato, String arreglo[])
    {
        Persona aux = primero;
       
        
        if(aux.getCedula().equals(dato))
            primero=primero.getSiguiente();
       
        else{
            while(aux.getSiguiente()!=null)
            {
                        
                if(aux.getSiguiente().getCedula().equals(dato))
                
                {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    
                     break;
                }
            
                aux=aux.getSiguiente();
            }
            if(dato.equals(ultimo().getCedula()))
            {
                aux=primero;           
                while(aux.getSiguiente()!=null)
                {  
                        if(aux.getSiguiente().getSiguiente()==null)
                        {
                            aux.getSiguiente().setSiguiente(null);
                            break;
                        }
                    aux=aux.getSiguiente();   
                }
            }
        }
    }
        public Persona ultimo()
    {
        Persona aux=primero;
        
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            return aux;
    }
        
        
         public void ordenarDeMayorAMenor()
    {
        Persona aux=primero;
        Persona personaTemporal;
        
        for (int i = 0; i < getCantidadPersonas(); i++) {
            aux=primero;
            while(aux.getSiguiente()!=null)
            {
                if(Integer.parseInt(aux.getEdad())<Integer.parseInt(aux.getSiguiente().getEdad()))
                {
                    personaTemporal=aux;
                    aux=aux.getSiguiente();
                    aux.setSiguiente(personaTemporal);
                }
                aux=aux.getSiguiente();
            }
            
        }
    }
       public void imprimirLista()
    {
        String informacion ="";
        Persona auxiliar = primero;
        while(auxiliar!=null)
        {
           informacion+=auxiliar.getInformacion();
        }
        
        
        ;
    }
      public void ordenarDeMenorAMayor()
    {
        Persona aux=primero;
        Persona personaTemporal;
        
        for (int i = 0; i < getCantidadPersonas(); i++) {
            aux=primero;
            while(aux.getSiguiente()!=null)
            {
                if(Integer.parseInt(aux.getEdad())>Integer.parseInt(aux.getSiguiente().getEdad()))
                {
                    personaTemporal=aux;
                    aux=aux.getSiguiente();
                    aux.setSiguiente(personaTemporal);
                }
                aux=aux.getSiguiente();
            }
            
        }
    }
      
     
         
}
