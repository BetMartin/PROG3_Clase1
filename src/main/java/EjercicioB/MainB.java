package EjercicioB;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainB {
    public static void main(String[] args) {

        //CREO EMPLEADO FIJO

        Empleado empleado1=new Empleado();
        empleado1.setNombre("Enzo Ibarra");
        empleado1.setCuit(2384);
        empleado1.setDomicilio("Terrada 7421 carrodilla, lujan");
        empleado1.setEmail("Ibarraenzo139002@gmail.com");

// CREO UN REGIMEN DE HORARIO

        RegimenHorario regimen=new RegimenHorario();
        regimen.setHoraIngreso(7);
        regimen.setMinutoIngreso(30);
        regimen.setHoraEgreso(15);
        regimen.setMinutoEgreso(30);

        empleado1.setRegimen(regimen);

// CARGO DOS ASISTENCIAS EN SEPTIEMBRE (UNA A HORARIO Y UNA TARDE)

        ArrayList<Asistencia>asistencias=new ArrayList<>();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2024, Calendar.SEPTEMBER, 13, 7, 30);  // 13 de Septiembre de 2024, 7:30 AM
        Date fecha1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2024, Calendar.SEPTEMBER, 14, 7, 50);  // 14 de Septiembre de 2024, 7:50 AM
        Date fecha2 = cal2.getTime();

        Asistencia asistencia1 = new Asistencia("presente", 1, fecha1, 7, 30, empleado1);
        Asistencia asistencia2 = new Asistencia("presente", 2, fecha2, 7, 50, empleado1);

        asistencias.add(asistencia1);
        asistencias.add(asistencia2);

        empleado1.setAsistencia(asistencias);

        //PREGUNTO MES Y AÑO QUE QUIERAN CONSULTAR

        String month=JOptionPane.showInputDialog("Ingrese mes de la consulta");
        int mes=Integer.parseInt(month);

        String year= JOptionPane.showInputDialog("Ingrese año de la consulta");
        int anio=Integer.parseInt(year);

        //LLAMO AL PRIMER METODO QUE ME DEVUELVE TODOS LAS ASISTENCIAS DEL MES REQUERIDO

        ArrayList<Asistencia> consultaAsistencias=new ArrayList<>();
        ArrayList<Tardanza> consultaTardanzas=new ArrayList<>();

        consultaAsistencias=empleado1.getAsistenciaXMesXAnio(mes,anio);

        consultaTardanzas=empleado1.getDiasConTardanza(mes,anio);

        // MUESTRO EL CONTENIDO DE LOS ArrayList EN LA CONSOLA

        System.out.println("Asistencias del mes " + mes + " y año " + anio + ":");
        for (Asistencia asistencia : consultaAsistencias) {
            System.out.println("Fecha: " + asistencia.getFecha() + ", Hora: " + asistencia.getHora() + ":" + asistencia.getMinuto() + ", Tipo: " + asistencia.getTipo());
        }

        System.out.println("\nTardanzas del mes " + mes + " y año " + anio + ":");
        for (Tardanza tardanza : consultaTardanzas) {
            System.out.println("Fecha: " + tardanza.getFecha() + ", Hora: " + tardanza.getHora() + ":" + tardanza.getMinuto() + ", Tipo: " + tardanza.getTipo());
        }

    }
}
