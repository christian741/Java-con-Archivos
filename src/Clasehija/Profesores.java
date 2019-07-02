/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasehija;

import java.util.Scanner;
import java.io.*;
import ClasePadre.Persona;
/**
 *@CLASE Profesores
 * Almacena los datos de los profesores
 */
public class Profesores extends Persona{
      /**
     * @variables:
     * curso: guarda el curso del profesor
     * materia: guarda el materia del profesor
     * nota: guarda el nota del profesor
     * calificaciones[]: guarda profesor
     */
    private int curso;
    private String materia;
  
    /**
     * @Costructor
     * @param _nombre variable que envia el usuario desde una hija
     * @param _apellido variable que envia el usuario desde una hija
     * */
 
    public Profesores(String _nombre,String _apellido,int _curso,String _materia){
        super(_nombre,_apellido);
        this.curso=_curso;
        this.materia=_materia;
   }
    /**
     * 
     * @param _curso 
     */
    public void setCurso(int _curso){
        this.curso=_curso;
    }
     public int getCurso(){
        return this.curso;
    }
     /**
     * 
     * @param _materia 
     */
    public void setMateria(String _materia){
         this.materia=_materia;
    }
     public String getMateria(){
        return this.materia;
    }
    
    
}
