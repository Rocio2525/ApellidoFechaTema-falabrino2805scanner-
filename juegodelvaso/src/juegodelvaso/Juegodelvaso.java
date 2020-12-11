/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelvaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Juegodelvaso {

    static String[] jugadores;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------Bienvenido al juego del vaso ------------");
        System.out.print("¿Cuantos jugadores serán?: ");
        int n = Integer.parseInt(leer.nextLine());
        jugadores = new String[n];
        String nombrejugador1 = "";
        System.out.println("Nombre del primer jugador:     ");
        nombrejugador1 = leer.next();

        Random rd = new Random();
        int pelotitas = rd.nextInt(3);
        ImageIcon muyBien = new ImageIcon("src/imagenes/muybien.png");
        ImageIcon perdiste = new ImageIcon("src/imagenes/mal.png");
        ImageIcon Icono = new ImageIcon("src/imagenes/juego.png");
        JOptionPane.showMessageDialog(null, "", "juego del vaso ", JOptionPane.INFORMATION_MESSAGE, Icono);
        int encontrar = JOptionPane.showOptionDialog(null, "¿Dónde esta la pelotita escondida", "juego del vaso", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Vaso 1", "Vaso 2", "Vaso 3"}, "Vaso 1");
         do {
        if (pelotitas == encontrar) {
            JOptionPane.showMessageDialog(null, "muyBien", "juego del vaso", JOptionPane.INFORMATION_MESSAGE, muyBien);
            System.out.println("GANASTE " + muyBien);
        } else {
            JOptionPane.showMessageDialog(null, "perdiste", "juego del vaso", JOptionPane.INFORMATION_MESSAGE, perdiste);
            System.out.println("PERDISTE " + perdiste);}
        } while (JOptionPane.showConfirmDialog(null, "¿Desea repetir el proceso?" ,
            null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION);
         
            
        

         System.out.println("Nombre del segundo jugador:     ");
        String nombrejugador2 = "";
        nombrejugador2 = leer.next();
        JOptionPane.showMessageDialog(null, "", "juego del vaso ", JOptionPane.INFORMATION_MESSAGE, Icono);
        int encontrar2 = JOptionPane.showOptionDialog(null, "¿Dónde esta la pelotita escondida", "juego del vaso", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Vaso 1", "Vaso 2", "Vaso 3"}, "Vaso 1");
         do{
        if (pelotitas == encontrar2) {
            JOptionPane.showMessageDialog(null, "muyBien", "juego del vaso", JOptionPane.INFORMATION_MESSAGE, muyBien);
            System.out.println("GANASTE " + muyBien);
        } else {
            JOptionPane.showMessageDialog(null, "perdiste", "juego del vaso", JOptionPane.INFORMATION_MESSAGE, perdiste);
            System.out.println("PERDISTE " + perdiste);
        }
        } while (JOptionPane.showConfirmDialog(null, "¿Desea repetir el proceso?",
            null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION);
         

    }

}
