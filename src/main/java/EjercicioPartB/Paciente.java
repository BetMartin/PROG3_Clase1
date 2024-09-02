package EjercicioPartB;

import java.util.ArrayList;

public class Paciente extends Persona{
    
    private int idPaciente;
    private int nroSocio;
    
    private HistoriaClinica historiaClinica;
    
   ArrayList<Turno> turnos;
    
    // Constructor


    public Paciente(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idPaciente, int nroSocio) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
    }

    // Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    public int getNroSocio() {
        return nroSocio;
    }
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        return "PACIENTE" +
                super.toString() +
                "\nNroSocio=" + nroSocio +
                historiaClinica.toString();
    }
}
