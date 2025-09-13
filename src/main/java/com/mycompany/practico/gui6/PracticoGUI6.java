package com.mycompany.practico.gui6;


import com.mycompany.practico.gui6.clases.Producto;
import com.mycompany.practico.gui6.gui.VistaProductos;
import java.util.Comparator;
import java.util.TreeSet;


public class PracticoGUI6 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
        
        TreeSet<Producto> productos = new TreeSet<>();

        Producto p1 = new Producto(101, "Detergente", 250.0, 20, "Limpieza");
        Producto p2 = new Producto(55, "Pan", 120.0, 50, "Comestible");
        Producto p3 = new Producto(200, "Perfume", 1500.0, 5, "Perfumería");

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        
    }
     
}
