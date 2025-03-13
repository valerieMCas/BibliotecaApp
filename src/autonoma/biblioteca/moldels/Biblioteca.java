/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.moldels;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Biblioteca {
    
    private ArrayList <Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
   public boolean agregarLibro(Libro libro) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == libro.getId()) {
            return false; // Ya existe un libro con ese ID
        }
    }
    return libros.add(libro);
}
    
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
    
    public boolean eliminarLibro(Libro libro, long id){
        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getId() == (libro.getId())){ 
                libros.remove(i);  
                return true; 
            } 
        }
        return false; 
    }
    
    public Libro buscarLibro(long id){
        
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getId() == id ){
                return libros.get(i);
            }
        }
        
        return null;
    }
    
   public boolean actualizarLibro(Libro libro, long id) {
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getId() == id) {
            libros.get(i).setTitulo(libro.getTitulo());   
            return true; 
        }
    }
    return false; 
}
    
   public ArrayList obtenerLibrosAlfabeticamente(){
       
   }
    
    
    
    
    
}
