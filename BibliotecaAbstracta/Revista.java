package BibliotecaAbstracta;

public class Revista extends ItemBiblioteca implements Catalogable {
    private Integer nroEdicion;
    private Integer cantidadEjemplares;
    private String nombreRevista;

    public Revista(Integer nroEdicion, Integer cantidadEjemplares, String nombreRevista) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
    }

    public Revista() {
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNroEdicion(Integer nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void prestar() {
        if (this.cantidadEjemplares > 0) {
            this.cantidadEjemplares = this.cantidadEjemplares - 1;
            System.out.println("Revista " + this.getNombreRevista() + " prestada");
        } else {
            System.out.println("Revista no disponible");
        }
    }

    @Override
    public void devolver() {
        this.cantidadEjemplares = this.cantidadEjemplares + 1;
        System.out.println("Revista" + this.getNombreRevista() + " devuelta");
    }

    @Override
    public void calcularMultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMultas'");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Revista: " + this.getNombreRevista());
        System.out.println("Edicion: " + this.getNroEdicion());
        System.out.println("Ejemplares: " + this.getCantidadEjemplares());
    }

}
