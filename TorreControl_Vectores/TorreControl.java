
package torrecontrol;

import java.util.Scanner;

public class TorreControl {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        Vuelo[] vectorVuelos = new Vuelo[5];
        Aerolinea[] vecAerolinea = new Aerolinea[5];
        Validacion validacion = new Validacion();
        // variables para los objetos tipo vuelo
        String codVuelo, nombreAerolinea;
        double altitud;
        int cantidadCombustible;
       // variables para los objetos tipo Aerolinea
           String codAerolinea = " ";
           String nombre = " ";
           String pais = " ";
           String tipoAerolinea = " ";  
           
        
        // llenar el vector de Aerolineas
           for (int i = 0; i < vecAerolinea.length; i++) 
           {
               System.out.println("--- Ingrese datos de la Aerolinea " + (i + 1) + " ---");
               System.out.println("ingrese codAerolinea: ");
               codAerolinea = sc.nextLine();
               System.out.println("ingrese nombre Aerolinea: ");
               nombre = sc.nextLine();
               System.out.println("ingrese pais Aerolinea: ");
               pais = sc.nextLine();
               System.out.println("ingrese tipo Aerolinea: 1. Carga 2. Comercial 3. Privado");
               tipoAerolinea = validacion.tipoAerolinea(tipoAerolinea);
               
           }
        // llenar el vector de Vuelos
        for (int i = 0; i < vectorVuelos.length; i++) {
            System.out.println("--- Ingrese datos del vuelo " + (i + 1) + " ---");

            System.out.print("Código del vuelo: ");
            codVuelo = sc.nextLine();

            System.out.print("Codigo de la Aerolínea: ");
            codAerolinea = sc.nextLine();

            System.out.print("Altitud: ");
            altitud = Double.parseDouble(sc.nextLine());

            System.out.print("Combustible restante (min): ");
            cantidadCombustible = Integer.parseInt(sc.nextLine());

            // se almacena el objeto en la posición i del vector tipo Vuelo
            vectorVuelos[i] = new Vuelo(codVuelo, codAerolinea, altitud, cantidadCombustible);
        }

        System.out.println();

        // mostrar todos los objetos almacenados en el vector
        for (int i = 0; i < vectorVuelos.length; i++) 
        {
            System.out.println(vectorVuelos[i].toString());
        }
        System.out.println("Mayor Altitud de un vuelo es: "+ mayorAltitud(vectorVuelos));  
        promedioCombustible(vectorVuelos);
        sc.close();
    }
    
    public static double mayorAltitud(Vuelo[] vec)
    {
     double myAltitud = vec[0].getAltitud();
      for (int i = 1; i < vec.length; i++) 
        {
          if(vec[i].getAltitud() > myAltitud)
          {
            myAltitud = vec[i].getAltitud();
          }  
        }  
     return myAltitud;     
    }      
    
    public static void promedioCombustible(Vuelo[] vec)
    {
       double acumuladorCombustible = 0;
      for(int i = 0; i < vec.length; i++) 
        {
          acumuladorCombustible +=vec[i].getCantidadCombustible();
        }
        System.out.println("el promedio de combustible de los vuelos es: "+ acumuladorCombustible/vec.length);
    }       
}
