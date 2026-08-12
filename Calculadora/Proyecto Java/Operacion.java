
package appcalculadora;

public abstract class  Operacion 
{
  protected double num1;
  protected double num2;

  public Operacion(double num1, double num2) 
  {
   this.num1 = num1;
   this.num2 = num2;
  }

    // Método abstracto: Obliga a cada operación a implementar su propia lógica
  public abstract double calcular();

   // Método concreto: Todas las operaciones pueden mostrar el resultado igual
  public void mostrarResultado() 
  {
        System.out.println("El resultado es: " + calcular());
  }  
    
}
