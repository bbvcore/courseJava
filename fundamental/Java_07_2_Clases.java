package com.mycompany.java_01;

public class Java_07_2_Clases { 
    
    // Función main
    public static void main (String []args){
        // CREACIÓN OBJETOS / INSTANCIAS DE CLASE
        // Usando constructor por defecto, sin argumentos
        Persona p1 = new Persona();
        // Usando constructos con argumentos: edad, número de ID, ambos de tipo
        // int y el argumento size de tipo char.
        Persona p2 = new Persona(40,3456789,'M');
        // Ver los datos introducidos
        System.out.println("La edad del objeto p2 es: " + p2.getAge() + " años");
        System.out.println("El ID del objeto p2 es: " + p2.getId());
        System.out.println("La tall del objeto p2 es: " + p2.getSize());
        // Modificar los valores introducidos con los SETTERS declarados en la clase.
        p2.setAge(30);
        p2.setId(123456);
        p2.setSize('L');
        // Ver los valores modificados
        System.out.println("La edad modificada es: " + p2.getAge() + " años");
        System.out.println("El ID modificada es: " + p2.getId());
        System.out.println("La talla modificada es: " + p2.getSize());
        // Ver los datos a través del método toString();
        System.out.println("Ver los datos a través del método toString():  ");
        System.out.println(p2.toString());
        // Comparable (compareTo())
        System.out.print(p1.compareTo(p2));
        // Comparator (compare())
        System.out.print(p1.compare(p1,p2));  
    }
}
