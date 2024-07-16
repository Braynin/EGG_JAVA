import java.util.Scanner;

public class Bucles2 {

    public static void main(String[] args) {
        ContadorParImpar(args);
        /* TablaMultiplicar(args); */
        /* ContarDigitos(args); */
        /* AdivinaNumero(args); */
        /* listOptions(args); */
    }

    public static void ContadorParImpar(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "A continuacion ingresaras todos los numeros y nosotros los contaremos por pares e impares.\n(Para terminar presiona 0)");
        int numero = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        do {
            System.out.print("Ingresa un número: ");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
        } while (numero != 0);
        System.out.println("La cantidad de pares es: " + contadorPar + "\nLa cantidad de impares es: " + contadorImpar);
        sc.close();
    }

    public static void TablaMultiplicar(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero, el cual sera la base de la tabla: ");
        int numero = sc.nextInt();
        int numero2 = 0;
        do {
            System.out.println("Ingresa un número entero para multiplicar: ");
            numero2 = sc.nextInt();
            int resultado = numero * numero2;
            System.out.println(numero + " x " + numero2 + " = " + resultado);
        } while (numero2 != 0);
        sc.close();
    }

    public static void ContarDigitos(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        int numeroAbsoluto = Math.abs(numero);
        if (numeroAbsoluto == 0) {
            System.out.println("El número 0 tiene 1 dígito.");
        } else {
            int cantidadDigitos = 0;
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10;
                cantidadDigitos++;
            }
            System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        }

        sc.close();
    }

    public static void AdivinaNumero(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * (20 - 1 + 1) + 1);
        int guess;
        do {
            System.out.println("Ingresa un numero entre 1 y 20 para adivinar");
            guess = sc.nextInt();
            if (guess < random) {
                System.out.println("Tu numero es menor, ingresa uno mas alto");
            } else if (guess > random) {
                System.out.println("Tu numero es mayor. ingresa uno mas bajito");
            } else {
                System.out.println("Ganaste, el numero es: " + random);
                break;
            }
        } while (guess != random);
        sc.close();
    }

    public static void listOptions(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println(
                    "Elija la opcion que desee: \n 1. Comprar producto. \n 2. Realizar devolucion. \n 3. Ver mis pedidos. \n 4. Preguntas frecuentes. \n 5. Salir.");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Comprando");
                    break;
                case 2:
                    System.out.println("Realizando devolución");
                    break;
                case 3:
                    System.out.println("Ver mis pedidos");
                    break;
                case 4:
                    System.out.println("Preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (option < 1 || option > 5);
        sc.close();
    }

}
