/*
 * @DECLARACION de paquedes y sus imports
 */
package Principal;
import java.io.*;
import java.util.Scanner;
import Clasehija.Estudiantes;
import static Clasehija.Estudiantes.calificaciones;
import Clasehija.Profesores;


/**
 * Fecha: 16/03/2018
 * @FuncionPrograma:
 * El programa debe gestionar:  docentes y alumnos. (Crear y eliminar del archivo plano), crear curso, materias y asignar estudiantes (Dinámica). Listado de docentes y alumnos ya precargado en el archivo plano. 
 * El sistema debe poder asignar n cantidad notas a los estudiantes o por materia.
 * El sistema debe mostrar el listado de alumnos por materia, sus notas y su nota final. 
 * El sistema debe mostrar lo mejores 5 promedios por materia.
 * El sistema debe generar el listado de docentes y sus materias. 
 * 
 * @autores Christian David Diaz , Cristian Camilo Medina
 */
public class Main {
     
    static  Estudiantes arrayObjetos[] =new Estudiantes[10];
    static  Profesores arrayProfe[] =new Profesores[10];
    static int sumador=6;
    static int sumador2=6;
    
    public static void main(String[] args) throws IOException  {
      
        menu();
       
    }
    /**
     * Funcion agregarProfesores() que nos permite agregar estudiantes a el archivo
     * @Objetos Profesores Constructor
     * @variables
     * opcion permite elegir lo que desea el usuario
     * @throws IOException llamado archivos
     */
     public static void agregarProfesores()throws IOException{
         
                    Scanner leerDatos=new Scanner (System.in);
                    File fichero1=new File("profesores.txt");
                    FileWriter archivo=new FileWriter(fichero1, true);
                    BufferedWriter escritura=new BufferedWriter(archivo);
                    PrintWriter escribe=new PrintWriter(escritura);
                    
                   
                    
                    arrayProfe[0]=new Profesores("Christian","Diaz", 300, "programacion");
                    arrayProfe[1]=new Profesores("Camilo","Medina", 300, "estructuras");
                    arrayProfe[2]=new Profesores("Daniel","Enrique", 300, "biologia");
                    arrayProfe[3]=new Profesores("Juan","Perez", 301, "programacion");
                    arrayProfe[4]=new Profesores("Antonio","Hernandez", 301, "estructuras");
                    arrayProfe[5]=new Profesores("Pedro","Mando", 301, "biologia");
                    // pidiendo datos alumno
                   System.out.println("Digite segun desee hacer:");
                   System.out.println("1.LLenar Archivo");
                   System.out.println("2.Agregar nuevo alumno");
                   byte opcion=leerDatos.nextByte();
                   while(opcion<=0 && opcion>2){
                   System.out.println("Digite segun desee hacer:");
                   System.out.println("1.LLenar Archivo");
                   System.out.println("2.Agregar nuevo profesor");
                      opcion=leerDatos.nextByte();
                   }
                   if(opcion==1){
                    for(int i=0;i<6;i++){
                    escribe.println(i+" "+arrayProfe[i].getNombre()+" "+arrayProfe[i].getApellido()+" "+arrayProfe[i].getCurso()+" "+arrayProfe[i].getMateria());
                    }
                    
                   }
                   if(opcion==2){
                       String auxNombre,auxApellido,auxMateria;
                       int auxCurso,su=0;
                       System.out.println("Nuevo nombre");
                       leerDatos.nextLine();
                       auxNombre=leerDatos.nextLine();
                       System.out.println("Nuevo apellido");
                       auxApellido=leerDatos.nextLine();
                       System.out.println("Nuevo Curso");
                     
                       auxCurso=leerDatos.nextInt();
                       while(auxCurso<300 && auxCurso>301){
                           System.out.println("Nuevo Curso");
                            auxCurso=leerDatos.nextInt();
                       }
                       System.out.println("Nuevo materia programacion o biologia o estructuras");
                       leerDatos.nextLine();
                       auxMateria=leerDatos.nextLine();
                       /*while(auxMateria!="programacion" || auxMateria!="biologia" || auxMateria!="estructuras"){
                           System.out.println("Nuevo materia programacion o biologia o estructuras");
                           leerDatos.nextLine();
                           auxMateria=leerDatos.nextLine();
                       }*/
                       
                       escribe.println((sumador2++)+" "+" "+auxNombre+" "+auxApellido+" "+auxCurso+" "+auxMateria+" "+su);
                       
                   }
                    
                    
                    
                    
                    System.out.println("Datos almacenados:");
                    escribe.close();
     
     }
    /**
     * Funcion agregarEstudiantes() que nos permite agregar estudiantes a el archivo
     * @Objetos Estudiantes Constructor
     * @variables
     * opcion permite elegir lo que desea el usuario
     * @throws IOException llamado archivos
     */
    public static void agregarEstudiantes()throws IOException{
       
                    Scanner leerDatos=new Scanner (System.in);
                    File fichero=new File("estudiantes.txt");
                    FileWriter archivo=new FileWriter(fichero, true);
                    BufferedWriter escritura=new BufferedWriter(archivo);
                    PrintWriter escribe=new PrintWriter(escritura);
                   
                    arrayObjetos[0]=new Estudiantes("Santiago","Diaz", 300,"programacion",0);
                    arrayObjetos[1]=new Estudiantes("Rosa","Rodriguez", 301,"programacion",0);
                    arrayObjetos[2]=new Estudiantes("Laura","Murillo", 300,"estructuras",0);
                    arrayObjetos[3]=new Estudiantes("Paola","elvio", 300,"biologia",0);
                    arrayObjetos[4]=new Estudiantes("Cuadrado","lado", 301,"estructuras",0);
                    arrayObjetos[5]=new Estudiantes("Circulo","Ubate", 301,"biologia",0);
                    
                    
                   
                    // pidiendo datos alumno
                   System.out.println("Digite segun desee hacer:");
                   System.out.println("1.LLenar Archivo");
                   System.out.println("2.Agregar nuevo alumno");
                   byte opcion=leerDatos.nextByte();
                   while(opcion<=0 && opcion>2){
                   System.out.println("Digite segun desee hacer:");
                   System.out.println("1.LLenar Archivo");
                   System.out.println("2.Agregar nuevo alumno");
                      opcion=leerDatos.nextByte();
                   }
                         
                    if(opcion==1){
                    for(int i=0;i<6;i++){
                    escribe.println(i+" "+arrayObjetos[i].getNombre()+" "+arrayObjetos[i].getApellido()+" "+arrayObjetos[i].getCurso()+" "+arrayObjetos[i].getMateria());
                    }
                    }
                    if(opcion==2){
                       String auxNombre,auxApellido,auxMateria;
                       int auxCurso,nota=0;
                       System.out.println("Nuevo nombre");
                       leerDatos.nextLine();
                       auxNombre=leerDatos.nextLine();
                       System.out.println("Nuevo apellido");
                       auxApellido=leerDatos.nextLine();
                       System.out.println("Nuevo Curso");
                       
                       auxCurso=leerDatos.nextInt();
                       while(auxCurso<300 && auxCurso>301){
                           System.out.println("Nuevo Curso");
                            auxCurso=leerDatos.nextInt();
                       }
                       System.out.println("Nuevo materia programacion o biologia o estructuras");
                       leerDatos.nextLine();
                       auxMateria=leerDatos.nextLine();
                       //while(auxMateria!="programacion" /*|| auxMateria!="biologia" || auxMateria!="estructuras"*/){
                        //   System.out.println("Nuevo materia programacion o biologia o estructuras");
                        //   auxMateria=leerDatos.nextLine();
                       //}
                       
                       escribe.println((sumador++)+" "+" "+auxNombre+" "+auxApellido+" "+auxCurso+" "+auxMateria+" "+nota);
                   }
                    
                    System.out.println("Datos almacenados:");
                    System.out.println("");
                    escribe.close();

    }
    /**
     * Funcion listarProfesores()
     * busca los usuraios dentro del archivo estudiantes
     * @throws IOException llama archivos
     */
     public static void listarEstudiantes() throws IOException{
                    Scanner leerDatos=new Scanner (System.in);
                    
                    File fichero2=new File("estudiantes.txt");
                    FileReader archivor=new FileReader(fichero2);
                    BufferedReader escritura=new BufferedReader(archivor);
                    File fichero3=new File("estudiantes2.txt");
                    FileWriter archivo=new FileWriter(fichero3, true);
                    FileReader archivos=new FileReader(fichero3);
                    BufferedReader escrituras=new BufferedReader(archivos);
                    String busqueda;
       
                    System.out.println("");
                    System.out.println("1.Listar Estudiantes sin notas");
                    System.out.println("2.LIstar Estudiantes con notas");
                    System.out.println("");
                    byte opcion= leerDatos.nextByte();
                    if(opcion==1){
                    
                     while((busqueda=escritura.readLine())!=null)
                    {
                        System.out.println(busqueda);
                        
                    }
                    System.out.println("");
                    
                    }
                    if(opcion==2){
                    while((busqueda=escrituras.readLine())!=null)
                    {
                        System.out.println(busqueda);
                        
                        
                    }
                    System.out.println("");
                    
                    }
 escritura.close();
 escrituras.close();
    }
    /**
     * Funcion listarProfesores()
     * busca los usuraios dentro del archivo
     * @throws IOException llama a los archivos
     */
    public static void listarProfesores() throws IOException{
                    File fichero3=new File("profesores.txt");
                    FileReader archivor=new FileReader(fichero3);
                    BufferedReader escritura=new BufferedReader(archivor);
                    String busqueda;
                    
                    while((busqueda=escritura.readLine())!=null)
                    {
                        System.out.println(busqueda);
                        
                    }
     
                    System.out.println("");
                    escritura.close();
         
     }
   
