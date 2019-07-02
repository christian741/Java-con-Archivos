/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePadre;

/**
 *@CLASE Persona
 * Almacena los datos de las hijas
 */
public class Persona {
    
    /**@variables:
     * nombre: guarda el nombre de todos
     * apellido: guarda el materia del estudiante
     * */
    private String nombre;
    private String apellido;
    /**
     * @Costructor
     * @param _nombre variable que envia el usuario desde una hija
     * @param _apellido variable que envia el usuario desde una hija
     * */
     public Persona(String _nombre,String _apellido){
        
        this.nombre=_nombre;
        this.apellido=_apellido;
   }
    /**
     * FUNCIONES SET Y GET
     * @param _nombre 
     */
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
     public String getNombre(){
        return this.nombre;
    }
     /**
      * FUNCIONES SET Y GET
      * @param _apellido 
      */
    public void setApellido(String _apellido){
         this.apellido=_apellido;
    }
     public String getApellido(){
        return this.apellido;
    }
    
}
