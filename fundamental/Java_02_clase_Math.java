package com.mycompany.java_01;

// Incluimos el paquete util que contiene la clase Scanner
import java.util.Scanner;


// Esta clase se centrará en algunas nociones matemáticas
public class Java_02_clase_Math {
    public static void main (String args[]){
        // Constante en Java: Se construyen con la palabra FINAL
        final double PI = 3.14;
        double radio, longitudCircunferencia;
        
        // Scanner nos ayuda a leer datos por teclado de forma facil
        Scanner sc = new Scanner(System.in);
        
        // Petición de datos por teclado
        System.out.print("Introducir el radio: ");
        radio = sc.nextDouble();
        // La formula matemática es : 2 multiplicado por PI y por el radio.
        longitudCircunferencia = 2 * PI * radio;
        
        // Resultado
        System.out.print("La longitud de la cirunferencia es: " + longitudCircunferencia);
        
        // Calculo de una potencia matemática
        // Se pedirá base y exponente
        // Estudiaremos la clase Math, ideal para operaciones matemáticas
        int base, exponente;
        System.out.print("Introducir un número entero que haga de base: ");
        base = sc.nextInt();
        System.out.print("Introducir un número entero que haga de exponente: ");
        exponente = sc.nextInt();
        double calculo = Math.pow(base,exponente);
        System.out.print("El calculo de la base elevada al exponentes es: " + calculo);
        
    }
}
