package com.mycompany.practico.gui6;


import com.mycompany.practico.gui6.clases.Producto;
import com.mycompany.practico.gui6.gui.VistaProductos;
import java.util.Set;
import java.util.TreeSet;


public class PracticoGUI6 {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
        
         TreeSet<Producto> productos = new TreeSet<>();
    
    }
     
}
