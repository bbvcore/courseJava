package com.mycompany.java_01;

import java.util.Scanner;

public class Java_03_Math_e_If {

    public static void main(String[] args) {
        // PROGRAMA PARA CALCULAR UNA ECUACIÓN DE SEGUNDO GRADO
        // Se utilizara sqrt() como método de la clase Math
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int control;
        System.out.print("Introduce el valor a: ");
        a = sc.nextInt();
        System.out.print("Introduce el valor b: ");
        b = sc.nextInt();
        System.out.print("Introduce el valor c: ");
        c = sc.nextInt();
        
        // La raíz ha de ser positiva, por ello vamos a calcular la operación
        // de dentro de la raíz y si el valor es mayor o igual que 0 
        // procederemos a calcular la raíz, para ello introduciremos
        // los condicionales  "if/else"
        // Calculado el cuadrado con la función Math.pow()
        double res = Math.pow(b,2) - (4*a*c);
        // Calculando el cuadrado con la multiplicación de b por sí mismo
        int res2 =  (b*b) - (4*a*c);
        
        System.out.println("El valor del interior de la raíz es: " + res);
        System.out.println("El valor del interior de la razí es: " + res2);
        
        if (res>=0){
            System.out.print("Se puede calcular la raíz cuadrada.");
            // Soluciones raiz cuadrada: x1 y x2
            float x1 = (float) (- b - (Math.sqrt(res)))/ (2*a);
            float x2 = (float) (-b + (Math.sqrt(res))) / (2*a);
            System.out.println("El resultado x1 es: " + x1);
            System.out.println("El resultado x2 es: "+ x2);
        }else{
            System.out.print("NO se puede calcular la raíz cuadrada.");
        }
        
        
        
        
       
        
        
        
    }
}
