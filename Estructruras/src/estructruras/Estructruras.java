
package estructruras;

/**
 *
 * @author Luis-Molinares
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Estructruras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite un número por favor : "));

        if (numero == 0) {
            System.out.println("\n El número ingresado es " + numero + " es Neutro. ");

        } else {
            if (numero > 0) {
                System.out.println("\n El número ingresado es " + numero + " es Positivo. ");
            } else {
                System.out.println("El número ingresado es " + numero + " es Negativo. ");
            }
        }

    }
}
