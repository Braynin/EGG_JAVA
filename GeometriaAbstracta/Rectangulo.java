package GeometriaAbstracta;

public class Rectangulo extends FigurasAbs implements Dibujable {

    private Double ancho;
    private Double alto;

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public Double area() {
        return this.alto * this.ancho;
    }

    @Override
    public Double perimetro() {
        return 2 * (this.alto + this.ancho);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo ...");
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho -

                        1) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
