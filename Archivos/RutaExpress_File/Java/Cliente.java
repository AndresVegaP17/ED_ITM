package RutaExpress;

public class Cliente {

    private String cedula;
    private String nombre;
    private int telefono;

    public Cliente(String cedula, String nombre, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void asignarCedula(String cedula) {
        this.cedula = cedula;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int obtenerTelefono() {
        return telefono;
    }

    public String convertirCadena() {
        return "Cliente = { cedula: " + cedula + " nombre: " + nombre + " telefono: " + telefono + " } ";
    }
}
