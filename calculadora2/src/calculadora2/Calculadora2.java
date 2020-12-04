
package calculadora2;
import javax.swing.JOptionPane;

public class Calculadora2 {

    
    public static void main(String[] args) {
        int operacion;
        double a, b, resultado;
        do {
            a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
            operacion = JOptionPane.showOptionDialog(null, "Seleccione el valor de operacion.",
                "CALCULADORA", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Suma", "Resta", "Multiplicacion", "Division"}, null) + 1;
            resultado=0;
            if(operacion==1)
                resultado=a+b;
            if(operacion==2)
                resultado=a-b;
            if(operacion==3)
                resultado=a*b;
            if(operacion==4&&b!=0)
                resultado=a/b;
            JOptionPane.showMessageDialog(null,
                " resultado: " + resultado);
        } while (JOptionPane.showConfirmDialog(null, "¿Desea repetir el proceso?",
            null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION);
    }
    }
    

