package EjercicioPartB;

public class Persona {
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private long dni;
    private Domicilio domicilio;

    // Constructor
    public Persona(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    // Getters y Setters
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getId() {
        return dni;
    }
    public void setId(long id) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    @Override
    public String toString() {
        return "\nNombre=" + nombre + "\nApellido=" + apellido + "\nDni=" + dni + "\nDomicilio=" + domicilio.toString();
    }

}
