
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Director;

public class DirectorDAOImpl implements DirectorDAO {
    private Connection connection;

    public DirectorDAOImpl() {
        // Inicializar la conexión con la base de datos
    }

    @Override
    public List<Director> dameTodos() {
        List<Director> directores = new ArrayList<>();
        // Aquí implementar la lógica para obtener todos los directores desde la base de datos
        return directores;
    }

    @Override
    public Director buscaPorId(int id) {
        // Aquí implementar la lógica para buscar un director por su ID en la base de datos
    }

    @Override
    public Director buscaPorNombre(String nombre) {
        // Aquí implementar la lógica para buscar un director por su nombre en la base de datos
    }

    @Override
    public void borra(int id) {
        // Aquí implementar la lógica para borrar un director por su ID en la base de datos
    }

    @Override
    public void modifica(Director director) {
        // Aquí implementar la lógica para modificar un director en la base de datos
    }

    @Override
    public void modifica(Director director) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifica'");
    }
}