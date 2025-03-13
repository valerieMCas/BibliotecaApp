/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.moldels;

/**
 * Modelo que permite representa un libro
 * @author Maria camila Prada Cortes
 * @since 20250313
 * @version 1.0.0
 */
public class Libro {
    //////////////////////////////////////////////////////////////
    /// Atributos
    
    /**
    * Representa el autor del libro. Este atributo almacena una 
    * referencia a un objeto de la clase Autor, el cual contiene 
    * información sobre el escritor del libro.
    */
    
    private Autor autor;
    /**
    *  identificador del libro 
    */
    private long id;
    
    /**
    *  titulo del libro 
    */
    private String titulo;
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor

    public Libro(long id, String titulo, Autor autor) { 
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodos acceso
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public Autor getAutor(){
        return autor;
    }
}
