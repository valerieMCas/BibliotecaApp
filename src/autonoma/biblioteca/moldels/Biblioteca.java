/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.moldels;

import java.util.ArrayList;

/**
 * Modelo que permite crear metodos
 * @author maria
 * @since 20250314
 * @version 1.0.0
 */
public class Biblioteca {
     //////////////////////////////////////////////////////////////
    /// Atributos
    /**
     * Lista de libros
     */
    private ArrayList <Libro> libros;
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo acceso
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo agregar libro
    public boolean agregarLibro(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                return false; // Ya existe un libro con ese ID
            }
        }
        return libros.add(libro);
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo mostrar libros
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "no hay libros en la biblioteca";
        }
        String resultado = "libros: ";
        for (int i = 0; i < libros.size(); i++) {
            resultado += "id: " + libros.get(i).getId() + ", titulo: " + libros.get(i).getTitulo();
        }
        return resultado;
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo eliminar libro por id
    public boolean eliminarLibro(Libro libro, long id){
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getId() == (libro.getId())){ 
                libros.remove(i);  
                return true; 
            } 
        }
        return false; 
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo buscar libro por id
    public Libro buscarLibro(long id){
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getId() == id ){
                return libros.get(i);
            }
        }
        
        return null;
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo actualizar libro por id
    public boolean actualizarLibro(Libro libro, long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.get(i).setTitulo(libro.getTitulo());   
                return true; 
            }
        }
        return false; 
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo obtener libros por orden alfabetico
    public ArrayList obtenerLibrosAlfabeticamente(){
    ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
    for (int i = 0; i < librosOrdenados.size()- 1; i++) { 
        for (int j = 0; j < librosOrdenados.size()- 1 - i; j++) { 
            if (librosOrdenados.get(j).getTitulo().compareToIgnoreCase(librosOrdenados.get(j + 1).getTitulo()) > 0) {
                Libro temp = librosOrdenados.get(j); 
                librosOrdenados.set(j, librosOrdenados.get(j + 1)); 
                librosOrdenados.set(j + 1, temp); 
            }
        }
    }  
    return librosOrdenados; // Devuelve la lista ordenad       
   }   
    
}
