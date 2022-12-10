
package bluque;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-Molinares
 */
public class Bluque {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, aux = 0, cont = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite otro número por favor : "));

        while (numero >= 3) {
            numero--;
            // aux = aux + numero;
            cont++;

        }
        System.out.println("\n Las pasadas del codigo fueron : " + cont);
        // System.out.println(" El valor del numero es : " + aux );
    }
}
