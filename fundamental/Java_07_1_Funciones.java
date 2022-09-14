package com.mycompany.java_01;

import java.util.Scanner;

public class Java_07_1_Funciones { 
    // Leer datos por teclado
    static Scanner sc = new Scanner(System.in);

    // Función main
    public static void main(String args[]){
        saludo();
        System.out.print("Esta es una smuma obtenida a través de una función int con return que realiza la operación  4 + 1 cuyo valor es igual a: " + suma(4,1));
}
    static public void saludo(){
        System.out.println("Este es un saludo enviado desde una función void, una función sin return");
    }
    static int suma(int a, int b){
        return a+b;
    }

}