import java.util.Scanner;

public class MiPrimerPrograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Holiiii Mundiii OwO");
        String nombre = "Braynin";
        int edad = 28;
        String mensajeBienvenida = "Bienvenido a Javaaaaa!!!!";
        Float temperaturaActual = 19f;
        Boolean datoLogico = true;
        System.out.println("Mi nombre es " + nombre + ", mi edad es " + edad
                + " y bueno, lo que te queria decir es...." + mensajeBienvenida + ", tambien que estamos a "
                + temperaturaActual + " grados y eso es " + datoLogico + " :v");
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Coloca tu edad: ");
        edad = sc.nextInt();
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
        System.out.println("Ingresa el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((float) a / b);
        System.out.println(a % b);
        a += b;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        int resultado = ++a * 2;
        System.out.println(resultado);
        System.out.println(a);
        System.out.println("El numero " + a + " es mayor que " + b + "? " + (a > b));
        System.out.println("El numero " + a + " es distinto de " + b + "? " + (a != b));
        System.out.println("El numero " + b + " es divisible por 2?" + (b % 2 == 0));
        sc.close();
    }
}