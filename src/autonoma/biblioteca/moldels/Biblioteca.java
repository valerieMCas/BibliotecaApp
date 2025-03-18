package autonoma.biblioteca.moldels;

import java.util.ArrayList;

/**
 * Modelo que permite crear metodos
 * @author mariana rivas y valerie moreno
 * @since 20250314
 * @version 1.0.0
 */
public class Biblioteca {
    
     //////////////////////////////////////////////////////////////
    /// Atributos
    private ArrayList <Libro> libros;
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo Constructor
    public Biblioteca() {
        this.libros = new ArrayList();
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo acceso
    
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
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }
    
    public ArrayList<Libro> getLibrosAlfabeticamente(){
        return this.obtenerLibrosAlfabeticamente();
    }
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo eliminar libro por id
    public boolean eliminarLibro(long id){
        int indice = this.buscarIndiceLibro(id);
        if(indice > 0){
            this.libros.remove(indice);
        }
        return false;
    }
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo buscar libro por id
    public Libro buscarLibro(long id){
        for(Libro l : libros){
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }
    
    ///////////////////////////////////////////////////////////////////////
    ///Metodo actualizar libro por id
    public boolean actualizarLibro(Libro libro, long id) {
        int indice = this.buscarIndiceLibro(id);
        if(indice > 0){
            this.libros.set(indice, libro);
        }
        return false; 
    }
    ///////////////////////////////////////////////////////////////////////
    ///Metodo obtener libros por orden alfabetico
    private ArrayList obtenerLibrosAlfabeticamente(){
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
    return librosOrdenados; // Devuelve la lista ordenada       
   }   
   ///////////////////////////////////////////////////////////////////////
   ///Metodo privado para buscar el indice de un libro en nuestra lista de libros
   
   private int buscarIndiceLibro(long id){
       for(int i = 0; i<this.libros.size(); i++){
           Libro l = this.libros.get(i);
           if(l.getId() == id){
           return i;
           }
       }
       return -1;
   }
}
