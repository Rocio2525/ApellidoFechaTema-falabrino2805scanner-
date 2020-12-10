/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguroautomotor;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class SeguroAutomotor {

    public static void main(String[] args) {

        String NombreApellido = "";
        String telefono, Email = "";
        String adicional;
        int adicional1 = 0;

        ImageIcon logo = new ImageIcon("src/imagen/logo.png");

        JOptionPane.showMessageDialog(null, "", "BIENVENIDO AL SEGURO DE AUTOS ", JOptionPane.INFORMATION_MESSAGE, logo);
        NombreApellido = JOptionPane.showInputDialog("Por favor Ingrese Nombre Apellido:  ");
        telefono = JOptionPane.showInputDialog("Número de telefono");
        Email = JOptionPane.showInputDialog(" ingrese su E-mail");
        /*3)	Datos del vehículo
a.	Marca, utilizar un JOption combobox a un vector
b.	Modelo , JOPtion input
c.	Dominio, JOPtion input
d.	Años de antigüedad, JOPtion input */

        String[] marcas = {"", "Chevrolet", "Ford", "Fiat", "Renault"};
        String[] Chevrolet = {"Camaro", "Captiva.", "Onix Plus", "Orlando", "Otro"};
        String[] Ford = {"Fiesta", "Falcon", "Ka", "Focus"};
        String[] Fiat = {"1500", "Palio", "Punto", "Cubo", "Fiorino", "Panda 4x4", "500", "Otro"};
        String[] Renault = {"Clio", "Sandero", "12", "Kwind", "Otro"};
        //Seleccion de marca para el combo(abajo esta la información)
        Object opcion = JOptionPane.showInputDialog(null, "Seleccione una marca de vehiculo", "Mi coche", JOptionPane.QUESTION_MESSAGE, null, marcas, marcas[0]);

        combomodelos(Chevrolet, Ford, Fiat, Renault, opcion);
    }

    //1-Combo modelo 
    private static void combomodelos(String[] Chevrolet, String[] Ford, String[] Fiat, String[] Renault, Object opcion) {
        if (opcion == "") {
            Object chevroletmodelo = JOptionPane.showInputDialog(null, "Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste", "Modelos de  Autos", JOptionPane.QUESTION_MESSAGE, null, Chevrolet, Chevrolet[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + chevroletmodelo);
        }

        if (opcion == "Ford") {
            Object fordmodelo = JOptionPane.showInputDialog(null, "Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste", "Modelos de  Autos", JOptionPane.QUESTION_MESSAGE, null, Ford, Ford[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fordmodelo);
        }
        if (opcion == "Fiat") {
            Object fiatmodelo = JOptionPane.showInputDialog(null, "Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste", "Modelos de  Autos", JOptionPane.QUESTION_MESSAGE, null, Fiat, Fiat[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fiatmodelo);
        }
        if (opcion == "Renault") {
            Object renaultmodelo = JOptionPane.showInputDialog(null, "Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste", "Modelos de  Autos", JOptionPane.QUESTION_MESSAGE, null, Renault, Renault[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + renaultmodelo);
        }

         
        //Pedir dominio DEL AUTO_______________________________________________________// 
        int dominio = 0;

        dominio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dominio :"));
        System.out.println("EL dominioes:" + dominio);

        // pedir antiguedad______________________________________________________// 
        int antigüedad;

        antigüedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antigüedad del auto  :"));
        System.out.println("La Antigüedad :" + antigüedad);

        int cuotaaño = añosdeatiguedad(antigüedad);
        

        //datos para combo cobertura-----------------------------------------//
        int coberturas = 0;
        int montoc = montodec(coberturas);
        
       //Datos para combo cobertura adicional_______________________________//
        int coberturaextra = 0;

        int montoad = montodecobertura(coberturaextra);
        
        int totalcuotas=(montoc+antigüedad+montoad);
        System.out.println("EL total a pagar es :" + totalcuotas);
        JOptionPane.showMessageDialog(null, "El valor total a  :  $  " + totalcuotas, "Cuota ", JOptionPane.INFORMATION_MESSAGE);

            
            
    }


       
     //calcular el monto de la cuota en relación a la antiguedad--------------------------------------//

    public static int añosdeatiguedad(int antigüedad) {
        int cuota = 0;
        if (antigüedad <= 5) {
            cuota = 500;
        } else if (antigüedad >= 5 && antigüedad <= 10) {
            cuota = 1000;
        } else if (antigüedad >= 10 && antigüedad <= 15) {
            cuota = 1500;
        } else if (antigüedad >= 15 && antigüedad <= 20) {
            cuota = 1500;
        } else if (antigüedad >= 20) {
            JOptionPane.showMessageDialog(null, "No se asegura :  $  " + cuota, "Gracias por su consulta ", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "El valor de la cuota es :  $  " + cuota, "Cuota ", JOptionPane.INFORMATION_MESSAGE);
       
       return cuota;
    
    
    //combo cobertura-----------------------------------------------------------------------//
    }
     private static int montodec(int coberturas ) {
        
        
        ImageIcon cobertura1 = new ImageIcon("src/imagen/cobertura.png");
        int seleccion= JOptionPane.showOptionDialog(null, "Seleccione el monto de la  cobertura", "", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, cobertura1,
                new Object[]{"1000","2000","3000"}," 1000");

        
        int montoc=0;
      do { 

        if (seleccion == 1) {
            montoc = 1000;
        } else if (seleccion == 2) {
            montoc = 2000;
        } else if (seleccion == 3) {
            montoc = 3000;
        }
        
       
        
        
        }while(seleccion>3);
       JOptionPane.showMessageDialog(null, "El valor de la cobertura  es :  $  " + montoc, "Cuota ", JOptionPane.INFORMATION_MESSAGE);
       return montoc; 
    }
      
       //seleccionar el tipo de cobertura adicional 
    private static int montodecobertura(int coberturaextra) {
        //COMBO DE LA COBERTURA ADICIONAL -------------------------------------------------
        ImageIcon coberturac = new ImageIcon("src/imagen/adicional.png");
        int seleccion= JOptionPane.showOptionDialog(null, "Seleccione la cobertura adicional", "", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, coberturac,
                new Object[]{"","300","600","900"},"300");
        
        int montot = 0;
        
do{
        if (seleccion == 1) {
            montot = 0;
        } else if (seleccion == 2) {
            montot = 300;
        } else if (seleccion == 3) {
            montot = 600;

        } else if (seleccion == 4) {
            montot = 900;
        }
        
}while(coberturaextra>4); 
    JOptionPane.showMessageDialog(null, "El valor de la cobertura  es :  $  " + montot, "Cuota ", JOptionPane.INFORMATION_MESSAGE);     
return montot;
    

    }
    
  
    //---------------------------------------------------------------------------------------------//
   
    
      
    
}
