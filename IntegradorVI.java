import java.util.ArrayList;
import java.util.Scanner;

public class IntegradorVI {
    public static ArrayList<String> nombres = new ArrayList<>();
    public static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int option;
            do {
                mostrarMenu();
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        registrarAlumno(sc);
                        break;
                    case 2:
                        mostrarAlumnos();
                        break;
                    case 3:
                        promedioNotas();
                        break;
                    case 4:
                        buscarAlumno(sc);
                        break;
                    case 5:
                        modificarNota(sc);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción inválida, fuera del rango. Intente nuevamente.");
                        break;
                }
            } while (option != 7);
        } catch (Exception InputMismatchException) {
            System.out.println("Ingrese un valor numerico entre 1 y 7");
            main(args);
        }

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu de Opciones:");
        System.out.println("1. Registrar Alumno");
        System.out.println("2. Mostrar Alumnos");
        System.out.println("3. Mostrar Promedio de Notas");
        System.out.println("4. Buscar Alumno");
        System.out.println("5. Modificar Nota");
        System.out.println("6. Eliminar Alumno");
        System.out.println("7. Salir");
        System.out.print("Seleccione una Opcion:");
    }

    private static void registrarAlumno(Scanner sc) {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío, ingrese el nombre correctamente:");
            registrarAlumno(sc);
        }

        System.out.print("Ingrese la nota del alumno: ");
        try {
            double nota;
            do {
                nota = Double.parseDouble(sc.nextLine());
                if (nota < 0.0 || nota > 10.0) {
                    System.out.print("La nota debe estar entre 0.00 y 10.00, ingrese la nota correctamente:");
                }
            } while (nota < 0.0 || nota > 10.0);
            nombres.add(nombre);
            notas.add(nota);
            System.out.println("Alumno registrado correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("La nota debe ser un número válido.");
        }
    }

    public static void mostrarAlumnos() {
        System.out.println("Listado de Alumnos:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i) + " - " + notas.get(i));
        }
    }

    public static void promedioNotas() {
        System.out.print("Promedio de Notas:");
        double suma = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }
        System.out.println(suma / notas.size());
    }

    public static void buscarAlumno(Scanner sc) {
        System.out.println("Ingrese el nombre del alumno a buscar: ");
        String nombre = sc.nextLine();
        if (nombres.contains(nombre)) {
            int index = nombres.indexOf(nombre);
            System.out.println("La nota del alumno es: " + notas.get(index));
        } else {
            System.out.println("El alumno no se encuentra registrado.");
        }
    }

    public static void modificarNota(Scanner sc) {
        System.out.println("Ingrese el nombre del alumno a modificar: ");
        String nombre = sc.nextLine();
        if (nombres.contains(nombre)) {
            int index = nombres.indexOf(nombre);
            System.out.println("Ingrese la nueva nota: ");
            double nuevaNota = Double.parseDouble(sc.nextLine());
            notas.set(index, nuevaNota);
            System.out.println("Nota modificada correctamente.");
        } else {
            System.out.println("El alumno no se encuentra registrado.");
        }
    }
}
