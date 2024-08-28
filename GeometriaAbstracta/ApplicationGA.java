package GeometriaAbstracta;

public class ApplicationGA {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(15.0);
        circulo1.dibujar();
        circulo1.area();
        circulo1.perimetro();

        Triangulo triangulo1 = new Triangulo(3.0, 4.0, 5.0);
        triangulo1.dibujar();
        triangulo1.area();
        triangulo1.perimetro();

        Rectangulo rectangulo1 = new Rectangulo(2.0, 3.0);
        rectangulo1.dibujar();
        rectangulo1.area();
        rectangulo1.perimetro();

    }
}
