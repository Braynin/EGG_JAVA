class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
    }
}

class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {
    } // Método para imprimir los datos

    public void imprimirDatos() {
        if (marca != null || modelo != null || anio != 0) {
            if (marca != null) {
                System.out.println("Marca: " + marca);
            }
            if (modelo != null) {
                System.out.println("Modelo: " + modelo);
            }
            if (anio != 0) {
                System.out.println("Año: " + anio);
            }
        } else {
            System.out.println("No se ha inicializado ningún dato del auto.");
        }
    }
}

public class POO {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Braynin", 28);
        persona1.imprimirDatos();

        Auto auto1 = new Auto("Toyota", "Corolla", 2022);
        auto1.imprimirDatos();

        Auto auto2 = new Auto("Nissan");
        auto2.imprimirDatos();

        Auto auto3 = new Auto();
        auto3.imprimirDatos();

        Auto auto4 = new Auto("Nissan", "Sentra");
        auto4.imprimirDatos();

    }
}
