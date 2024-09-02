package EjercicioPartB;

public class Domicilio {
    private int idDomicilio;
    private String localidad;
    private String calle;
    private int numero;

    // Constructor
    public Domicilio(int idDomicilio, String localidad, String calle, int numero) {
        this.idDomicilio = idDomicilio;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }
    
    // Getters  y Setters
    public int getIdDomicilio() {
        return idDomicilio;
    }
    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString() {
        return calle +" "+numero+", "+ localidad;
    }
}
