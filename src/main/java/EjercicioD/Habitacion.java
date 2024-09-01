package EjercicioD;

public class Habitacion {
    private long id;
    private String nombre;
    private long metrosCuadrados;

    // Construcor
    public Habitacion(long id, String nombre, long metrosCuadrados) {
        this.id = id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    //Getters y setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    // Metodo para mostrar los datos de la habitacion
    public void mostrarHabitacion() {
        System.out.println("Habitación ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Metros Cuadrados: " + metrosCuadrados);
        System.out.println();
    }

}
