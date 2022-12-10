
package fibonacci;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-Molinares
 */
public class Fibonacci
{
   public static void main(String [] args)
   {
      Scanner entrada = new Scanner(System.in);
      int num, fib1,fib2; 
      do
      {
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber su Fibonacci.."));
              
      }while(num <= 1);
        
        // System.out.println("Los " + num + " primeros términos de la serié de Fibonacci son :");
        
        JOptionPane.showMessageDialog(null," Los " + num + " primeros términos de la serié de Fibonacci son :");

        fib1= 0;
        fib2= 1;

         System.out.print(fib1 + " - ");
              
        for(int i = 2; i  <= num ; i++)
        {
             System.out.print(fib2 + " - ");
             fib2 = fib1 + fib2;
             fib1 = fib2 - fib1;
        }
        
        // System.out.println();
    }
}


