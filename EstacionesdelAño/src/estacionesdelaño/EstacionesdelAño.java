
package estacionesdelaño;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-Molinares
 */
public class EstacionesdelAño 
{

   
    public static void main(String[] args) 
    {
       
        Scanner entrada = new Scanner(System.in);
        
                
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" Eliga una opción por favor. \n 1. Primavera. \n 2. Verano. \n 3. Otoño. \n 4. Invierno. "));
        
        switch(opcion)
        {
            case 1:
                    System.out.println(" La estacion del año escogida es Primavera");
            break;
          
            case 2:
                    // System.out.println(" La estacion del año escogida es Verano. ");
                    JOptionPane.showMessageDialog(null," La estacion del año escogida es Verano. ");
            break;
          
            case 3:
                    // System.out.println(" La estacion del año escogida es Otoño. ");
                    JOptionPane.showMessageDialog(null, " La estacion del año escogida es Otoño. ");
            break;
          
            case 4:
                     // System.out.println(" La estacion del año escogida es Invierno. ");
                    JOptionPane.showMessageDialog(null, " La estacion del año escogida es Invierno. ");
            break;
            
            default:
                     // System.out.println(" La opción ingresada no es la correcta. " );
                    JOptionPane.showMessageDialog(null, " La opción ingresada no es la correcta. ");
        }
    }
}

        
