package EjercicioD;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
    private long id;
    private String calle;
    private int numeroCalle;
    private double superficieTerreno;

    // Se inicia variable de tipo coleccion ( de habitaciones )
    List<Habitacion> listaHabitaciones = new ArrayList();

    // Construcor
    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
    }

    //Getters y setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumeroCalle() {
        return numeroCalle;
    }
    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }
    public double getSuperficieTerreno() {
        return superficieTerreno;
    }
    public void setSuperficieTerreno(double superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }

    // Metodo que retorna el total de metros cuadrados de la vivienda,
    // teniendo en cuenta la cantidad de habitaciones asociadas
    public double getMetrosCuadradosCubiertos(){
        double metrosCuadradosTotal = 0;
        // Iterar sobre cada habitacion en la lista de habitaciones de la vivienda
        for(Habitacion habitaciones : listaHabitaciones){
            metrosCuadradosTotal += habitaciones.getMetrosCuadrados();
        }
        // Valida que el valor obtenido no sea mayor que la superficie del terreno
        if(metrosCuadradosTotal > Vivienda.this.superficieTerreno){
            throw new IllegalArgumentException("La superficie cubierta no\n" +
                    "puede ser mayor a la superficie del terreno");
        }
        return metrosCuadradosTotal;
    }

    // Metodo para agregar habitacion a vivienda
    public void agregarHabitacion(Habitacion habitacion){
        listaHabitaciones.add(habitacion);
    }

    // Metodo para mostrar los datos de la vivienda
    public void mostrarVivienda() {
        System.out.println("Vivienda ID: " + id);
        System.out.println("Calle: " + calle);
        System.out.println("Número de Calle: " + numeroCalle);
        System.out.println("Superficie del Terreno: " + superficieTerreno);
        System.out.println("Habitaciones:");

        for (Habitacion habitacion : listaHabitaciones) {
            habitacion.mostrarHabitacion(); // Mostrar detalles de cada habitación
        }

        System.out.println();
    }


}
