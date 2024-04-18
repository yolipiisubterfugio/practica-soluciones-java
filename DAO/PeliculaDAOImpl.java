
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Pelicula;

public class PeliculaDAOImpl implements PeliculaDAO {
    private Connection connection;

    public PeliculaDAOImpl() {
        // Inicializar la conexión con la base de datos
    }

    @Override
    public List<Pelicula> DAO, PeliculaDAOImpl.dameTodos() {
        List<Pelicula> peliculas = new ArrayList<>();
        // Aquí implementar la lógica para obtener todas las películas desde la base de datos
        return peliculas;
    }

    @Override
    public Pelicula buscaPorId(int id) {
        // Aquí implementar la lógica para buscar una película por su ID en la base de datos
    }

    @Override
    public Pelicula buscaPorTitulo(String titulo) {
        // Aquí implementar la lógica para buscar una película por su título en la base de datos
    }

    @Override
    public void borra(int id) {
        // Aquí implementar la lógica para borrar una película por su ID en la base de datos
    }

    @Override
    public void modifica(Pelicula pelicula) {
        // Aquí implementar la lógica para modificar una película en la base de datos
    }

    @Override
    public List<Pelicula> dameTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dameTodos'");
    }
}