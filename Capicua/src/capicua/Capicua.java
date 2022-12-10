/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-Molinares
 */
public class Capicua
{
   public static void main(String [] args)
   {

      Scanner entrada = new Scanner(System.in);
      int  N, aux, inverso = 0, cifra;
      
      do
      {
         // Este metodo es muy lindo y se utiliza para abrir una ventana  de emergente.
       
          N = Integer.parseInt(JOptionPane.showInputDialog(" Digite un numero para verificar si es Capicua.")); 
      
           // esta forma es  por  consola            

           // System.out.print("Digite un numero  por favor : "); 
           // N = entrada.nextInt(); 
         
        } while (N < 10);
      
        // Le damos la vuelta al numero
       
        aux = N;
        while (aux != 0)
        {
            cifra = aux % 10;
            inverso = ((inverso * 10) + cifra);
            aux = aux / 10;
        }
    
        if(N == inverso)
        {
            // System.out.println(" El numero " + inverso + " Es capicua. ");
            JOptionPane.showMessageDialog(null," El numero " + inverso + " Es capicua. ");
            
        }
        else
        {
            // System.out.println(" El nmero " + inverso + " No es capicua. ");
            JOptionPane.showMessageDialog(null," El nmero " + inverso + " No es capicua. ");
            
        }
    }
}

