package com.mycompany.practico.gui6;

import com.mycompany.practico.gui6.clases.Producto;
import com.mycompany.practico.gui6.gui.VistaDeTodo;
import com.mycompany.practico.gui6.gui.VistaProductos;
import java.util.Set;
import java.util.TreeSet;

public class PracticoGUI6 {

    public static void main(String[] args) {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
         */
        Producto producto1 = new Producto(1, "Papas Fritas", 43.5, 23, "Comestible");
        Producto producto2 = new Producto(2, "Paco Rabanne", 43.5, 23, "Perfumeria");
        Producto producto3 = new Producto(3, "Milanesas", 43.5, 23, "Comestible");
        Producto producto4 = new Producto(4, "Detergente", 43.5, 23, "Limpieza");
        Producto producto5 = new Producto(5, "Calzoncillos", 43.5, 23, "Ropa");
        Producto producto6 = new Producto(6, "Uvasal", 43.5, 23, "Farmacia");
        Producto producto7 = new Producto(7, "Ibuprofeno", 43.5, 23, "Farmacia");
        Producto producto8 = new Producto(8, "Vendas", 43.5, 23, "Farmacia");
        Producto producto9 = new Producto(9, "Antonio Banderas", 43.5, 23, "Perfumeria");
        Producto producto10 = new Producto(10, "Bondiola", 43.5, 23, "Comida");
        VistaDeTodo.productos.add(producto1);
        VistaDeTodo.productos.add(producto2);
        VistaDeTodo.productos.add(producto3);
        VistaDeTodo.productos.add(producto4);
        VistaDeTodo.productos.add(producto5);
        VistaDeTodo.productos.add(producto6);
        VistaDeTodo.productos.add(producto7);
        VistaDeTodo.productos.add(producto8);
        VistaDeTodo.productos.add(producto9);
        VistaDeTodo.productos.add(producto10);
        
        for(Producto p : VistaDeTodo.productos){
            System.out.println("Stock "+p.getRubro());
        }
        /* Create and display the form*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDeTodo().setVisible(true);
            }
        }); 

        
    }

}
