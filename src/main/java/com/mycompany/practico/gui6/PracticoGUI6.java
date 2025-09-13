/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practico.gui6;


import com.mycompany.practico.gui6.clases.Producto;
import com.mycompany.practico.gui6.gui.VistaProductos;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author FRANCO
 */
public class PracticoGUI6 {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
    }
    
    TreeSet<Producto> productos = new TreeSet<>();
    
     
}
