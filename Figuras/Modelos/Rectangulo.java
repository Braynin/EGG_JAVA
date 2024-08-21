package Figuras.Modelos;

public class Rectangulo {
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

    public Double area() {
        return this.alto * this.ancho;
    }

    public Double perimetro() {
        return 2 * (this.alto + this.ancho);
    }

    public String imprimeDatos() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]\n** Area: " + area() + "\n** Perimetro: "
                + perimetro();
    }
}
