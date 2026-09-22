public class Ticket {

    private char idServicio;
    private String nombreServicio;
    private double valorServicio;

    public Ticket(char idServicio, String nombreServicio, double valorServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.valorServicio = valorServicio;
    }

    public char getIdServicio() {
        return idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }
