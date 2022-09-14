package com.mycompany.java_01;
import java.util.Scanner;

public class Java_06_switch { 
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
       System.out.println("Introducir un número: ");
       int number = sc.nextInt();
       switch(number){
           case 1: System.out.println("Se ha ejecutado el caso 1");
           break;
           case 2: System.out.println("Se ha ejecutado el caso 2");
           break;
           default: System.out.print("Opción por defecto.");
           break;
       }
       System.out.println("Abandonando el switch.");
    }
}
