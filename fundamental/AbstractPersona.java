package com.mycompany.java_01;

// CLASES ABSTRACTAS: Requisitos.
// 1.- Uso de "abstract" para declarar la clase como abstracta
// 2.- Tener al menos un método declarado como abstracto.
// La clase AbstractPersona por no renombrarla y perder
// la numeración de los ejercicios podría corresponder a una clase 
// denominada como Person, ya que los atributos son los básicos de una persona
// y mediante herencia podríamos crear, por ejemplo, profesiones que extendieran
// esta clase y heredaran estos atributos nacidos de la abstración y necesarios
// para cualquier tipo de empleado: profesor, mecanicos, dependientes, etc...

abstract public class AbstractPersona {
    // ATRIBUTOS
    private String name;
    private String surname;
    private String address;
    private int age;
    
    public AbstractPersona(){
        super();
    }
    public AbstractPersona(String name, String surname, String address, int age){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }
    
    // Método abstracto: Si la clase no fuera abstracta de primeras, pero
    // declarásemos un método abstracto, el compilador nos forzaría a declarar
    // la clase como abstracta
    public abstract String introduce();
    
    // SETTERS
    public void  setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    // GETTERS
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }
    
}
