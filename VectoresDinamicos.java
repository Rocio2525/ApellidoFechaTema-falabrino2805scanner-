/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.dinamicos;

import java.util.Scanner;
public class VectoresDinamicos {
  
       
    
    public static void main(String[] args) {
        
      
       
         
     Scanner leer= new Scanner(System.in);
   
   String[] nombres = new String[5];
       
      for(int i=0; i<nombres.length;i++){
      System.out.println("Ingrese un "+(i+1)+" Nombre ");
      nombres[i]=leer.nextLine();
     }
        
        System.out.println("Nombre" + nombres[0] + " " );
        System.out.println("Nombre " + nombres[1] + " ");
        System.out.println("Nombre " + nombres[2] + " ");
        System.out.println("Nombre " + nombres[3] + " ");
        System.out.println("Nombre " + nombres[4] + " ");  
        
        int Edad[] = new int[5];

        for (int i = 0; i < Edad.length; i++) {
            System.out.println("Ingrese la "+(i+1)+" Edad ");

           
            Edad[i]=leer.nextInt();

        }
        System.out.println("Edad " + Edad[0]);
        System.out.println("Edad " + Edad[1]);
        System.out.println("Edad " + Edad[2]);
        System.out.println("Edad " + Edad[3]);
        System.out.println("Edad " + Edad[4]);
 
        String sexo[] = new String[5];

        for (int i = 0; i < sexo.length; i++) {
            System.out.println("Ingrese el Sexo " + (i + 1) + "  ");

            sexo[i] = leer.next();

            System.out.println("Sexo " + sexo[0]);
            System.out.println("Sexo " + sexo[1]);
            System.out.println("Sexo " + sexo[2]);
            System.out.println("Sexo " + sexo[3]);
            System.out.println("Sexo " + sexo[4]);

          
        }
        
        
        
        
    }
}
    

