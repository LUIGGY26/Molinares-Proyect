

package bluquemodificado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-Molinares
 */

public class Bluquemodificado
{

    public static void main(String[] args, int i) 
    {
        Scanner entrada = new Scanner(System.in);
        
          
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite un número por favor : "));
        
        for (int i = numero; i >= 3; i--)
        {
          
            System.out.println("El número de pasadas es : " + i);
        
        }
        
    }
}
            
                
