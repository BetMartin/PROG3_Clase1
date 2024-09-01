package EjercicioD;

import java.util.ArrayList;
import java.util.List;

public class Barrio {
    private long id;
    private String nombre;
    private String empresaConstructora;

    // Se inicia variable de tipo coleccion ( de viviendas )
    List<Vivienda> listaViviendas = new ArrayList();

    //Constructor
    public Barrio(long id, String nombre, String empresaConstructora) {
        this.id = id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
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
    public String getEmpresaConstructora() {
        return empresaConstructora;
    }
    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }

    // Metodo que retorna el total de metros del terreno del barrio
    // (teniendo en cuenta la totalidad de viviendas asociadas al mismo)
    public double getSuperficieTotalTerreno(){
        double superficieTotal = 0;
        // Iterar sobre cada vivienda en la lista de viviendas del barrio
        for(Vivienda vivienda: listaViviendas){
            superficieTotal+= vivienda.getSuperficieTerreno();
        }
        return superficieTotal;
    }

    // Metodo que retorne los metros cuadrados cubiertos del barrio,
    // sumando la totalidad de metros cuadrados cubiertos de las viviendas.
    public double getSuperficieTotalCubierta(){
        double superficieTotalCubierta = 0;
        // Iterar sobre cada vivienda en la lista de viviendas del barrio
        for(Vivienda vivienda: listaViviendas){
            superficieTotalCubierta+=vivienda.getMetrosCuadradosCubiertos();
        }
        return superficieTotalCubierta;
    }

    // Metodo para agregar viviendas
    public void agregarVivienda(Vivienda vivienda) {
        listaViviendas.add(vivienda);
    }

    // Metodo para mostrar los datos del barrio
    public void mostrarBarrio() {
        System.out.println("Barrio ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Empresa Constructora: " + empresaConstructora);
        System.out.println("Viviendas:");

        for (Vivienda vivienda : listaViviendas) {
            vivienda.mostrarVivienda(); // Mostrar detalles de cada vivienda
        }

        System.out.println();
    }

}
