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
public class Persona {
    
    private String cedula;
    private String nombre;
    private String edad;
    private String prioridad;
    private String fechaCita;
    private Persona siguiente;

    public Persona(String cedula, String nombre, String edad, String prioridad, String fechaCita, Persona siguiente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
        this.fechaCita = fechaCita;
        this.siguiente = siguiente;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaCita
     */
    public String getFechaCita() {
        return fechaCita;
    }

    /**
     * @param fechaCita the fechaCita to set
     */
    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    /**
     * @return the siguiente
     */
    public Persona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    public String getInformacion()
    {
        return "Cedula: "+getCedula()+", Persona: "+getNombre()+", Edad: "+getEdad()+", prioridad: "+getPrioridad()+", Fecha de la cita: "+getFechaCita();
    }
}
