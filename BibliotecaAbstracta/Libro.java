package BibliotecaAbstracta;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String autor;
    private String titulo;
    private Integer nroPaginas;

    public Libro(String autor, String titulo, Integer nroPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public void prestar() {
        System.out.println("Libro " + this.getTitulo() + " prestado");
    }

    @Override
    public void devolver() {
        System.out.println("Libro " + this.getTitulo() + " devuelto");
    }

    @Override
    public void calcularMultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMultas'");
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Libro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Paginas: " + this.getNroPaginas());
    }

}
