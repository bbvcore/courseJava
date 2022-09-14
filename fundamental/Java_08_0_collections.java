package com.mycompany.java_01;

import java.util.*;

public class Java_08_0_collections {
    public static void main(String [] args){
//**********************************************************************************
//                         COLECCIONES
//**********************************************************************************
        // Collections: son elementos similares a los Arrays, ya que permiten
        // trabajar con estructuras de datos, pero a diferencia de los arrays
        // son dinámicos y no hace falta especificar su tamaño total.
/*

MÉTODOS PRINCIPALES DE LAS COLECCIONES
      
add(element), remove (objeto), clear(), size(),isEmpty(),contains(objeto),toString(),
toArray(),iterator(usa hasnext() y next()), containsAll(collection,addAll(collection, 
añade una colección a otra colección), removeAll(collection), retainAll(elimina todos 
elementos menos los de la colección que la ejecuta.
        
Métodos especiales: sort(ordenacion), binarySearch(exige implementar comparable compareTo),
swat(lista, valor a y valor b para el intercambio), replaceAll(lista,valor viejo, valor nuevo),
fill(lista,valor a llenar), copy(lista destino, lista origen), shuffle(baraja lista, desordena),
frequency(collection, objeto), max(colecction), reverse(lista).
*/
//**********************************************************************************
//                                  LIST
//**********************************************************************************      
        // Se usan tres tipos:
        // A. Listas: Permiten elementos duplicados. Hay 2 tipos: ArrayList y 
        // LinkedList. Las ventajas de las listas es disponer de los métodos get/set
        // A.1.- Ejemplo básico LinkedList
        List <Integer> lista01 = new LinkedList<>();
        lista01.add(10);
        lista01.add(20);
        lista01.add(30);
        for (int i=0; i < lista01.size();i++){
            System.out.println(lista01.get(i));
        }
        // A.2.- Ejemplo básico LinkedList
        ArrayList <Integer> lista02 = new ArrayList<>();
        lista02.add(40);
        lista02.add(50);
        lista02.add(60);
        for (int i=0; i < lista02.size();i++){
            System.out.println(lista02.get(i));
        }
/*
PRINCIPALES MÉTODOS exclusivos DE LAS LISTAS:

get(), set(), add(index,value)
        
*/        
//**********************************************************************************
//                         SET
//**********************************************************************************        
        // B. Set: No permiten elementos duplicados. Hay 3 tipos: HashSet, TreeSet
        // y LinkedHashSet. No se pueden iterar con un for clásico al no tener
        // el método get().
        HashSet<Integer> set01= new HashSet<>(); // Orden de inserción aleatorio
        set01.add(70);
        set01.add(80);
        set01.add(90);  
        System.out.println(set01);

         
        TreeSet<Integer> set02= new TreeSet<>(); // Orden de inserción por valor
        set02.add(100);
        set02.add(110);
        set02.add(120);
        
        System.out.println(set02);
 
        LinkedHashSet<Integer> set03= new LinkedHashSet<>(); // Orden de inserción por orden de entrada
        set03.add(130);
        set03.add(140);
        set03.add(150);
    
        System.out.println(set03);     
//**********************************************************************************
//                         MAP
//**********************************************************************************       
        // C. Map: Reciben 2 argumentos, 1 para el indice y otro para el valor.
        // Hay 3 tipos: HashMap, TreeMap y LinkedHashMap
        // En vez de usar add() como en Listas o Set, usamos put() para añadir
        // Aquí si disponemos del método get() como en lista, recordando que en
        // set no hay método get.
        // NO HEREDA DE COLLECTION, aunque su funcionamiento esta ligado.
        HashMap<Integer, String> teams = new HashMap<>();
        teams.put(1,"Celta Vigo");
        teams.put(2,"CD Lugo");
        teams.put(3,"SD Ponferradina");
        teams.put(4,"Real Sociedad");
        teams.put(5,"Villarreal"); 
        System.out.println(teams.keySet());
        
        
        
        TreeMap<Integer, String> bands  = new TreeMap<>();
        bands.put(1,"Korn");
        System.out.println(bands.values());
        System.out.println("Contiene Korn el diccionario?: " + bands.containsValue("Korn"));
        System.out.println("Contiene el indice 1 el diccionario?: " + bands.containsKey(1));
        
        
        LinkedHashMap<Integer,String> celta = new LinkedHashMap<>(); 
        celta.put(1,"Marchesin");
        celta.put(2,"Hugo Mallo");
        celta.put(10,"Iago Aspas");
        System.out.println(celta.values());
        
        /*
        Principales métodos de Map: 
        size(), isEmpty(), put(clave, valor), get(clave), remove(clave), clear()
        containsKey(key), containsValue(value), values()
        
        
        */
        
        
        
        
        
    }
}
