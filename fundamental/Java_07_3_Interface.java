
package com.mycompany.java_01;

public class Java_07_3_Interface {
    public static void main (String [] args){
        // Creo una instancia de la clase Mecanico, que es una clase que hereda
        // de la clase "AbstractPersona" e implementa la interface "AccionesMecanicas"
        Mecanico m1 = new Mecanico("Fulanito","Menganito","Avenida de la Libertad SN",30,"Encargado de motores");
        // Ejecutar interface: Ejemplos de como una interface puede ser String
        // con return y entonces la visualizamos con System.out.print()
        // o las declaradas como void, que no tienen "return" y el System.out.print
        // esta declarado dentro del propio método de la clase al implementars
        // el método declarado en la interface.
        System.out.println(m1.repararPieza());
        m1.cambiarPieza();
        m1.cambiarPieza();
        m1.cambiarPieza();
    }
}
