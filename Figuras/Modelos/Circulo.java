package Figuras.Modelos;

public class Circulo {
    public Double radio;

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

    public Double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public Double circunferencia() {
        return 2 * Math.PI * this.radio;
    }

    public String imprimeDatos() {
        return "Circulo [radio=" + radio + "]\n** Area: " + area() + "\n** Circunferencia: " + circunferencia();
    }
}
