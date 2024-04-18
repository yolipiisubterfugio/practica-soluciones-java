


import java.util.List;

import Model.Director;

public interface DirectorDAO {
    List<Director> dameTodos();
    Director buscaPorId(int id);
    Director buscaPorNombre(String nombre);
    void borra(int id);
    void modifica(Director director);
}