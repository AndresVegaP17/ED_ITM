
package pr_estudiante;

import java.util.Scanner;

public class AppEstudiante 
{

    public static void main(String[] args) 
    {
      int sw = 1;  
      Scanner sc = new Scanner(System.in);
      Estudiante e = new Estudiante();
      ListaSimple lista = new ListaSimple();
      while(sw == 1)
      {
       lista.insertarNodoPorInicio(e.leerDatos());
       System.out.println("Desea ingresar otro elemento a la lista: 1-Si 2-No");
       sw = sc.nextInt();
      }   
      
      lista.listarNodos();
     
    }
    
}
