package EjercicioA;

import java.util.ArrayList;

public class Expediente {
    //Atributos
    private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;
    private ArrayList<Control> controlExpediente=new ArrayList<Control>();
    private ArrayList<Expediente> expedientesContenidos=new ArrayList<Expediente>();

    //Constructor

    public Expediente() {
    }

    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public ArrayList<Control> getControlExpediente() {
        return controlExpediente;
    }

    public void setControlExpediente(ArrayList<Control> controlExpediente) {
        this.controlExpediente = controlExpediente;
    }

    public ArrayList<Expediente> getExpedientesContenidos() {
        return expedientesContenidos;
    }

    public void setExpedientesContenidos(ArrayList<Expediente> expedientesContenidos) {
        this.expedientesContenidos = expedientesContenidos;
    }

    //Métodos
    public String getCaratulaExpedientes() {
        return "Nro: " +getNumero()+" -"+getLetra()+" -"+getDescripcion();
    }


    public String getControlesObligatorios() {
        StringBuilder lista=new StringBuilder();
        for(Control c : getControlExpediente()) {
            if (c.isEsObligatorio()) {
                lista.append(c.getDenominacion() + ", ");
            }
        }
        if(lista.isEmpty()){
            lista.append("NO REGISTRA");
        }else{
            lista.setLength(lista.length()-2);
        }
        return lista.toString();
    }

    public boolean getEstadoControles(){
        boolean estadoControles = true;
        for(Control c: getControlExpediente()){
            if(c.isEsObligatorio() && !c.getEstado().isAprobado()){
                estadoControles = false;
                break;
            }
        }
        return estadoControles;
    }
    public ArrayList<Expediente> listaExpedientesContenidos(){
        ArrayList<Expediente> lista = new ArrayList<>();
        lista = listaRecursivaExpedientes(this,new ArrayList<>());
        lista.remove(0);
        return lista;
    }

    //Método auxiliar recursivo
    public ArrayList<Expediente> listaRecursivaExpedientes (Expediente expediente, ArrayList<Expediente> lista){
        lista.add(expediente);
        for (Expediente exp : expediente.expedientesContenidos) {
            listaRecursivaExpedientes(exp, lista);
        }
        return lista;
    }

    public String listaExpedientesContenidosToString(){
        StringBuilder listaExpedientes = new StringBuilder();
        if(!listaExpedientesContenidos().isEmpty()) {
            for (Expediente exp : listaExpedientesContenidos()) {
                listaExpedientes.append("\t").append(exp.getCaratulaExpedientes()).append("\n");
            }
        }else{
            listaExpedientes.append ("SIN EXPEDIENTES ASOCIADOS");
        }
        return listaExpedientes.toString();
    }

    public String estadoControlToString(){
        String estado;
        if(!getControlesObligatorios().equals("NO REGISTRA")) {
            if(getEstadoControles()){
                estado = "APROBADO";
            } else {
                estado = "NO APROBADO";
            }
        }else{
            estado = "PENDIENTE DE CONTROL";
        }
        return estado;
    }
}