
package appcalculadora;


public class AppCalculadora 
{
   public static void main(String[] args) 
   {
        Operacion miSuma = new Suma(10, 5);
        Operacion miPotencia = new Potencia(2, 3);
        Operacion miDivision = new Division(20, 3); 

        System.out.print("Suma: ");
        miSuma.mostrarResultado();

        System.out.print("Potencia: ");
        miPotencia.mostrarResultado();

        System.out.print("División: ");
        miDivision.mostrarResultado();   

   }
    
}
