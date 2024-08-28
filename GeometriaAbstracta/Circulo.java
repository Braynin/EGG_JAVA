package GeometriaAbstracta;

public class Circulo extends FigurasAbs implements Dibujable {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo ...");
        for (Double i = -radio; i <= radio; i++) {
            for (Double j = -radio; j <= radio; j++) {
                if (i * i + j * j <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
