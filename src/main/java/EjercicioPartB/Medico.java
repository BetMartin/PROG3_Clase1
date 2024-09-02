package EjercicioPartB;

import java.util.List;

public class Medico extends Persona{
    
    private int idMedico;
    private int matricula;
    private long celular;
    
    List<Especialidad> especialidades;
    List<Turno> turnos;
    
    // Constructor
    public Medico(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idMedico, int matricula, long celular) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
    }

    // Getters y Setters
    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public long getCelular() {
        return celular;
    }
    public void setCelular(long celular) {
        this.celular = celular;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for(Especialidad especialidad : especialidades){
            sb2.append(especialidad.toString()).append(",");
        }

        return "MEDICO:"+super.toString()+"\nMatricula:"+matricula +"\ncelular=" + celular+ "\nEspecialidad: "+sb2.toString();
    }
    
}
