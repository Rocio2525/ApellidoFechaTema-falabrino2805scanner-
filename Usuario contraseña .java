
package usuario;
import javax.swing.JOptionPane;

public class Usuariocontraseña {

    public static void main(String[] args) {
      String usuario="rocio";
     String  contraseña="R1234";
    
      
      
      //datos usuario
     
       usuario = JOptionPane.showInputDialog("Ingrese el nombre de Usuario:  ");
        contraseña = JOptionPane.showInputDialog("Ingrese la contraseña " + usuario + " :  ");
        
        
        if(usuario.equals(usuario) && contraseña.equals(contraseña)){
            JOptionPane.showMessageDialog(null,"se ingresa al sistema " + usuario );
            }else {
            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña no es correcta","Error credenciales",JOptionPane.ERROR_MESSAGE);
        
        } 
        
      } 

          
      
    }
    
    
    

