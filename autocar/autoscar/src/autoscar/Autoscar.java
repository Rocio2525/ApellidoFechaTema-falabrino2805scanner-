/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoscar;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
public class Autoscar {

    
    public static void main(String[] args) {
        //Carga de Vectores
       
        ImageIcon logo = new ImageIcon("src/imagenes/logo.png");
        

        JOptionPane.showMessageDialog(null, "", "BIENVENIDO AUTOCAR ", JOptionPane.INFORMATION_MESSAGE, logo);
        String[] marcas = {"", "Chevrolet", "Ford", "Fiat", "Renault"};
        String[] Chevrolet = {"Camaro", "Captiva.", "Onix Plus", "Orlando", "Otro"};
        String[] Ford = {"Fiesta", "Falcon", "Ka", "Focus"};
        String[] Fiat = {"1500", "Palio", "Punto", "Cubo", "Fiorino", "Panda 4x4", "500", "Otro"};
        String[] Renault = {"Clio", "Sandero", "12", "Kwind", "Otro"};
        //Seleccion de marca
        Object opcion = JOptionPane.showInputDialog(null, "Seleccione una marca de vehiculo", "Mi coche", JOptionPane.QUESTION_MESSAGE, null, marcas, marcas[0]);

        combomodelos(Chevrolet, Ford, Fiat, Renault, opcion);

       

    }
    //mostrar el combo de los modelos seguin la marca

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
        
       ImageIcon gracias = new ImageIcon("src/imagenes/gracias.png");
        JOptionPane.showMessageDialog(null, "", "BIENVENIDO AUTOCAR ", JOptionPane.INFORMATION_MESSAGE,gracias );
        
        
        
        }}
