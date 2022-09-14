
package com.mycompany.java_01;
import java.util.*;
public class Java_08_2_Iterator_foreach {
    public static void main (String [] args){
        // Creamos un arrayList de String para las iteraciones
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ponferrada");
        cities.add("Barcelona");
        cities.add("Madrid");
        cities.add("Berlín");
        cities.add("Roma");
        cities.add("Paris");
        cities.add("Bucarest");
        cities.add("Helsinki");
        cities.add("Copenague");
        cities.add("Estocolmo");
        cities.add("Amsterdam");
        cities.add("Bruselas");
        cities.add("Budapest");
        cities.add("Zagreb");
        cities.add("Moscú");
        
        // Iteración con for each
        System.out.println("Iteración de la colección con foreach");
        for (String value : cities){
            System.out.println(value);
        }
        
        
        // Iteración con Iterator y FOR
        System.out.println("Iteración de la colección con iterator y FOR");
        Iterator<String> it = cities.iterator();
        for (;it.hasNext();){
            System.out.println(it.next());
        }

        // Iteración con Iterator y WHILE
        System.out.println("Iteración de la colección con iterator y WHILE");
        Iterator<String> it2 = cities.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        

        
    }
    
}
