package EjercicioC;

import EjercicioA.Expediente;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private int numero;
    private String denominacion;
    private String tipo;
    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<Sector> subsectores = new ArrayList<>();

    // Constructor
    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Sector> getSubsectores() {
        return subsectores;
    }

    public void setSubsectores(ArrayList<Sector> subsectores) {
        this.subsectores = subsectores;
    }

    // Método para agregar personas al sector
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Método para agregar subsectores al sector
    public void agregarSubsector(Sector subsector) {
        subsectores.add(subsector);
    }

    // Método recursivo para obtener todos los subsectores
    public ArrayList<Sector> obtenerTodosLosSubsectores() {
        ArrayList<Sector> totalSubsectores = new ArrayList<>(subsectores);
        for (Sector subsector : subsectores) {
            totalSubsectores.addAll(subsector.obtenerTodosLosSubsectores());
        }
        return totalSubsectores;
    }

    // Nuevo método para devolver los datos de los subsectores
    public ArrayList<String> obtenerDatosSubsectores() {
        ArrayList<String> datosSubsectores = new ArrayList<>();
        for (Sector subsector : subsectores) {
            String datos = "Número: " + subsector.getNumero() + ", Denominación: " + subsector.getDenominacion() + ", Tipo: " + subsector.getTipo();
            datosSubsectores.add(datos);
            // Llamada recursiva para obtener los datos de los sub-subsectores
            datosSubsectores.addAll(subsector.obtenerDatosSubsectores());
        }
        return datosSubsectores;
    }
}
