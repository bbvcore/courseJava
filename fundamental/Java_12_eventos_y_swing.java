package com.mycompany.java_01;
import java.awt.event.*;
import javax.swing.*;

public class Java_12_eventos_y_swing extends JFrame implements ActionListener {
   
    // Variable btn1
    JButton btn1;
    
    // Constructor: lo usamos para crear el Frame y le añadimos el botón.
    public  Java_12_eventos_y_swing(){
        // PASO 1: Creación de un FRAME, que servirá de contenedor para colocar nuestro 
        // botón, básicamente creamos la ventana.
        //=============================================================================
         JFrame jf1 = new JFrame();
         
        // PASO 2: Creación de un BOTÓN
        //=============================
          btn1 = new  JButton("Cerrar"); // Creación de un botón e inicialización del mismo
        // Creación de un botón e inicialización del mismo
          btn1.setBounds(20,20,50,50);
        //=============================
        // Se añade el botón al frame
          add(btn1);
        // Añadimos el listener, también en vez de this se puede añadir aquí la función.
        // Opción 1: La función como argumento del listener
            btn1.addActionListener( new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    if (event.getSource()==btn1){ // Método getSource() caputa acción sobre el botón (click, en este caso) 
                        // Cierra la ventana
                        System.exit(0);
                    }  
                }
            }); 
        // Opción 2: El litener declarado en función independiente
        // btn1.addActionListener(this);
        // Opción 3 crear un listener con un nombre y en vez de usar this
        // en la opción 2, usamos el nombre del listener
          
   
    }// END constructor
        
        // PASO 3: CREAR UN LISTENER
        //==========================
        // Uso del evento
        /*
        1.- Añadir Listener: add"TIPO"Listener
        2.- Crear Listener: new "TIPO"Listener
        3.- Función del método del evento.
        4.- Pasar el evento como argumento: "TIPOEvento event"
        */
  /*
    
    // Esto iría con la OPCIÓN 2.
    @Override
        public void actionPerformed(ActionEvent event){
                if (event.getSource()==btn1){
                    // Cierra la ventana
                    System.exit(0);
                }  
            }// End listener
    */  

    // Función PINCIPAL - MAIN
     public static void main (String [] args){
/*
TEORÍA BÁSICA

Paquete "java.util.event." contiene los eventos.
Los más habituales son: ActionEvent, MouseEvent o KeyEvent.
Los listeners escuchan los eventos, están en el paquete java.awt
En el ejemplo vamos a usar:
    Tipo de Evento: ActionEvent
    Tipo de Listener: ActionListener
        
Los listeners son interfaces que requieren de su implementación "implements" en la clase del TIPOListener
Los frames son clases que requieren herencia por ellos "extends" JFrame
     
*/
    // Creamos una instancia de la clase, crea el Frame con el botón
        Java_12_eventos_y_swing jf1 = new Java_12_eventos_y_swing();        
        // Especificamos tamaño, visibilidad y cierre del frame
        jf1.setBounds(800,400,300,150); // Posición (a,b), tamaño (c,d)
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acción cuando se pulse la "X" de cierre
}// end main

     
    // Este código hace falta cuando se añade el listener dentro del constructor, es decir con la opción 1
    // Ya que nos puede dar un error por el ámbito
    // Con la opción 2 al declarar el listener fuera del constructor no haría falta el control de esta
    // excepción
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
} // end clase
