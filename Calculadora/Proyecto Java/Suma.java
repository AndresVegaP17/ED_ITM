/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcalculadora;

/**
 *
 * @author miguelmanosalva
 */
public class Suma extends Operacion
{
   public Suma(double n1, double n2) 
   { 
    super(n1, n2); 
   }
    @Override
   public double calcular() 
   { 
    return num1 + num2; 
   }   
    
}
