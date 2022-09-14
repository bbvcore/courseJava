package com.mycompany.java_01;

import java.util.*;

public class Java_08_1_ArrayList_de_Objetos {
    public static void main(String [] args){
        
        // Usando las colecciones, en este caso una lista del subtipo ArrayList
        // probablemente la más utilizada, por la gran cantidad de métodos que 
        // ofrece y la posibilidad de contar con métodos como get() y set()
        // que permiten grandes posibilidades de iteración, además de permitir
        // elementos duplicados.
        ArrayList <Persona> personas = new ArrayList<>();
        
        personas.add(new Persona(40,135234,'M'));
        personas.add(new Persona(30,369435,'L'));
        personas.add(new Persona(18,435534,'S'));
        personas.add(new Persona(50,347835,'L'));
      
        // ITERACIÓN CON FOR
        //==================
        System.out.println("Valores almacenados en el ArrayList de objetos: ");
        System.out.println("Iteración realizada con un for clásico.");
        for (int i = 0; i<personas.size();i++){
            System.out.print("Edad: " + personas.get(i).getAge());
            System.out.print(", Id: " + personas.get(i).getId());
            System.out.print(", talla: " + personas.get(i).getSize());
            System.out.println();  
        }
        
        // ITERACIÓN CON ITERATOR Y WHILE
        System.out.println("Iteración con iterator y while:");
        Iterator <Persona> it = personas.iterator();
        while(it.hasNext()){
            // Opción A
            //Persona loopPersona = it.next();
            //System.out.println(loopPersona);
            // Opción B
            System.out.println(it.next());
        }
        
        // ITERACIÓN CON ITERATOR Y FOR
        System.out.println("Iteración con iterator y for:");
        Iterator <Persona> it2 = personas.iterator();
        for(;it2.hasNext();){
            Persona loopPersona2 = it2.next();
            System.out.println(loopPersona2);
        }
        
    }
}