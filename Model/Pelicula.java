package Model;

public class Pelicula {
    private int id;
    private String titulo;
    private int año;
    private Genero genero;
    private boolean animacion;
    private Director director;
    // getters y setters
    public boolean isAnimacion() {
        return animacion;
    }
    public void setAnimacion(boolean animacion) {
        this.animacion = animacion;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}

