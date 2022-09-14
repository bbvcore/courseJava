package com.mycompany.java_01;
import java.io.*;
import java.util.Scanner;
// Al trabajar con datos binarios necesitamos de un envoltorio que nos permite
// trabajar serializando y deserializando: es decir transforman los datos
// en series de bytes planos y a la inversa.
// Para ello usamos FileInputStream y FileOuputStream como envoltorio para
// ayudarnos en estas operaciones
public class Java_11_fichero_binario implements Serializable {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws ClassNotFoundException{
        
// 1.- ESCRITURA / CREACIÓN DE FICHERO BINARIO
    try {
        FileOutputStream fo = new FileOutputStream("e:\\datos.dat");
        ObjectOutputStream os = new ObjectOutputStream(fo);
        // La escritura usa el métod write, pero combinado tipo valor a almacenar
        // writeObject, writeInt, WriteLong, WriteDouble, writeChar, writeBoolean
        System.out.print("Introducir número total de números a introducir:  ");
        int numbers = sc.nextInt();
        int table[] = new int [numbers];
        for (int i=0; i< table.length;i++){
            System.out.print("Introducir número:");
            table[i] = sc.nextInt();
        }
        os.writeObject(table);
        os.close();
    }catch(IOException e){
        System.out.println("Se ha producido un error al crear el fichero binario: " + e);
    }
// 2.- LECTURA DE FICHERO BINARIO
    try {
        FileInputStream fi = new FileInputStream("e:\\datos.dat");
        ObjectInputStream is = new ObjectInputStream(fi);
        // La escritura usa el métod write, pero combinado tipo valor a almacenar
        // writeObject, writeInt, WriteLong, WriteDouble, writeChar, writeBoolean
        
        // Importante hacer cast para poder leer, porque almacenamos con writeObject
        // no con writeInt(), entonces hay que indicarle a JAVA que tipo de Objeto
        // vamos a leer, ahora es una matriz de tipo int, pero podría ser un String,
        // una Clase o una Lista.
        int table[] = (int[]) is.readObject();
        // Visualizamos datos
        for (int i=0; i<table.length;i++){
            System.out.println(table[i]);
        }
        is.close();
    }catch(IOException e){
        System.out.println("Se ha producido un error al leer el fichero binario: " + e);    
    }    
    }// End main
}// End Class
