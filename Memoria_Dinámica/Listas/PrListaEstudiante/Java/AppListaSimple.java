
package pr_listasimple;

public class AppListaSimple {
  
    public static void main(String[] args) 
    {
       ListaSimple lista = new ListaSimple();
       lista.insertarNodoPorFinal(10);
       lista.insertarNodoPorFinal(20);
       lista.insertarNodoPorInicio(5);
       lista.listarNodos();
       System.out.println("******************************************");
       lista.eliminarEnd();
       System.out.println("******************Elimina End************************");
       lista.listarNodos();
       System.out.println("******************Elimina Start************************");
       lista.eliminarStart();
       lista.listarNodos();
    }
    
}
