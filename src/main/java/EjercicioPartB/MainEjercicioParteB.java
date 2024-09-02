package EjercicioPartB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainEjercicioParteB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear Medicos
        Medico medico1 = new Medico(510, "Andrea","Gonzalez",42568756,
                                    new Domicilio(13,"Guaymallén","Adolfo Calle",567),22,4695,261596548);

        medico1.setEspecialidades(new ArrayList<>(Arrays.asList(new Especialidad(102,"Obstetricia"),
                                                                new Especialidad(104,"Ginecología"))));

        Medico medico2 = new Medico(513, "Belen","Martinez",425698756,
                                    new Domicilio(12,"Ciudad","Pellegrini",1023),21,5897,261587963);

        medico2.setEspecialidades(new ArrayList<>(Arrays.asList(new Especialidad(101,"Pediatría"))));

        //Crear Empleado
        Empleado empleado1 = new Empleado(512, "Hector","Muñoz",23654897,
                                        new Domicilio(13,"Guaymallén","Adolfo Calle",567),33,654,450000);

        // Crear Pacientes
        Paciente paciente1 = new Paciente(511, "Jorge", "Perez",35897145,
                                        new Domicilio(10,"Las Heras","Burgos",330),316,69548574);
        paciente1.setHistoriaClinica(new HistoriaClinica(621,85,new Date(22,8,25),
                                          (new ArrayList<>(Arrays.asList(
                                                new DetalleHistoriaClinica(1023, new Date(18,11,9),"Dificultad respiratoria","Asma Estacional","Ninguno"),
                                                new DetalleHistoriaClinica(1024, new Date(19,11,12),"Sangrado en la garganta","Bronquitis","Ninguno"))))));


        Paciente paciente2 = new Paciente(514, "Susana", "Celan",14756897,
                                        new Domicilio(14,"Ciudad","Peru",1065),322,69854231);
        paciente2.setHistoriaClinica(new HistoriaClinica(624,87,new Date(20,6,25),
                (new ArrayList<>(Arrays.asList(
                        new DetalleHistoriaClinica(1027, new Date(20,3,9),"Preción Alta","Preclampsia","Ninguno"))))));


        // Crear instancia de Turno
        Turno turno1 = new Turno(5624, new Date(24,03,24), 18, 00, medico1, paciente1);
        Turno turno2 = new Turno(5624, new Date(24,03,24), 10, 30, medico2, paciente2);


        // Menú
        int option = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar datos de Personal");
            System.out.println("2. Mostrar datos Pacienetes");
            System.out.println("3. Mostrar Turnos");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Mostrar datos de Personal
                    System.out.println("PERSONAL CLINICA--------------------");
                    System.out.println(empleado1.toString());
                    System.out.println("------------------------------");
                    System.out.println(medico1.toString());
                    System.out.println("------------------------------");
                    System.out.println(medico2.toString());
                    break;
                case 2:
                    // Mostrar datos Paciente
                    System.out.println("PACIENTES CLINICA--------------------");
                    System.out.println(paciente1.toString());
                    System.out.println("------------------------------");
                    System.out.println(paciente2.toString());

                    break;
                case 3:
                    // Mostrar turnos
                    System.out.println("TURNOS--------------------");
                    System.out.println(turno1.toString());
                    System.out.println("------------------------------");
                    System.out.println(turno2.toString());

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (option != 4);

        scanner.close();
    }

}
