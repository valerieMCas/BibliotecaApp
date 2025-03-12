/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.moldels;

/**
 *  Modelo que permite representa una persona
 * @author mariana rivas
 * @since 20250312
 * @version 1.0.0
 */
public class Autor extends Persona{
     //////////////////////////////////////////////////////////////
    /// Atributos
    
    /**
     * Editorial 
     */
    
    private String editorial;
    
    /**
     * profesion del autor
     */
    private String profesion; 
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor

    public Autor(String editorial, String profesion, String nombre, String documentoIdentidad, String correoElectronico) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodos acceso

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
}
