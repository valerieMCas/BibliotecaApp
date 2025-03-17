/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.main;

import autonoma.biblioteca.moldels.Biblioteca;
import autonoma.biblioteca.views.VentanaPrincipal;

/**
 *
 * @author Kamii
 */
public class BibliotecaApp {
    
    public static void main(String args[]){
    
        Biblioteca biblioteca = new Biblioteca();
        VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
        ventana.setVisible(true);
        
        
    }
    
}
