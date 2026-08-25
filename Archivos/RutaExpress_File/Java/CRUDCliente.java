
package RutaExpress;

public class CRUDCliente 
{
  public Cliente[] leerCliente()
    {
        int cl = contadorLineas("DatosClientes.txt");
        Cliente vecC[];
        vecC = new Cliente[cl];
        String registro;
        String vec[];
        vec = new String[3];
       try
        {
           int i = 0;
            while(cl>0)
            {
              registro = buffer.readLine();
              String separador = Pattern.quote("|");
               //  private String tipoDoc, numDoc,estadoCivil,lugarNacimiento,nombreAcudiente, telAcudiente;
               //  private int estrato;
              vec = registro.split(separador);
               String cedula = vec[0];
               String nombre = vec[1];
               String telefono = vec[2];
               Cliente objC = new Cliente (cedula,nombre,telefono);
               vecC[i] = objC;
               i++;
               cl--;  
            }
         buffer.close();   
        }
        catch(Exception objException)
        {
         objException.getMessage();          
        }
        return vecC;
    }
   
    
}
