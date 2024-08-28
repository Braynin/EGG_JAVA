package GeometriaAbstracta;

public class Triangulo extends FigurasAbs implements Dibujable {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public Double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public Double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo ...");
        if (esTrianguloValido(lado1, lado2, lado3)) {
            for (int i = 0; i < lado2; i++) {
                System.out.println("*");
            }

            // Dibujar la hipotenusa (lado c) y el cateto horizontal (lado a)
            for (int i = 0; i < lado1; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        System.out.print("  ");
                    }
                    if (j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo válido.");
        }
    }

    public boolean esTrianguloValido(Double lado1, Double lado2, Double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

}
