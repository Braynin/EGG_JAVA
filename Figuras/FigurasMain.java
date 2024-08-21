package Figuras;

import java.util.Scanner;
import java.util.InputMismatchException;
import Figuras.Modelos.Circulo;
import Figuras.Modelos.Triangulo;
import Figuras.Modelos.Rectangulo;

public class FigurasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        try {
            do {
                System.out.println("\nElija una figura:");
                System.out.println("1. Circulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Rectangulo");
                System.out.println("4. Salir");
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Ingresa el radio:");
                        double radio = sc.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        System.out.println(circulo.imprimeDatos());
                        break;
                    case 2:
                        System.out.println("Ingresa la base:");
                        double base = sc.nextDouble();
                        System.out.println("Ingresa la altura:");
                        double altura = sc.nextDouble();
                        Triangulo triangulo = new Triangulo(base, altura);
                        System.out.println(triangulo.imprimeDatos());
                        break;
                    case 3:
                        System.out.println("Ingresa el ancho:");
                        double ancho = sc.nextDouble();
                        System.out.println("Ingresa el alto:");
                        double alto = sc.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(ancho, alto);
                        System.out.println(rectangulo.imprimeDatos());
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida, intente de nuevo");
                        break;
                }

            } while (option != 4);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ser un numero");
        }

        sc.close();
    }
}