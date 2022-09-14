package com.mycompany.java_01;
import java.util.Scanner;

public class Java_05_while { 
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
    //==========================================================================
    //  WHILE
    //==========================================================================
    // El bucle while se ejecuta mientras se cumpla una condición
    // Hay que tener mucho cuidado con los bucles infinitos
    // que pueden producir desbordamiento de la pila
    System.out.println("Ejecución WHILE:");
    System.out.print("Introduzca un número entre 1 y 10: ");
    int j = sc.nextInt();
    if (j>=1 && j<=10){
        while (j>=1 && j<=10){
            if(j==10){
                System.out.println("Se ha introducido el valor máximo final, se saldrá del loop. El valor introducido es: " +j );
                j++;
            }else{
                System.out.println("El valor introducido es: " + j + " y autoincrementará su valor en 1 unidad.");
                j++;
            } 
        }
        System.out.print("Se ha llegado al límite del bucle, el valor 10 y se abandona el mismo.");
    }else{
        System.out.print("El valor introducido no es válido y no se accede al bucle.");
    }
    //==========================================================================
    //  DO WHILE
    //==========================================================================
    // Una versión especial del while es el do while, con el do while
    // siempre se ejecutará un caso inicial, y en función de la respuesta
    // se cumpliran otros casos más.
    System.out.println("Ejecución DO WHILE: ");
        int i;
        do{
            System.out.println("Introducir un número, con 0 se sale: ");
            //sc.nextLine();
            i = sc.nextInt(); 
            System.out.print("El último número introducido es:  " + i + "\n");
        }while(i!=0);
            System.out.println("Ha introducido un 0, abandonando el bucle.");
    }
}