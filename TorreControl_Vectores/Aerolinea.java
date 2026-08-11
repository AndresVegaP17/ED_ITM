
package torrecontrol;

public class Aerolinea 
{
  private String codAerolinea;
  private String nombre;
  private String Pais;
  private String tipoAerolinea;  

    public Aerolinea() {
    }

    public Aerolinea(String codAerolinea, String nombre, String Pais, String tipoAerolinea)
    {
        this.codAerolinea = codAerolinea;
        this.nombre = nombre;
        this.Pais = Pais;
        this.tipoAerolinea = tipoAerolinea;
    }

    public String getCodAerolinea() {
        return codAerolinea;
    }

    public void setCodAerolinea(String codAerolinea) {
        this.codAerolinea = codAerolinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getTipoAerolinea() {
        return tipoAerolinea;
    }

    public void setTipoAerolinea(String tipoAerolinea) {
        this.tipoAerolinea = tipoAerolinea;
    }

    @Override
    public String toString() 
    {
        return "Aerolinea{" + "codAerolinea=" + codAerolinea + ", nombre=" + nombre + ", Pais=" + Pais + ", tipoAerolinea=" + tipoAerolinea + '}';
    }
  
    
  
}
