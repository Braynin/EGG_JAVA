import java.util.Scanner;

public class Integrador1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Holi bro, dame un numerito pa analizarlo UwU --> ");
                int numero = sc.nextInt();
                System.out.println(
                                "Vamo a versh si tu numerito es par papu OwO --> " + (numero % 2 == 0
                                                ? "a wevo , si es par oniichan!!"
                                                : "chamare, no era par y si querias que fuera impar ps bien por ti oniichan UwU!!"));

                System.out.print("Holiwis brou, dame tu primer numerito porfis --> ");
                Integer num1 = sc.nextInt();
                if (num1 instanceof Integer) {
                        System.out.print("Arigatou oniichan, ahora no pares y dame el segundo oniichan UwU --> ");
                        int num2 = sc.nextInt();
                        System.out.println(
                                        "Weno, ahora que? :v , dime que hacer oniichan!!! UnU -->\n1 -- Sumar\n2 -- Restar\n3 -- Multiplicar\n4 -- Dividir");
                        int operacion = sc.nextInt();
                        if (operacion == 4)
                                if (num2 == 0) {
                                        System.out.println("chamare, no se puede dividir por 0 oniichan!!");
                                        System.exit(0);
                                } else
                                        System.out.print(
                                                        "Aversh!! segun lo que me pediste, el resultado de la division");
                        else
                                System.out.print("Aversh!! segun lo que me pediste, el resultado de la "
                                                + (operacion == 1 ? "suma"
                                                                : (operacion == 2 ? "resta"
                                                                                : "multiplicacion")));
                        System.out.println(" es " + (operacion == 1 ? num1 + num2
                                        : (operacion == 2 ? num1 - num2
                                                        : (operacion == 3 ? num1 * num2 : num1 / num2))));
                } else {
                        System.out.println(
                                        "Escribe un numero porfis, no se puede realizar ninguna operacion sin numeros UnU");
                }
                sc.close();
        }
}