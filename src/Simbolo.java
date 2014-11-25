/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oarboleda
 */
 public class Simbolo{
     String nombre;
     char tipo;
     boolean inicializado;
     
     static char tipoEntero='e';
     static char tipoReal='r';
     static char tipoCaracter='c';
     static char tipoBooleano='b';
     static char tipoCadena='s';
     static char tipoIndefinido='i';

     public Simbolo(String nombre, char tipo){
         this.nombre = nombre;
         this.tipo = tipo;
         this.inicializado = false;
     }

     public void inicializado(){
         this.inicializado = true;
     }
 }
