package cajeroautomatico;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Scanner;

public class Cajeroautomatico {

    /*MÓDULO N°1*/
    public static void main(String[] args) {
     
        String usuario = "rocio";
        String contraseña = "1234";
        int saldo = 90000; //saldo inicial
        int saldod = 500;//saldo inicial en dolares
        String tranfe = "";
        int montotrans = 0;
        int seleccionar=0;
         String sele;
        ImageIcon LOGO = new ImageIcon("src/logo/logo.png");

        JOptionPane.showMessageDialog(null, "", "BIENVENIDO AL BANCO CÓRDOBA ", JOptionPane.INFORMATION_MESSAGE, LOGO);
        //datos usuario
        usuario = JOptionPane.showInputDialog("Ingrese el nombre de Usuario:  ");
        contraseña = JOptionPane.showInputDialog("Ingrese la contraseña " + usuario + " :  ");
        if (usuario.equals(usuario) && contraseña.equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "Se ingresa al sistema " + usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña no es correcta", "Error credenciales", JOptionPane.ERROR_MESSAGE);
        }
       
        
        
        
   do{
        sele = JOptionPane.showInputDialog(null, "1. Saldo \n 2. Transferir \n 3. Retirar \n 4. Cambiar Clave \n 5. Salir");;
        
            seleccionar = Integer.parseInt(sele);
                switch(seleccionar){
                    case 1:
                         verSal(saldo,saldod);
                         break; 
                    case 2:
                         saldo = transDinero(saldo);
                         break;
                    case 3:
                        saldo = retirarDinero(saldo);
                         break;
                    case 4:
                       
                         break;
                    case 5: 
                          JOptionPane.showMessageDialog(null,"","GRACIAS POR VENIR AL BANCO CÓRDOBA",JOptionPane.INFORMATION_MESSAGE);
                         break;
                }    

    }while(seleccionar!=5);
    
    }
     private static void ticketTransf(int saldo, int montoTransf, String CBU) {
            System.out.println("==============================");
            System.out.println("========BANCO DE CÓRDOBA ========");
            System.out.println("==============================");
            System.out.println("==Transferencia a CBU:========");
            System.out.println("======="+CBU+"=======");
            System.out.println("==============================");
            System.out.println("==Monto Transferido:==========");
            System.out.println("==$"+montoTransf+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }


     private static void verSal(int saldo,int saldod ) {
         //metodo para ver el saldo de la cuenta
        System.out.println("=======================================");
        System.out.println("=======     BANCO DE CÓRDOBA    ========");
        System.out.println("=======================================");
        System.out.println("===  Saldo de Cuentas =================");
        System.out.println("=======================================");
        System.out.println("===  Cuenta corriente en pesos     ====");
        System.out.println("=======================================");
        System.out.println("==== $ " +saldo+ "=====================");
        System.out.println("=======================================");
        System.out.println("===  Cuenta corriente en dolares ======");
        System.out.println("=======================================");
        System.out.println("===== $ " +saldod+ "===================");
        System.out.println("=======================================");
    }
    
  //Funcion Ticket de Extraccion
        private static void ticketExt(int saldo, int montoExt) {
            System.out.println("\n\n==============================");
            System.out.println("========BANCO DE CÓRDOBA========");
            System.out.println("==============================");
            System.out.println("==Extracción realizada por:===");
            System.out.println("==$"+montoExt+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }
    /*Módulo 2 */
    public static int transDinero(int saldo) {
        //Declaracion de Variables
        int montoTrans = 0;
        boolean CBUvalido = false;
        String CBU;

        while (CBUvalido == false);

        CBU = JOptionPane.showInputDialog(null, "Ingresar CBU de la cuenta a transferir:", "Ingrese el CBU aquí.");

        if (CBU.length() == 22) {
            CBUvalido = true;
        }

        montoTrans = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a transferir a CBU:\n" + CBU, "Ingrese el monto aquí."));
        while ((saldo <= montoTrans) && (montoTrans > 0));

        saldo = saldo - montoTrans;
        System.out.println(saldo + " | " + montoTrans);
        ticketTransf(saldo, montoTrans, CBU);
        return saldo;
    }

   
    private static int retirarDinero(int saldo) {
        int montoTransf=0; boolean CBUvalido=false; String CBU;
        ImageIcon Icon = new ImageIcon("src/Imagenes/dinero.png");
        int montoExt=0;
        do {
            int seleccion = JOptionPane.showOptionDialog(null,"Sel/*eccione el monto a retirar","Retiro de Efectivo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Icon, 
            new Object []{"200", "500","1000","Otro Importe"},"100" );  
            switch (seleccion) {
                case 0:
                    montoExt=200;
                    break;
                case 1:
                    montoExt=500;
                    break;
                case 2:
                    montoExt=1000;
                    break;
                case 3:
                    montoExt=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a Retirar:","Ingrese el monto aquí."));
                    break;
            }
            if (montoExt>saldo) {
                JOptionPane.showMessageDialog(null,"Por favor, ingrese un monto valido menor a su saldo.\nSu saldo actual es de: $"+saldo,"Retirar Dinero",JOptionPane.WARNING_MESSAGE);
            }
        } while ((montoExt>=saldo)||(montoExt<0));
        saldo = saldo - montoExt;
        ticketExt(saldo,montoExt);
          
        return saldo;
    }
  
    
   }  


