package EjercicioA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainA {
    public static void main(String[] args) {
        //Creación de expedientes
        Expediente expediente1 = new Expediente(111,"J",1,"Suceción Quiroga","Judicial","Juzgado Civil");
        Expediente expediente2 = new Expediente(112, "L",2,"Contratación Laboral Arcor", "Laboral", "Fuerp Laboral");
        Expediente expediente3 = new Expediente(113, "F",3,"Adopción uniparental Perez", "Minoridad y Familia", "Juzgado de Familia");
        Expediente expediente4 = new Expediente(114, "J", 4, "Inscripcion de usufructo", "Civil","Registro de la Propiedad");
        Expediente expediente5 = new Expediente(115, "J", 5,"Designacion de tutela de persona con Discapacidad", "Minoridad y Familia","Juzgado de Familia");

        //Designacion de control de expedientes
        expediente1.setControlExpediente(new ArrayList<Control>(Arrays.asList(
                new Control(15,"A",true, new EstadoControl(45,true)),
                new Control(24,"B",true, new EstadoControl(21,false)),
                new Control(58,"A",false, new EstadoControl(10,false)))));


        expediente3.setControlExpediente(new ArrayList<Control>(Arrays.asList(
                new Control(45,"H",false, new EstadoControl(15,true)),
                new Control(74,"B",false, new EstadoControl(62,true)),
                new Control(56,"J",false, new EstadoControl(35,true)))));

        expediente4.setControlExpediente(new ArrayList<Control>(Arrays.asList(
                new Control(55,"E",true, new EstadoControl(6,true)),
                new Control(71,"A",false, new EstadoControl(26,true)))));

        expediente5.setControlExpediente(new ArrayList<Control>(Arrays.asList(
                new Control(17,"C",false, new EstadoControl(63,true)),
                new Control(22,"F",false, new EstadoControl(42,false)))));

        //Designación de expedientes asociados
        expediente1.setExpedientesContenidos(new ArrayList<>(Arrays.asList(expediente3,expediente4)));
        expediente3.setExpedientesContenidos(new ArrayList<>(List.of(expediente5)));

        //Mostrar Datos de Expedientes

        System.out.println("\n___________________________________________" +
                "\nCaratula Expediente: " + expediente3.getCaratulaExpedientes()+
                "\nControles Obligatorios: " + expediente3.getControlesObligatorios()+
                "\nEstado: " + expediente3.estadoControlToString()+
                "\nExpedientes Asociados:\n"+expediente3.listaExpedientesContenidosToString());

        System.out.println("\n___________________________________________" +
                "\nCaratula Expediente: " + expediente1.getCaratulaExpedientes()+
                "\nControles Obligatorios: " + expediente1.getControlesObligatorios()+
                "\nEstado: " + expediente1.estadoControlToString()+
                "\nExpedientes Asociados:\n"+expediente1.listaExpedientesContenidosToString());

        System.out.println("\n___________________________________________" +
                "\nCaratula Expediente: " + expediente2.getCaratulaExpedientes()+
                "\nControles Obligatorios: " + expediente2.getControlesObligatorios()+
                "\nEstado: " + expediente2.estadoControlToString()+
                "\nExpedientes Asociados:\n"+expediente2.listaExpedientesContenidosToString());

        System.out.println("\n___________________________________________" +
                "\nCaratula Expediente: " + expediente4.getCaratulaExpedientes()+
                "\nControles Obligatorios: " + expediente4.getControlesObligatorios()+
                "\nEstado: " + expediente4.estadoControlToString()+
                "\nExpedientes Asociados:\n"+expediente4.listaExpedientesContenidosToString());
    }
}
