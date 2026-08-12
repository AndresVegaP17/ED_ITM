
package appcalculadora;

public class Division extends Operacion
{
    public Division(double n1, double n2)
     { 
      super(n1, n2); 
     }
    @Override
    public double calcular() 
     {
        if (num2 == 0)
        {
         System.out.println("Error: División por cero.");
         return 0;
        }
        return num1 / num2;
    }    
    
}
