package com.mycompany.java_01;
import java.util.Scanner;

public class Java_01_entrada_y_salida_datos {

    public static void main(String[] args) {
        System.out.println("Primer programa en Java.");
        System.out.println("Vamos a aprender a introducir datos por teclado.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String name = sc.nextLine();
        System.out.print("Introduce una edad: ");
        int age = sc.nextInt();
        System.out.print("Introduce la inicial de tu nombre: ");
        char letter = sc.next().charAt(0);
        System.out.println("Vamos a visualizar los datos introducidos.");
        System.out.println("El nombre introducido es: " + name);
        System.out.println("La edad introducida es: " + age);
        System.out.println("La inicial introducida es: " + letter);
        
        
        
    }
}
