
package com.mycompany.java_01;

public class Mecanico extends AbstractPersona implements AccionesMecanicas{
   
    private String skill;
    //public Mecanico(){super();};
    public Mecanico (String name, String surname, String address, int age, String skill){
        super(name,surname,address,age);
        this.skill = skill;
    }
      
    // Getter
    public String getSkill(){
        return this.skill;
    }
    
    // Sobreescribimos el método abstracto
    @Override
    public  String introduce(){
        // Recogemos el valor almacenado en la clase abstracta "abstracPerson" y
        // que se lo hemos pasado a traves de la instancia de la clase "Mecanico"
        String cad = "Hola buenas, me llamo: " + this.getName();
        return cad;
    }
    // Sobreescribimos los métodos de la interface
   @Override
    public String repararPieza(){
        return "Vamos a proceder a REPARAR una pieza dañada.";
    };
   @Override  
    public void cambiarPieza(){
            System.out.print("Vamos a proceder a CAMBIAR una pieza dañada.");
    }
   @Override
    public void venderPieza(){
        System.out.print("Vamos a proceder a VENDER una pieza dañada.");
    }
   @Override
    public void tirarPieza(){
        System.out.print("Vamos a proceder a TIRAR una pieza dañada.");    
    }
    // Sobreescribimos el método toString() para mostrar los datos que necesitamos
    @Override
    public String toString(){
        return this.getName() + this.getSurname() + this.getAddress() + this.getAge() + this.getSkill();
    }
}
