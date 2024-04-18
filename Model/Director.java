package Model;

public class Director {
    private int id;
    private String nombre;
    private String urlImagen;
    private String urlWeb;
    // getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUrlImagen() {
        return urlImagen;
    }
    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    public String getUrlWeb() {
        return urlWeb;
    }
    public void setUrlWeb(String urlWeb) {
        this.urlWeb = urlWeb;
    }
}