/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.moldels;

/**
 *Modelo que permite representa una persona
 * @author Valerie moreno
 * @since 20250312
 * @version 1.0.0
 */
public abstract class Persona {
    //////////////////////////////////////////////////////////////
    /// Atributos
    
    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Numero de cuidadania de la persona
     */
    private String documentoIdentidad;
    /**
     * email de la persona
     */
    private String correoElectronico;
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor

    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}
