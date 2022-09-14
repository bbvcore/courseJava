package com.mycompany.java_01;
//==============================================================================
//                   TRABAJANDO CON FICHEROS DE TEXTO
//==============================================================================
import java.io.*;
public class Java_11_fichero_text {
    public static void main(String [] args){
        try{
//==============================================================================
// A.- Escritura / creación del fichero de texto
//==============================================================================
        // Creación del fichero de texto
        // FileWriter permite crear un fichero de TEXTO
        // BufferedWriter permite usar un buffer para escribirlo, así podemos manejar
        // un flujo de datos.
            FileWriter fw = new FileWriter("e:\\fichero.txt");
            BufferedWriter br = new BufferedWriter(fw);
           
            // Opción 1: Insertamos primera línea iterando String, caracter a caracter
            String text = "Había una vez un barquito chiquitito, que no podía, que no podía...";
            for (int i=0 ; i< text.length(); i++){
                // Método del objeto buffer write(), para escribir
                br.write(text.charAt(i));
            }
            // Método newLine() añade otra línea
            br.newLine();
            
            // Opción 2: Insertamos segunda línea sin iterar, la cadena entera de golpe
            String text2= "que no podía navegar!!!";
            br.write(text2);   
            // Cerrar buffered, sino no graba nada.
            br.close();
        }catch(IOException e){
            System.out.println("Se produjo un error durante la creación del archivo." + e);   
        }
//==============================================================================
// B.- Lectura del fichero de texto
//==============================================================================  
// B.1.- Método SIN buffer:
//-----------------------
        // Ahora usaremos FileReader para leer y SIN buffer
        try{
            // Sin buffered
            FileReader fr = new FileReader("e:\\fichero.txt");
            // Para leer se usa método read() que es de tipo entero
            // por eso inicializamos c a -1, porque read() devolverá -1 cuando
            // llegue al final del fichero. Es de tipo entero porque los caracteres
            // están CODIFICADOS EN FORMATO UNICODE
            String aux="";
            // INICIA LECTURA
            int c = fr.read();
            // Leemos combinando un bucle while y el método read()
            while (c != -1){
                // Como aux es una cadena, convertimos "c" a caracter
                // para almacenar
                aux += (char) c;
                // Volvemos a leer el entero y seguiremos mientras no sea el final (-1)
                c = fr.read();
            }
            // CIERRE LECTURA
            fr.close();
            // Una vez finalizada la lectura, al llegar a -1, pasamos a ver el contenido
            // almacenado en la cadena auxiliar usada para la lectura
            System.out.println("Resultado método 1 con read: ");
            System.out.println(aux);
        }catch(IOException e){
            System.out.println("Error en la lectura del fichero con while y read(): " + e);
        }
//-----------------------
// B.2.- Método CON buffer:
//-----------------------   
// Al usar buffer, usaremos BufferedReader y así podrémos usar el método readLine()
// en vez de read()
            try {
                FileReader fr = new FileReader("e:\\fichero.txt");
                BufferedReader br = new BufferedReader(fr);
                String auxLine = "";
                // Aquí al leer un fichero por cadenas, el final lo marca null
                // no (-1) como hacía el método int read(), pq ahora usaremos
                // el método readLine() que es de tipo String
                // INICIA LECTURA
                String line = br.readLine();
                while (line!= null){
                    auxLine += line + "\n";
                    line = br.readLine();
                }
                // CIERRE LECTURA
                br.close();
                // MOSTRAMOS CONTENIDO
                System.out.println("Resultado método 2 con readline: ");
                System.out.println(auxLine);
            }catch(IOException e){
                System.out.println("Error en la lectura con el método readLine()" + e );
            } 
    }// End Main
}// End Class
    
