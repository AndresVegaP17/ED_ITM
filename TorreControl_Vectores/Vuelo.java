
package torrecontrol;

public class Vuelo 
{
    private String codVuelo = " ";
    private String codAerolinea = " ";
    private double altitud = 0;
    private int cantidadCombustible = 0;

    public Vuelo() 
    {
    }

    public Vuelo(String codVuelo, String codAerolinea, double altitud, int cantidadCombustible) {
        this.codVuelo = codVuelo;
        this.codAerolinea = codAerolinea;
        this.altitud = altitud;
        this.cantidadCombustible = cantidadCombustible;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setcodAerolinea(String codAerolinea) {
        this.codAerolinea = codAerolinea;
    }

    public String getcodAerolinea() {
        return codAerolinea;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public int getCantidadCombustible() {
        return cantidadCombustible ;
    }


    public String toString() {
        return "Vuelo { codVuelo: " + codVuelo + ", codAerolinea: " + codAerolinea +
                ", altitud: " + altitud + ", cantidadCombustible: " + cantidadCombustible + " }";
    }   
}
