


package encapsuly;

/**
 *
 * @author Luis-Molinares
 */
public class Persona 
{

    // Atributos
    
    private final String Nombre;
    private final int Edad;
    private final String Telefono;
    
    
    // Constructor
     public Persona() 
    {
        
    }
    
    public Persona(String Nombre, int Edad, String Telefono) 
    {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Telefono = Telefono;
    }

    // Metodos Get
    
    public String getNombre() 
    {
        return Nombre;
    }

    public int getEdad() 
    {
        return Edad;
    }

    public String getTelefono() 
    {
        return Telefono;
    }
   
    // Metodos Set  
    
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre; 
    }
    
    public void setEdad(int Edad)
    {
        this.Edad = Edad; 
    }
    
    public void setTelefono(String Telefono)
    {
        this.Telefono = Telefono; 
        
    }

    @Override
    public String toString() 
    {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Telefono=" + Telefono + '}';
    }
        
   
}