package BibliotecaAbstracta;

import java.util.Scanner;

public class BibliotecaRevista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Revista[] revistas = new Revista[3];
        revistas[0] = new Revista(1, 10, "Revista 1");
        revistas[1] = new Revista(2, 20, "Revista 2");
        revistas[2] = new Revista(3, 30, "Revista 3");
        int opcion = 0;
        do {
            System.out.println("1. Prestar Revista");
            System.out.println("2. Devolver Revista");
            System.out.println("3. Calcular Multas");
            System.out.println("4. Informacion Revistas");
            System.out.println("5. Salir");

            System.out.print("Elija una Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---Prestar Revista---");
                    System.out.print("Escoja la Revista: ");
                    int indiceRevistaPrestada = sc.nextInt() - 1;
                    revistas[indiceRevistaPrestada].prestar();
                    break;
                case 2:
                    System.out.println("---Devolver Revista---");
                    System.out.print("Escoja la Revista: ");
                    int indiceRevistaDevuelta = sc.nextInt() - 1;
                    revistas[indiceRevistaDevuelta].devolver();
                    break;
                case 3:
                    System.out.println("---Calcular Multas---");
                    break;
                case 4:
                    System.out.println("---Informacion Revistas---");
                    for (int i = 0; i < revistas.length; i++) {
                        revistas[i].obtenerInformacion();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

        sc.close();
    }
}
