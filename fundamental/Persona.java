
package com.mycompany.java_01;
import java.util.*;

public class Persona implements Comparator<Persona>, Comparable<Persona> {
    // ATRIBUTOS
    private int age;
    private int id;
    private char size;
    
    // CONSTRUCTORES: Nos permite recibir argumentos en la instanciación.
    // Creamos 2 para profundizar en el concepto de SOBRECARGA en la POO.
    // Por defecto este constructor sin parámetros va implicito,
    // pero lo he declarado para que se vea, por resultar más didáctico.
    public Persona(){
        super(); // Llama a los valroes del constructor padre, o en este caso
                 // al constructor por defecto
    }
    // Constructor que recibe parámetros
    public Persona(int age,int id,char talla){
        this.age = age;
        this.id = id;
        this.size = talla;
    }
    
    // MÉTODOS
    // El acceso a valores privados requiere del uso de getters y setters
    // forman parte de la ENCAPSULACIÓN una parte fundamental de la POO
    // y que confiere mayor seguridad a nuestros programas.
    // GETTERS
    public int getAge (){
        // Esta función es un getter, sirve para devolver el valor
        // por ello necesita un "return" y también un tipo en la declaración
        // del método, en este caso "int"
        return this.age;
    }
    public int getId (){
        return this.id;
    }
    public char getSize (){
        return this.size;
    }
    // SETTERS
    public void setAge (int age){
        // Esta función es un setter, sirver para modificar un valor,
        // por ello no tiene retorno, no hace falta un "return", por ello es
        // de tipo "void" y requiere de la recepción de un valor para 
        // asignar o modificar el valor del atributo en cuestión.
        this.age = age;
    }
    public void setId (int id){
        this.id = id;
    }
    public void setSize (char size){
        this.size = size;
    }
    
    // SOBREESCRITURA
    // Otra propiedad de la programación orientada a objetos que vamos a ver aquí
    // es la sobreescritura de métodos. Es decir vamos a coger un método definido,
    // como es toString() y perteneciente por defecto a los Objetos de JAVA
    // y a sobreescribirlo para que nos devuelva lo que necesitamos.
    // En este caso mostrar correctamente los valores de los atributos de nuestro objeto.
    @Override
    public String toString() {
         return "Edad:  " + age + "; ID:" + id + "; Talla: " + size;
  }
    
    @Override
    public int compareTo(Persona x){
        if (this.age == x.age){
            return 0;
         }else if (this.age>x.age){
             return 1;
         }else{
             return -1;
         }
        
    }
    public int compare(Persona x, Persona y){
        if (x.age == y.age){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
   
    


