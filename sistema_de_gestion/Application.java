package sistema_de_gestion;

import java.util.Arrays;

import sistema_de_gestion.Modelos.Empleado;

public class Application {

    public static void main(String[] args) {
        Empleado[] empleados = {
                new Empleado("Pedro", 30, 2000.0, "Ventas"),
                new Empleado("Maria", 28, 1500.0, "RRHH"),
                new Empleado("Juan", 35, 3000.0, "Contabilidad"),
                new Empleado("Lucia", 32, 2500.0, "Compras"),
                new Empleado("Pedro", 30, 2000.0, "Ventas"),
        };

        mostrarEmpleados(empleados);
    }

    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.println("\n----------------------------------------");
        System.out.println("| No | Nombre         | Edad | Salario | Departamento  |");
        System.out.println("----------------------------------------");
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("| %2d | %-14s | %4d | %7.2f | %-12s |\n", (i + 1), empleados[i].getNombre(),
                    empleados[i].getEdad(), empleados[i].getSalario(), empleados[i].getDepartamento());
        }
        System.out.println("----------------------------------------");
    }

    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String filtro, String valor) {
        Empleado[] empleadosFiltrados = new Empleado[empleados.length];
        int contador = 0;
        switch (filtro.toLowerCase()) {
            case "nombre":
                for (int i = 0; i < empleados.length; i++) {
                    if (empleados[i].getNombre().equals(valor)) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            case "edad":
                for (int i = 0; i < empleados.length; i++) {
                    if (empleados[i].getEdad() == Integer.parseInt(valor)) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;
            case "salario":
                for (int i = 0; i < empleados.length; i++) {
                    if (empleados[i].getSalario() == Double.parseDouble(valor)) {
                        empleadosFiltrados[contador] = empleados[i];

                        break;
                    }
                }

            case "departamento":
                for (int i = 0; i < empleados.length; i++) {
                    if (empleados[i].getDepartamento().equals(valor)) {
                        empleadosFiltrados[contador] = empleados[i];
                        contador++;
                    }
                }
                break;

            default:
                break;
        }
    }
}
