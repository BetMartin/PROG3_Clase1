package EjercicioC;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private int numero;
    private String denominacion;
    private String tipo;

    ArrayList<Persona> personas = new ArrayList<Persona>();

    ArrayList<Sector> sectores = new ArrayList<Sector>();

    public Sector(int numero, String denominacion, String tipo, ArrayList<Persona> personas) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
        this.personas = personas;
    }

    public Sector() {
    }

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

    public ArrayList<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }

    public void AgregarSector(Sector sector) {
        this.sectores.add(sector);
    }

    // Método recursivo para obtener todos los subsectores
    public List<Sector> obtenerTotalSubsectores() {
        List<Sector> totalSubsectores = new ArrayList<>();

        // Recorre todos los subsectores directos de este sector
        for (Sector subsector : this.sectores) {
            // Agrega el subsector actual a la lista
            totalSubsectores.add(subsector);

            // Llama recursivamente al método para obtener los sub-subsectores
            totalSubsectores.addAll(subsector.obtenerTotalSubsectores());
        }

        return totalSubsectores;
    }
}
