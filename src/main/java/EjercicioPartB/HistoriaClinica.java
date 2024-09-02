package EjercicioPartB;

import java.util.ArrayList;
import java.util.Date;

public class HistoriaClinica {
    private int idHistoriaClinica;
    private int numero;
    private Date fechaAlto;
    ArrayList<DetalleHistoriaClinica> detallesFicha = new ArrayList<>();
    
    //Constructor
    public HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlto,ArrayList<DetalleHistoriaClinica> detallesFicha) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.numero = numero;
        this.fechaAlto = fechaAlto;
        this.detallesFicha = detallesFicha;
    }
    
    // Getters y Setters
    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }
    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Date getFechaAlto() {
        return fechaAlto;
    }
    public void setFechaAlto(Date fechaAlto) {
        this.fechaAlto = fechaAlto;
    }
    public ArrayList<DetalleHistoriaClinica> getDetallesFicha() {return detallesFicha;}
    public void setDetallesFicha(ArrayList<DetalleHistoriaClinica> detallesFicha) {this.detallesFicha = detallesFicha;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(DetalleHistoriaClinica ficha : detallesFicha){
            sb.append("\n\t").append(ficha.toString());
        }
        return "\nHistoria Clinica: " +
                "\n\tnumero=" + numero +
                "\n\tfechaAlto=" + fechaAlto +
                "\n\t"+ sb.toString();
    }
}
