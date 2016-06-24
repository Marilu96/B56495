/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Nodo;
public class Metodos_Nodos {
    
    Nodo primero;
      
    public Metodos_Nodos()
    {
    
    }
        
    public void crear(int cantidad)
    {
        primero = new Nodo("1",null);
        Nodo auxiliar=primero;
        for(int i= 2; i<=cantidad; i++)
        {
            auxiliar.setSiguiente(new Nodo(""+i,null));
            auxiliar=auxiliar.getSiguiente();
        }
    }
    
    public String devolverLista()
    {
        Nodo auxiliar=primero;
        String valores="";
        
        while(auxiliar.getSiguiente()!=null)
        {
            valores+="Valor del Nodo: "+auxiliar.getDato()+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
        valores+="Valor del Nodo: "+auxiliar.getDato();
        return valores;
    }
    
    public void modificarInformacion(String dato, String nuevoDato)
    {
        Nodo aux = primero;
        
        while(aux!=null)
        {
            if(aux.getDato().equals(dato))
            {
                aux.setDato(nuevoDato);
            }
            aux=aux.getSiguiente();
        }
    }
    
    public void agregarAlFinal(String dato)
    {
        Nodo aux = ultimo();
        aux.setSiguiente(new Nodo(dato,null));
        
    }
    
    public Nodo ultimo()
    {
        Nodo aux=primero;
        
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            return aux;
    }
    
   
 
    public void eliminar(String dato)
    {
        Nodo aux = primero;
       
        //verifica que el nodo a eliminar sea el primero
        if(aux.getDato().equals(dato))
            primero=primero.getSiguiente();
       
        else{//sino es el primero
            while(aux.getSiguiente()!=null)//recorre la lista
            {
                        
                if(aux.getSiguiente().getDato().equals(dato))
                //hasta que el dato del nodo siguiente sea = al dato por parametros
                {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    //se apunta al siguiente nodo del que se va eliminar
                     break;//en caso de que lo encuentre termine y no recorra toda la lista
                }
            
                aux=aux.getSiguiente();//para que continue el siguiente
            }
            if(dato.equals(ultimo().getDato()))//se llama al metod que devuelve el ultimo() y si es igual al dato
            {
                aux=primero;           
                while(aux.getSiguiente()!=null)//recorr la lista
                {  
                        if(aux.getSiguiente().getSiguiente()==null)//para encontrar el anterior del ultimo
                        {
                            aux.getSiguiente().setSiguiente(null);//el anterio al ultimo apunta al ultimo
                            break;//quiebra para no seguir
                        }
                    aux=aux.getSiguiente();   //que continue con el siguiente
                }
            }
        }
    }
   
    
}
