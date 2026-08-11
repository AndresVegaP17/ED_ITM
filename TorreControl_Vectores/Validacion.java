
package torrecontrol;
import java.util.Scanner;

public class Validacion 
{
    
 public Validacion()
 {
     
 }
 
 public String tipoAerolinea(String tipo)
 {
  int opcion = Integer.parseInt(tipo);
  Scanner sc = new Scanner(System.in);
  while(opcion< 1 && opcion > 3)
  {
      System.out.println("valor ingresado no está en el rango, favor ingresar nuevamente un valor");
      System.out.println("1. Carga 2. Comercial 3. Privado");
      opcion = sc.nextInt();
  }   
   if(opcion == 1)
   {
     return "Carga";   
   }   
   else if (opcion == 2)
   {
     return "Comercial";   
   }   
   else 
      return "Privado";
 }       
          
         
}
