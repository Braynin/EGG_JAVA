package Figuras.Modelos;

public class Triangulo {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double area() {
        return (this.base * this.altura) / 2;
    }

    public String imprimeDatos() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]\n** Area: " + area();
    }
}
