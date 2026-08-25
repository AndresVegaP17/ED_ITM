
package RutaExpress;

public class CRUDCliente 
{
  public CRUDCliente()
  {
  }
  public void ingresarRegistro(Archivo arch, String cc)
   {
      //  1. abrir archivo mode Escritura
       arch.abrirModoEscritura("DatosClientes.txt");
       int cl = arch.contadorLineas("DatosClientes.txt");
       Cliente[] vecC =  new Cliente[cl];
       vecC = arch.leerCliente();
       int i = 0;
       boolean sw = false;
       while(i<cl)
       {
        if(cc.equalsIgnoreCase(vecC[i].obtenerCedula()))
        {
          sw = true;
          break;
        }   
        i++;
       }    
       if(!sw)
       {  
        // 2. crear el objeto que vamos a guardar
         Cliente c = new Cliente();
         c = c.ingresarDatos(cc);
        //3. escribir en el archivo
         String registro = c.toString();
         arch.escribir(registro);
        //4. cerrar el archivo en modo EScritura
         arch.cerrarModoEscritura();
       }
       else
       {
           System.out.println("Cedula ya existe en el archivo");   
       }
   }
}   
