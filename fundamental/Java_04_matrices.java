package com.mycompany.java_01;
import java.util.Scanner;

public class Java_04_matrices {
    
    static Scanner sc = new Scanner(System.in);
    static int array[] = new int[]{1,2,3,4,5};
    static int array2[]= new int[3];
    static int array3[] = {1,2,3,4,5};
    
    public static void main(String args[]){

        int i,j;
        // Recorrer y mostrar el contenido de un array
        System.out.print("Valores array mediante for: ");
        for (i=0;i< array.length;i++ ){
            System.out.print(array[i]);
        }
        System.out.println();
      
        // Insertar datos en un array
        for (j=0;j<array2.length;j++){
            System.out.print("Introducir un número: ");
            array2[j]=sc.nextInt(); 
        }
    
        // Ver los datos introducidos con un foreach
        System.out.print("Valores array mediante foreach: ");
        for (int key : array2){
            System.out.print(key);
        }
    }
}