    /**
     * Funcion o metodo que llama a el menu de estudiantes
     * @Variables
     * opcion: el usuario dice que desea
     * @throws IOException 
     */
     public static void menuEstudiantes() throws IOException{
        Scanner leerDatos=new Scanner (System.in);
        System.out.println("");
        System.out.println("1.Listar Estudiantes");
        System.out.println("2.Agregar Estudiantes");
        System.out.println("3.Eliminar Estudiantes");
        System.out.println("4.Agregar Notas Estudiantes");
        System.out.println("5.Salir");
        System.out.println("");
        byte opcion= leerDatos.nextByte();
        switch (opcion){
            case 1:
                 /*
                Llamado de funcion
                */
                  listarEstudiantes();
                break;
            case 2:
                 /*
                Llamado de funcion
                */
                agregarEstudiantes();  
            break;
            case 3:
                 /*
                Llamado de funcion
                */
                eliminarEstudiantes();
                break;
            case 4:
                 /*
                Llamado de funcion
                */
                buscarEstudiantes();
                break;
        }
    }
    
    /**
     * Funcion o metodo que llama a el menu
     * @throws IOException Llamado a excepciones para manejo de archivos
     */
    public static void menu() throws IOException{
        Scanner leerDatos=new Scanner (System.in);
        byte opcion=0;
        while(opcion!=3){
        System.out.println("1.Informacion Estudiantes");
        System.out.println("2.Informacion Profesores ");
        opcion= leerDatos.nextByte();
        switch (opcion){
            case 1:
                 /*
                Llamado de funcion
                */
                  menuEstudiantes();
                break;
            case 2:
                 /*
                Llamado de funcion
                */
                  menuProfesores();
                break;
        }
        }
    }
    /**
     * @buscarEstudiantes()
     * Funcion creada con el fin de permitir buscar a el estudiante y darle sus notas
     * @Variables:
     * dato: Permite dar a conocer que desea el usuario 
     * variable:Digita la cantidad de notas que quiere el usuario
     * valor:la nota que va a registar
     * int acumulador: acumulador de las notas
       int notas: el valor que envia a el objeto
     */
    public static void buscarEstudiantes()throws IOException{
                    File fichero5=new File("estudiantes2.txt");
                    FileWriter archivo=new FileWriter(fichero5, true);
                    BufferedWriter escritura=new BufferedWriter(archivo);
                    PrintWriter escribe=new PrintWriter(escritura);
           
        Scanner leerDatos=new Scanner (System.in);
        int dato;
        System.out.println("Digite el usuario");
        dato=leerDatos.nextInt();
        while(dato<0 && dato>sumador){
            System.out.println("Digite el usuario");
            dato=leerDatos.nextInt();
        }
        
          int acumulador=0;
        
        Scanner s=new Scanner (System.in);
        System.out.println("Digite la cantidad de notas que desea ingresar");
        int variable=s.nextInt();
        arrayObjetos[dato].calificaciones=new int[variable];
        for (int i=1;i<variable+1;i++){
            System.out.println("digite la nota "+i);
            int valor=s.nextInt();
            while(valor<=0 && valor>5){
                 System.out.println("digite la nota "+i);
                 valor=s.nextInt();
            }
            //calificaciones[i]=valor;
            acumulador=valor+0;
            
        }
        arrayObjetos[dato].notaPromedio=acumulador/variable;
                   
                    for(int i=0;i<sumador;i++){
                        if(dato==i){
                            escribe.println(dato+" "+arrayObjetos[dato].notaPromedio);
                        }
                    }
                   
        
     
    }
    /**
     * @menuProfesores()
     * Funcion creada con el fin de permitir llamar al menu de los profesores
     * Variables:
     * Opcion Permite dar a conocer que desea el usuario 
     */
    public static void menuProfesores()throws IOException{
        Scanner leerDatos=new Scanner (System.in);
        System.out.println("");
        System.out.println("1.Listar Profesores");
        System.out.println("2.Agregar Profesores");
        System.out.println("3.Eliminar Profesores");
        System.out.println("4.Salir");
        System.out.println("");
        byte opcion= leerDatos.nextByte();
        switch (opcion){
            case 1:
                /*
                Llamado de funcion
                */
                  listarProfesores();
                break;
            case 2:
                 /*
                Llamado de funcion
                */
                agregarProfesores();  
            break;
            case 3:
                 /*
                Llamado de funcion
                */
                eliminarProfesores();
                break;
            case 4:
                break;
           
        }
    }
    /**
     * @eliminarEstudiantes()
     * Variables:
     * Opcion Permite dar a conocer que desea el usuario 
     * @throws IOException llamada a los archivos sin try ni catch
     */
    public static void eliminarEstudiantes()throws IOException{
                  System.out.println("Mantenimiento");
         
    }
    /**
     * @eliminarProfesores()
     * Variables:
     * Opcion Permite dar a conocer que desea el usuario 
     * @throws IOException llamada a los archivos sin try ni catch
     */
    
    public static void eliminarProfesores()throws IOException{
                   System.out.println("Mantenimiento");
    }
    
    
    
    }
    
    



