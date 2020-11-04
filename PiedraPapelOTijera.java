
package piedrapapelotijera;
import java.util.Random;
import java.util.Scanner;
public class PiedraPapelOTijera {

    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int jugada_del_ordenador, jugada_del_usuario;
        Random random = new Random();
        System.out.println("------------BIENVENIDO AL JUEGO----------");
        System.out.println("Seleccione el valor de jugada del usuario");
        System.out.println("\t1.- Piedra");
        System.out.println("\t2.- Papel");
        System.out.println("\t3.- Tijera");
        System.out.print("\t: ");
        System.out.println("------------------------------------------");
        do {
            jugada_del_usuario = in.nextInt();
            in.nextLine();
            if (jugada_del_usuario<1||jugada_del_usuario>3)
                System.out.print("Valor incorrecto. Ingreselo nuevamente.: ");
        } while (jugada_del_usuario<1||jugada_del_usuario>3);
        jugada_del_ordenador=1+random.nextInt(3);
        if(jugada_del_ordenador==1)
            System.out.println("La jugada del ordenador es Piedra");
        if(jugada_del_ordenador==2)
            System.out.println("La jugada del ordenador es Papel");
        if(jugada_del_ordenador==3)
            System.out.println("La jugada del ordenador es Tijera");
        if(jugada_del_usuario==jugada_del_ordenador)
            System.out.println("EMPATE");
        if((jugada_del_usuario==1&&jugada_del_ordenador==3)||(jugada_del_usuario==2&&jugada_del_ordenador==1)||(jugada_del_usuario==3&&jugada_del_ordenador==2))
            System.out.println("WINNER");
        if((jugada_del_usuario==3&&jugada_del_ordenador==1)||(jugada_del_usuario==1&&jugada_del_ordenador==2)||(jugada_del_usuario==2&&jugada_del_ordenador==3))
            System.out.println("PERDISTE MI CIELA");
        System.out.println("Valor de jugada del ordenador: " + jugada_del_ordenador);
    }
    }
    


