package EjercicioD;

public class MainD {
    // Ejercicio D - Trabajo Practico 1 - Colaboracion

    public static void main(String[] args) {
        // Instanciar 1 barrio
        Barrio barrio1 = new Barrio(01, "Barrio P. Universitario", "Anderlucci");

        // Instanciar 2 viviendas
        Vivienda vivienda1 = new Vivienda(01, "Saavedra Lamas", 7, 300);
        Vivienda vivienda2 = new Vivienda(02, "Federico Kurtz", 3, 500);

        // Instanciar 6 habitaciones ( 3 para cada vivienda )
        Habitacion habitacion1 = new Habitacion(01, "Dormitorio 1", 15);
        Habitacion habitacion2 = new Habitacion(02, "Dormitorio 2", 15);
        Habitacion habitacion3 = new Habitacion(03, "Living", 40);
        Habitacion habitacion4 = new Habitacion(04, "Dormitorio 1", 30);
        Habitacion habitacion5 = new Habitacion(05, "Dormitorio 2", 30);
        Habitacion habitacion6 = new Habitacion(06, "Living", 55);

        // Se agregan las viviendas al barrio, a traves del metodo agregarVivienda
        barrio1.agregarVivienda(vivienda1);
        barrio1.agregarVivienda(vivienda2);

        // Se agregan las habitaciones a las viviendas, a traves del metodo agregarHabitacion
        vivienda1.agregarHabitacion(habitacion1);
        vivienda1.agregarHabitacion(habitacion2);
        vivienda1.agregarHabitacion(habitacion3);
        vivienda2.agregarHabitacion(habitacion4);
        vivienda2.agregarHabitacion(habitacion5);
        vivienda2.agregarHabitacion(habitacion6);

        //Se muestran los datos del barrio, viviendas y habitaciones
        barrio1.mostrarBarrio();
    }
}
