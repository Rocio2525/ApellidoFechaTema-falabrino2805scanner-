
package boletin;

import java.util.Scanner;
public class Boletin {

    
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
       String nombre="";
       System.out.println("ingrese NOMBRE DEL ESTUDIANTE:");
        nombre= leer.next();
         
       
        String fec_n="";
         System.out.println("ingrese Fecha de Nacimiento: ");
        fec_n = leer.next();
        
        int DNI = 0;
        System.out.println("ingrese DNI"); 
        DNI = leer.nextInt();
       
       
      
        
        System.out.print("Ingrese el número de Materias que desea cargar al boletín :");
        int materias1 = leer.nextInt();
        
        String materias[] = new String [materias1];
        int notas [][] = new int [materias1][3];
        int nota = notas[0].length; 
        double  promedios[] = new double[materias1];
          
        
        //solicitar nombre de las materias 
        for (int i=0;i<materias1;i++){
            System.out.println(+ (i+1) + "  " + materias1 + "  Nombre de la Materia : ");
            materias[i]=leer.next();
                 
        //solicitar materias 
        for(int j=0;j<nota;j++){
            do{
            System.out.print((j+1)+"  Ingrese la nota:  ");
            notas[i][j]= leer.nextInt();
            }while(notas[i][j]<=0 || notas[i][j]>10);
            promedios[i]+= notas [i][j] ;
        }
            promedios[i]/=3;
        }
        
        //funcion hacer una funcion 
        
       System.out.println("----BOLETÍN DEL ESTUDIANTE----");
        System.out.println("Nombre del Estudiante" + nombre);
        System.out.println("Fecha de Nacimiento  " + fec_n);
        System.out.println("DNI                  " + DNI);    
         System.out.println("-----------------------------");
        
        //imprimir notas y promedio
        for(int i=0;i<materias1;i++){
            System.out.println("   "+materias[i]+ "   ");
            for (int j=0;j<nota;j++){
            System.out.println(" "+(j+1)+"= "+notas[i][j]+" " );
            }
        System.out.println("--------------------------------------------");
        System.out.println("Promedio: " +Math.round(promedios[i]));
        
        System.out.println("---------------------------------------------");
     
    }
    
}
}