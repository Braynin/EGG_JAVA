package BibliotecaAbstracta;

import java.util.Scanner;

public class BibliotecaLibro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Libro[] libros = new Libro[10];
        libros[0] = new Libro("Mario", "Mario y sus amigos", 200);
        libros[1] = new Libro("Hercules", "Hercules y sus amigos", 300);
        libros[2] = new Libro("Cristofe", "Cristofe y sus amigos", 400);
        int opcion = 0;
        do {
            System.out.println("1. Prestar Libro");
            System.out.println("2. Devolver Libro");
            System.out.println("3. Calcular Multas");
            System.out.println("4. Informacion Libros");
            System.out.println("5. Agregar Libro");
            System.out.println("6. Salir");
            System.out.print("Elija una Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---Prestar Libro---");
                    System.out.println("Escoja el Libro: ");
                    for (int i = 0; i < libros.length; i++) {
                        System.out.println((i + 1) + ". " + libros[i].getTitulo());
                    }
                    int indiceLibroPrestado = sc.nextInt() - 1;
                    libros[indiceLibroPrestado].prestar();
                    break;
                case 2:
                    System.out.println("---Devolver Libro---");
                    System.out.println("Escoja el Libro: ");
                    for (int i = 0; i < libros.length; i++) {
                        System.out.println((i + 1) + ". " + libros[i].getTitulo());
                    }
                    int indiceLibroDevuelto = sc.nextInt() - 1;
                    libros[indiceLibroDevuelto].devolver();
                    break;
                case 3:
                    System.out.println("---Calcular Multas---");
                    break;
                case 4:
                    System.out.println("---Informacion Libros---");
                    for (int i = 0; i < libros.length; i++) {
                        libros[i].obtenerInformacion();
                    }
                    break;
                case 5:
                    System.out.println("---Agregar Libro---");
                    System.out.print("Autor: ");
                    String autor = sc.next();
                    System.out.print("Titulo: ");
                    String titulo = sc.next();
                    System.out.print("Nro Paginas: ");
                    Integer nroPaginas = sc.nextInt();
                    libros[libros.length - 1] = new Libro(autor, titulo, nroPaginas);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }
}
