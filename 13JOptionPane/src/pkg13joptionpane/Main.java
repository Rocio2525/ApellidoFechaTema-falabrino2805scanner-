
 
package pkg13joptionpane;

import javax.swing.JOptionPane;
public class Main {

   
    public static void main(String[] args) {
      
    
 
        String MARCA;
        int ANIO;
        int CUOTAFINAL = 0;
        String [] ALTAGAMA = {"AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI"};
        String [] FN2187  = {" ","AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI","FORD","FIAT","VW","RENAULT"};
            
            
 Object MARCA66 = JOptionPane.showInputDialog(null,"Por favor seleccione la marca de su vehiculo","Seguros CFP36",JOptionPane.QUESTION_MESSAGE,null,FN2187,FN2187[0]);
                       
            
      ANIO = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el año de fabricación","Seguros CFP36",JOptionPane.WARNING_MESSAGE));
                        
          
     boolean GAMA = BUSCARGAMA(ALTAGAMA, MARCA66);
         
            
            if (GAMA){
                CUOTAFINAL = 1800;
            }else {
                CUOTAFINAL = 900;           
            }
            
            
            int CUOTAANIO = BUSCARANIO(ANIO);
            
            
            CUOTAFINAL = CUOTAFINAL + CUOTAANIO; 
                      
            
            JOptionPane.showMessageDialog(null,"El valor de la cuota es :  $  " + CUOTAFINAL ,"Seguros CFP36",JOptionPane.INFORMATION_MESSAGE);
                  }
    
    public static boolean BUSCARGAMA(String [] ALTAGAMA, Object MARCA66){
        for (String MARCA2 : ALTAGAMA){
            if (MARCA2.equals(MARCA66)){
                return true;
            }        
        }
        return false;
    }
    public static int BUSCARANIO(int ANIO){
        int cuota = 0;
        if(ANIO>=1990 && ANIO<=1999){
            cuota = 480;
        }else
        if (ANIO>=2000 && ANIO<=2010){
            cuota = 780;                  
        }else 
        if (ANIO>=2011 && ANIO<=2016){
            cuota = 950;
        }else
        if  (ANIO>=2017 && ANIO<=2020){
            cuota = 1200;
        }
        return cuota;    
        
    }
    
}
