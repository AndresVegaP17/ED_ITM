
package appcalculadora;

public class Multiplicacion extends Operacion
{
   public Multiplicacion(double n1, double n2)
    { 
     super(n1, n2); 
    }
    @Override
    public double calcular() 
    { 
     return num1 * num2; 
    }    
}
