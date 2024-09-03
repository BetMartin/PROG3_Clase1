package EjercicioC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainC {
    public static void main(String[] args) {
        // Crear tipos de actividad con los nuevos atributos
        TipoActividad tipoActividad1 = new TipoActividad(1, "Tipo 1", 10.0);
        TipoActividad tipoActividad2 = new TipoActividad(2, "Tipo 2", 15.0);

        // Crear fechas de inicio y fin
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JANUARY, 1);
        Date fechaInicio1 = cal.getTime();
        cal.set(2023, Calendar.JANUARY, 10);
        Date fechaFin1 = cal.getTime();

        cal.set(2023, Calendar.FEBRUARY, 1);
        Date fechaInicio2 = cal.getTime();
        cal.set(2023, Calendar.FEBRUARY, 10);
        Date fechaFin2 = cal.getTime();

        cal.set(2022, Calendar.MARCH, 1);
        Date fechaInicio3 = cal.getTime();
        cal.set(2022, Calendar.MARCH, 10);
        Date fechaFin3 = cal.getTime();

        // Crear actividades
        Actividad actividad1 = new Actividad(tipoActividad1, fechaInicio1, fechaFin1, "Actividad 1", "Descripción 1");
        Actividad actividad2 = new Actividad(tipoActividad2, fechaInicio2, fechaFin2, "Actividad 2", "Descripción 2");
        Actividad actividad3 = new Actividad(tipoActividad1, fechaInicio3, fechaFin3, "Actividad 3", "Descripción 3");

        // Crear una persona y asignar actividades
        ArrayList<Actividad> actividadesPersona = new ArrayList<>();
        actividadesPersona.add(actividad1);
        actividadesPersona.add(actividad2);
        actividadesPersona.add(actividad3);
        Persona persona = new Persona(actividadesPersona);

        // Mostrar total de puntos asignados
        System.out.println("Total de puntos asignados: " + persona.totalPuntosAsignados());

        // Mostrar total de puntos asignados para un tipo específico de actividad
        System.out.println("Total de puntos asignados para Tipo 1: " + persona.totalPuntosAsignados(tipoActividad1.getCodigo()));

        // Mostrar total de puntos asignados para un tipo específico de actividad en un año específico
        System.out.println("Total de puntos asignados para Tipo 1 en 2023: " + persona.totalPuntosAsignados(tipoActividad1.getCodigo(), 2023));

        // Crear sectores y subsectores
        Sector sectorPrincipal = new Sector(1, "Sector Principal", "Administrativo");
        Sector subsector1 = new Sector(2, "Subsector 1", "Operativo");
        Sector subsector2 = new Sector(3, "Subsector 2", "Operativo");
        Sector subsubsector1 = new Sector(4, "Sub-Subsector 1", "Logística");

        // Crear personas
        Persona persona1 = new Persona(new ArrayList<>());
        Persona persona2 = new Persona(new ArrayList<>());

        // Agregar personas a los sectores
        sectorPrincipal.agregarPersona(persona1);
        subsector1.agregarPersona(persona2);

        // Agregar subsectores al sector principal
        sectorPrincipal.agregarSubsector(subsector1);
        sectorPrincipal.agregarSubsector(subsector2);

        // Agregar sub-subsector al subsector1
        subsector1.agregarSubsector(subsubsector1);

        // Mostrar los datos de los subsectores
        ArrayList<String> datosSubsectores = sectorPrincipal.obtenerDatosSubsectores();
        System.out.println("Datos de los subsectores:");
        for (String datos : datosSubsectores) {
            System.out.println(datos);
        }
    }
}
