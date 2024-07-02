import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Holi bro, dame un numerito pa analizarlo UwU --> ");
        int numero = sc.nextInt();
        System.out.println(
                "Vamo a versh si tu numerito es par papu OwO --> " + (numero % 2 == 0 ? "a wevo , si es par oniichan!!"
                        : "chamare, no era par y si querias que fuera impar ps bien por ti oniichan UwU!!"));

        System.out.print("Holiwis brou, dame tu primer numerito porfis --> ");
        int num1 = sc.nextInt();
        System.out.print("Arigatou oniichan, ahora no pares y dame el segundo oniichan UwU --> ");
        int num2 = sc.nextInt();
        System.out.println(
                "Weno, ahora que? :v , dime que hacer oniichan!!! UnU -->\n1 -- Sumar\n2 -- Restar\n3 -- Multiplicar\n4 -- Dividir");
        int operacion = sc.nextInt();
        System.out.println("Aversh!! segun lo que me pediste, el resultado de la "
                + (operacion == 1 ? "suma"
                        : (operacion == 2 ? "resta" : (operacion == 3 ? "multiplicacion" : "division")))
                + " es " + (operacion == 1 ? num1 + num2
                        : (operacion == 2 ? num1 - num2 : (operacion == 3 ? num1 * num2 : num1 / num2))));
        sc.close();
    }
}