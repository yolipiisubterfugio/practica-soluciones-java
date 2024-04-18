

import java.util.List;

import Model.Pelicula;

public interface PeliculaDAO {
    List<Pelicula> dameTodos();
    Pelicula buscaPorId(int id);
    Pelicula buscaPorTitulo(String titulo);
    void borra(int id);
    void modifica(Pelicula pelicula);
}
