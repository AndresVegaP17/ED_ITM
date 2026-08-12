
package appcalculadora;

public class Resta extends Operacion
{
  public Resta(double n1, double n2) 
  { 
      super(n1, n2); 
  }
 @Override
 public double calcular() 
  { 
   return num1 - num2; 
  }  
    
}
