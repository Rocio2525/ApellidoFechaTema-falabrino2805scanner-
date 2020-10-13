/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.usuario;

import java.util.Scanner;
public class DATOSUSUARIO {

    public static void main(String[] args) {
     
        String Nombre,Apellido;
        int DNI;
        int Fecha_nacimiento,Edad,año;
        
        //Objeto escaner
       Scanner leer= new Scanner (System.in);
      
       
       //formulario
       System.out.println("-----------Bienvenido----------");
       System.out.println("---Nombre:     ");
       Nombre= leer.next();
       System.out.println("---Apellido:   ");
       Apellido=leer.next();
       System.out.println("---DNI:        ");
       DNI= leer.nextInt();
       System.out.println("-Fecha de nacimiento:  ");
       Fecha_nacimiento=leer.nextInt();
       System.out.println("----Edad               ");
       Edad=leer.nextInt();
       System.out.println("--Año de nacimiento:   ");
       año=leer.nextInt();
       System.out.println("Gracias por completar el formulario");
       System.out.println("-----------------------------------");
       Edad= 2020 - año;
      
       
       //formulario de salida
       System.out.println("----Datos del cliente---");
       System.out.println("---Nombre:"   + Nombre);
       System.out.println("---Apellido:" +Apellido);
       System.out.println("---DNI:"      +    DNI );
       System.out.println("---Edad:"     +    Edad);
       
       //Edad
       if(Edad >18){
       System.out.println("------Es mayor de edad:  SI");
       } else {
       System.out.println("------Es menor de edad: NO");
       }
       System.out.println("-----Que tenga un buen día------");
       System.out.println("-------------------------------------");
    }
    
}
