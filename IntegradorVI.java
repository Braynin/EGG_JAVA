import java.util.ArrayList;
import java.util.Scanner;

public class IntegradorVI {
    public static ArrayList<String> nombres = new ArrayList<>();
    public static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            mostrarMenu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    registrarAlumno(sc);
                    break;

                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (option != 7);
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
}
