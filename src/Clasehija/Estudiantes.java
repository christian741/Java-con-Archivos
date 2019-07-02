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
 *@CLASE ESTUDIANTE
 * Almacena los datos del estudiantes
 */
public class Estudiantes extends Persona{
    /**
     * @variables:
     * curso: guarda el curso del estudiante
     * materia: guarda el materia del estudiante
     * nota: guarda el nota del estudiante
     * calificaciones[]: guarda calificaciones
     */
    
    private int curso;
    public static int notaPromedio;
    private String materia;
    private int nota;
    public static int calificaciones[];
    /**
     * @Costructor
     * @param _nombre variable que envia el usuario desde Persona
     * @param _apellido variable que envia el usuario desde Persona
     * @param _curso variable que envia el usuario
     * @param _materia variable que envia el usuario
     * @param _notaPromedio  variable que envia el usuario
     */
 
    public Estudiantes(String _nombre,String _apellido,int _curso,String _materia,int _notaPromedio){
        super(_nombre,_apellido);
        this.curso=_curso;
        this.materia=_materia;
        notaPromedio=_notaPromedio;
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
     /**
      * 
      * @param _nota 
      */
     public void setNota(int _nota){
         this.nota=_nota;
    }
 
}
