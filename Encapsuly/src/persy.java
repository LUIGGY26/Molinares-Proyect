
import encapsuly.Persona;



/**
 *
 * @author Luis-Molinares
 */
public class persy 
{

    public static void main(String[] args) 
    {
        
        Persona p1;
        Persona p2;
        p1 = new Persona();
        p2 = new Persona(Jairo perez, 34, 3201234567);
        
        p1.setNombre(" Cristina Suarez");
        p1.setEdad(45);
        p1.setTelefono("3024567241");
        
        System.out.println("Persona 1. " + p1);
        System.out.print("Persona 2. " + p2);
        
    }
    
}
