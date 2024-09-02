package EjercicioPartB;
    
import java.util.Date;

public class Turno {
    
    private int idTurno;
    private Date fecha;
    private int hora; 
    private int minutos;
    private Medico medico;
    private Paciente paciente;

    // Constructor
    public Turno(int idTurno, Date fecha, int hora, int minutos, Medico medico, Paciente paciente) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
        this.medico = medico;
        this.paciente = paciente;
    }

    // Getters y Setters
    public int getIdTurno() {
        return idTurno;
    }
    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {return paciente;}
    public void setPaciente(Paciente paciente) {this.paciente = paciente;}

    @Override
    public String toString() {
        return "Fecha=" + fecha +
                ", hora=" + hora +
                ", minutos=" + minutos +
                "\n\tmedico=" + medico.getNombre() +medico.getApellido()+
                "\n\tpaciente=" + paciente.getNombre() +paciente.getApellido();
    }
}
