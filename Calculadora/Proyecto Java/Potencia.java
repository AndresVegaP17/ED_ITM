
package appcalculadora;

public class Potencia extends Operacion 
{
  public Potencia(double n1, double n2) 
  { 
   super(n1, n2); 
  }
  @Override
  public double calcular() 
  { 
   return Math.pow(num1, num2); 
  }    
}
