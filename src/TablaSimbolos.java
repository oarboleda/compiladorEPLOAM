/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oarboleda
 */
import java.util.*;

public class TablaSimbolos{
     HashMap t;

     public TablaSimbolos(){
         t = new HashMap();
     }

     public Simbolo insertar(String nombre, char tipo){
         Simbolo s = new Simbolo(nombre, tipo);
         t.put(nombre, s);
         return s;
     }

     public void eliminar(Object dato){
         t.remove(dato);
     }

     public Simbolo buscar(String nombre){
         return (Simbolo)(t.get(nombre));
     }

     public void imprimir(){
         Iterator it = t.values().iterator();
         while(it.hasNext()){
             Simbolo s = (Simbolo)it.next();
             System.out.print(s.nombre + ":");
             switch( s.tipo ){
                 case 'e' : System.out.println("e - entero");
                            break;
                 case 'r' : System.out.println("r - real");
                            break;
                 case 'c' : System.out.println("c - caracter");
                            break;
                 case 'b' : System.out.println("b - booleano");
                            break;
                 case 's' : System.out.println("s - cadena");
                 default  : System.out.println("i - indefinido");
             }
         }
     }
 }
